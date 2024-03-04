/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author alzxi
 */
import java.util.Scanner;

public class TotalBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mintain pengguna buat memasukkan nilai N
        System.out.print("Input N: ");
        int N = scanner.nextInt();

        // Jika N kurang dari atau 0, cetak pesan dan total = 0
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            System.out.println("total = 0");
        } else {
            // Jika N lebih besar dari 0, inisialisasi total dengan 0
            int total = 0;

            // Meminta pengguna untuk memasukkan N bilangan dan menghitung totalnya
            for (int i = 0; i < N; i++) {
                System.out.print("Input bilangan ke-" + (i + 1) + ": ");
                int bilangan = scanner.nextInt();
                total += bilangan;
            }

            // Cetak total
            System.out.println("total = " + total);
        }

        // Menutup scanner
        scanner.close();
    }
}