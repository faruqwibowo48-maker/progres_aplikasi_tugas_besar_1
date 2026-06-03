package pyscare;

public class Konselor {
    private String idKonselor;
    private String namaKonselor;
    private String spesialisasi;

    // Constructor
    public Konselor(String idKonselor, String namaKonselor, String spesialisasi) {
        this.idKonselor = idKonselor;
        this.namaKonselor = namaKonselor;
        this.spesialisasi = spesialisasi;
    }

    // Getter dan Setter
    public String getIdKonselor() {
        return idKonselor;
    }

    public void setIdKonselor(String idKonselor) {
        this.idKonselor = idKonselor;
    }

    public String getNamaKonselor() {
        return namaKonselor;
    }

    public void setNamaKonselor(String namaKonselor) {
        this.namaKonselor = namaKonselor;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
}