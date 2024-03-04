/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author muhammad al ghifari
 */
public class lat1 {
    private int data;
    private lat1 next;
//    kalo mau setter getter jan lupa deklarasiin variabelnya dulu
    private String nama;
    private static lat1 HEAD;

    
    //inisialisasi atribut node
    public lat1(int data){
        this.data = data;
    }
    
//    setter n getter
      public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
    return nama;
    }
    
    
//    addTail
    public void addTail(int data) {
        lat1 posNode = null, curNode = null;
        lat1 newNode = new lat1(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    
    public void displayElement(){
        lat1 curNode = HEAD;
        while (curNode != null){
        System.out.print(curNode.getData()+ " ");
        curNode = curNode.getNext();
        }
    }
    
        public boolean isEmpty() {
        return HEAD == null;
    }
        
        //getter buat data
        
         public int getData() {
        return data;
    }

    // getter dan setter untuk next
    public void setNext(lat1 next) {
        this.next = next;
    }

    public lat1 getNext() {
        return next;
    }
    
    public void addHead(int data){
        lat1 newNode = new lat1(data);
        if(isEmpty()){
            HEAD = newNode;
        }
        else {
        newNode.setNext(HEAD);
        HEAD = newNode;
        }
                
    }
    
        //authorized by algi
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        lat1 list = new lat1(0);
        list.addHead(5);
        list.addHead(4);
        list.addHead(3);
        System.out.println("Elemen: ");
        list.displayElement();
    }
}
