/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpro5;
/**
 *
 * @author algi
 */
public class linkedList {
    private Node head;

    public linkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List kosong gmn dong");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    public void removedMid(int e) {
        Node preNode = null;
        Node tempNode;
        boolean dapet = false;

        if (isEmpty()) {
            System.out.println("Elemen list-nya kosong nih");
        } else {
            tempNode = head;
            while (tempNode != null && !dapet) {
                if (tempNode.getNilai() == e) {
                    dapet = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                }
            }

            if (dapet) {
                dispose(tempNode, preNode);
            } else {
                System.out.println("Elemen tidak ditemukan");
            }
        }
    }

    private void dispose(Node node, Node prevNode) {
        if (prevNode == null) {
            head = node.getNext();
        } else {
            prevNode.setNext(node.getNext());
        }   
        node = null;
    }
}