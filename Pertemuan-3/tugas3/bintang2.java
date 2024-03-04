/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author alzxi
 */
public class bintang2 {
     public static void main(String[] args) {
        int rows = 4; // jumlah baris, sesuaikan dengan pola yang diinginkan

        // loop untuk setiap baris
        for (int i = 0; i < rows; i++) {
            // loop untuk setiap kolom pada setiap baris
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            // pindah ke baris baru setelah setiap baris selesai di-print
            System.out.println();
        }
    }
}
