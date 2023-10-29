/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan21_programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO21
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Program Rata-Rata Nilai
 */
public class SI_RegPagi_22166010_Latihan21_ProgramRataRataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int banyakMahasiswa = input.nextInt();
        
        // Inisialisasi variabel untuk menghitung total nilai
        double total = 0;
        
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            
            // Tambahkan nilai ke total
            total += nilai;
        }
        
        // Hitung rata-rata
        double rataRata = total / banyakMahasiswa;
        
        // Tampilkan rata-rata
        System.out.println("Maka Rata-rata Nilainya adalah: " + rataRata);
        
        // Tutup scanner
        input.close();
    }
    
}
