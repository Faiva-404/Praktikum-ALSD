package Jobsheet14;

public class BinaryTreeArray09 {
    Mahasiswa09[] dataMahasiswa09;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa09 = new Mahasiswa09[10];
    }

    void populateData (Mahasiswa09 dataMhs[], int idxLast) {
        this.dataMahasiswa09 = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa09[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa09[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2); 
                
            }
        }
    }
}
