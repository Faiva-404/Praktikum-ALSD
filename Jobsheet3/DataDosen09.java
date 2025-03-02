package Jobsheet3;

public class DataDosen09 {
    public void dataSemuaDosen(Dosen09[] arrayOfDosen09) {
        for(Dosen09 dosen : arrayOfDosen09) {
            dosen.cetakInfo();
            System.out.println("-------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen09) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen09 dosen09 : arrayOfDosen09) {
            if (dosen09.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria     : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita :");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen09) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen09 dosen09 : arrayOfDosen09) {
            if (dosen09.jenisKelamin) {
                totalUsiaPria += dosen09.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen09.usia;
                jumlahWanita++;
            }
        }
        double rataUsiaPria = (jumlahPria == 0) ? 0 : (double) totalUsiaPria / jumlahPria;
        double rataUsiaWanita = (jumlahWanita == 0) ? 0 : (double) totalUsiaWanita / jumlahWanita;
        System.out.println("Rata-rata Usia Dosen Pria   : " + rataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataUsiaWanita);
    }

    public void infoDosenPalingTua(Dosen09[] arrayOfDosen09) {
        if (arrayOfDosen09.length == 0) return;
        Dosen09 dosenPalingTua = arrayOfDosen09[0];
        for (Dosen09 dosen09 : arrayOfDosen09) {
            if (dosen09.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen09;
            }
        }
        System.out.println("Dosen Paling Tua :");
        dosenPalingTua.cetakInfo();
        System.out.println("----------------------------------");
    }

    public void infoDosenPalingMuda(Dosen09[] arrayOfDosen09) {
        if (arrayOfDosen09.length == 0) return;
        Dosen09 dosenPalingMuda = arrayOfDosen09[0];
        for (Dosen09 dosen09 : arrayOfDosen09) {
            if (dosen09.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen09;
            }
        }    
        System.out.println("Dosen Paling Muda :");
        dosenPalingMuda.cetakInfo();
        System.out.println("---------------------------------");
    }
}
