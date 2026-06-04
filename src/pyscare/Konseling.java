package pyscare;

public class Konseling {
    private String idKonseling;
    private Pasien pasien;      
    private Konselor konselor;  
    private String tanggal;
    private String catatanMedis;

  
    public Konseling(String idKonseling, Pasien pasien, Konselor konselor, String tanggal, String catatanMedis) {
        this.idKonseling = idKonseling;
        this.pasien = pasien;
        this.konselor = konselor;
        this.tanggal = tanggal;
        this.catatanMedis = catatanMedis;
    }

   
    public void tampilkanDetailKonseling() {
        System.out.println("========= DETAIL TRANSAKSI KONSELING =========");
        System.out.println("ID Konseling    : " + idKonseling);
        System.out.println("Tanggal         : " + tanggal);
        System.out.println("----------------------------------------------");
        System.out.println("DATA PASIEN:");
        System.out.println("  ID Pasien     : " + pasien.getIdPasien());
        System.out.println("  Nama Pasien   : " + pasien.getNama());
        System.out.println("  Umur          : " + pasien.getUmur() + " Tahun");
        System.out.println("  Keluhan       : " + pasien.getKeluhanUtama());
        System.out.println("----------------------------------------------");
        System.out.println("DATA KONSELOR:");
        System.out.println("  ID Konselor   : " + konselor.getIdKonselor());
        System.out.println("  Nama Spesialis: " + konselor.getNamaKonselor());
        System.out.println("  Spesialisasi  : " + konselor.getSpesialisasi());
        System.out.println("----------------------------------------------");
        System.out.println("Catatan Hasil   : " + catatanMedis);
        System.out.println("==============================================\n");
    }

   
    public String getIdKonseling() {
        return idKonseling;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Konselor getKonselor() {
        return konselor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getCatatanMedis() {
        return catatanMedis;
    }
}