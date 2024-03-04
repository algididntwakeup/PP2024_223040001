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

public class IndeksNilaiMatkul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nilai = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nilai " + (i + 1) + ": ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Nilai belum diisi");
                nilai[i] = -1; // Tandai nilai belum diisi
            } else {
                try {
                    nilai[i] = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan nilai bulat.");
                    i--; // Ulangi iterasi jika input tidak valid
                }
            }
        }

        System.out.println("\nNo\tInput\tOutput");
        System.out.println("-----------------------------------");

        for (int i = 0; i < 4; i++) {
            if (nilai[i] == -1) {
                System.out.println((i + 1) + "\t\tNilai belum diisi");
                continue; // Skip ke iterasi berikutnya
            }

            System.out.print((i + 1) + "\t" + nilai[i] + "\t");

            if (nilai[i] >= 0 && nilai[i] <= 100) {
                if (nilai[i] >= 81) {
                    System.out.println("A");
                } else if (nilai[i] >= 76) {
                    System.out.println("AB");
                } else if (nilai[i] >= 56) {
                    System.out.println("B");
                } else if (nilai[i] >= 51) {
                    System.out.println("BC");
                } else if (nilai[i] >= 41) {
                    System.out.println("C");
                } else if (nilai[i] >= 21) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            } else {
                System.out.println("Nilai di luar jangkauan");
            }
        }

        scanner.close();
    }
}

