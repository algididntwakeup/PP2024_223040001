/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpro6;

/**
 *
 * @author alzxi
 */
public class listMKtest {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.displayElement();
    }
}
