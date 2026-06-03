package pyscare;

public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Data Pasien (Simulasi Input dari Aplikasi Mobile)
        Pasien pasien1 = new Pasien("P001", "Andi Pratama", 21, "Kecemasan akademik berat menjelang kelulusan");
        Pasien pasien2 = new Pasien("P002", "Siti Aminah", 24, "Insomnia kronis akibat stress kerja");

        // 2. Inisialisasi Data Konselor/Dokter yang tersedia
        Konselor psikolog1 = new Konselor("D001", "Dr. Dian S., M.Psi", "Anxiety & Stress Management");
        Konselor psikolog2 = new Konselor("D002", "Budi Raharjo, S.Psi", "Gangguan Tidur & Mood");

        // 3. Menghubungkan relasi di tabel transaksi Konseling (Simulasi ERD)
        Konseling sesi1 = new Konseling(
            "C-2026-001", 
            pasien1, 
            psikolog1, 
            "26 Mei 2026", 
            "Diberikan teknik relaksasi 4-7-8 dan disarankan konseling lanjutan minggu depan."
        );

        Konseling sesi2 = new Konseling(
            "C-2026-002", 
            pasien2, 
            psikolog2, 
            "26 Mei 2026", 
            "Cognitive Behavioral Therapy (CBT) sesi pertama untuk memperbaiki pola tidur."
        );

        // 4. Menampilkan Output Log ke Console NetBeans
        System.out.println("SMART MENTAL HEALTH CLINIC SYSTEM LOG\n");
        sesi1.tampilkanDetailKonseling();
        sesi2.tampilkanDetailKonseling();
    }
}
