package pyscare;

public class Pasien {
    private String idPasien;
    private String nama;
    private int umur;
    private String keluhanUtama;
    public Pasien(String idPasien, String nama, int umur, String keluhanUtama) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.keluhanUtama = keluhanUtama;
    }
    
    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getKeluhanUtama() {
        return keluhanUtama;
    }

    public void setKeluhanUtama(String keluhanUtama) {
        this.keluhanUtama = keluhanUtama;
    }
}