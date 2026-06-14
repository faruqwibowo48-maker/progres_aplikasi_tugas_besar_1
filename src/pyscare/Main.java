package pyscare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthService();
        System.out.println("=== LOGIN SISTEM KLINIK ===");
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        if (!auth.login(username, password)) {
            System.out.println("Login gagal! Username atau password salah.");
            return;
        }
        System.out.println("\nLogin berhasil!\n");
        Pasien pasien1 = new Pasien(null, null, 0, null);
        Pasien pasien2 = new Pasien(null, null, 0, null);
        Konselor psikolog1 = new Konselor(null, null, null);
        Konselor psikolog2 = new Konselor(null, null, null);
        Konseling sesi1 = new Konseling(
                null,
                pasien1,
                psikolog1,
                null,
                null
        );
        Konseling sesi2 = new Konseling(
                null,
                pasien2,
                psikolog2,
                null,
                null
        );
        System.out.println("SMART MENTAL HEALTH CLINIC SYSTEM LOG\n");
        sesi1.tampilkanDetailKonseling();
        sesi2.tampilkanDetailKonseling();
    }
}