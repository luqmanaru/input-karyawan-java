import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, alamat, jabatan;
        int usia, gaji;

        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke pengguna
        System.out.println("Data Karyawan PT. Sukses Selalu");

        System.out.print("Nama karyawan: ");
        nama = keyboard.nextLine();

        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();

        System.out.print("Jabatan: ");
        jabatan = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = Integer.parseInt(keyboard.nextLine());

        System.out.print("Gaji: ");
        gaji = Integer.parseInt(keyboard.nextLine());

        // Menampilkan hasil input
        System.out.println("----------------------------------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Usia          : " + usia + " tahun");
        System.out.println("Gaji          : Rp " + gaji);
        System.out.println("----------------------------------------------");
    }
}
