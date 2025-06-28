package Jobsheet14;

public class BinaryTree09 {
    Node09 root;

    public BinaryTree09() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa09 mahasiswa09) {
        Node09 newNode = new Node09(mahasiswa09);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node09 current = root;
            Node09 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa09.ipk < current.data.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node09 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node09 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.tampilInformasi();
        }
    }

    Node09 getSuccessor(Node09 del) {
        Node09 successor = del.right;
        Node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data.ipk == ipk) {
                break;
            } else if (ipk < current.data.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else 
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                     parent.right = null;
                    }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else {
                Node09 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.data.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    //Tugas 1
    public void addRekursif(Mahasiswa09 data) {
        root = addRekursif(root, data);
    }

    private Node09 addRekursif(Node09 current, Mahasiswa09 data) {
        if (current == null) {
            return new Node09(data);
        }
        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    //Tugas 2
    public Mahasiswa09 cariMinIPK() {
        if (root == null) return null;
        Node09 current = root;
        while (current.left != null) {
            current = current.left; 
        }
        return current.data;
    }

    public Mahasiswa09 cariMaxIPK() {
        if (root == null) return null;
        Node09 current = root;
        while (current.right != null) {
            current = current.right; 
        }
        return current.data;
    }


    //Tugas 3
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
        }

    private void tampilMahasiswaIPKdiAtas(Node09 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.data.ipk > ipkBatas) {
                node.data.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
