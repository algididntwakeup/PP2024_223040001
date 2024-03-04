/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpro5;

/**
 *
 * @author algi
 */

public class NodeMain {
    public static void main(String[] args) {
        // kita buat objek linkedlist teman teman
        linkedList list = new linkedList();

        // Menambahkan elemen ke linked list
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        // terus muncilin elemen linked list sebelum dihapus
        System.out.println();
        list.display();

        // ini ngilangin elemen 3 di tengah list
        list.removedMid(3);

        // terus yang ini munculin elemen linked list setelah penghapusan
        System.out.println();
        list.display();
    }
}