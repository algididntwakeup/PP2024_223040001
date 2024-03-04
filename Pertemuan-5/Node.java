/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpro5;

/**
 *
 * @author algi 
 */
public class Node {
    private int nilai;
    private Node next;

    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    public int getNilai() {
        return nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}