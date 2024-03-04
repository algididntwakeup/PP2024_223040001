/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ginode;

/**
 *
 * @author Muhammad Al Ghifari
 */
public class GiNode {

  // ini kursus node kita yagesya
    
    private int nilai;
    private GiNode next;
    private String nama;
    
    //initializing node
    public GiNode(int nilai){
        this.nilai = nilai;
    }
    
    //Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
    return nama;
    }
    
    public int getNilai() {
        return nilai;
    }
    
    
    public void setNext(GiNode next){
    this.next = next;
    }
    
    public GiNode getNext(){
        return next;
    }
    
            

  
    /** authorized by algi
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat 2 buah node
        GiNode n1 = new GiNode(2);
        GiNode n2 = new GiNode(3);
        GiNode n3 = new GiNode(5);
        GiNode n4 = new GiNode(7);
        GiNode n5 = new GiNode(9);
        GiNode n6 = new GiNode(3);
        
        // membuat relasi node n1 dan n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        

        //menampilkan node n1 dan n2 dengan pointer p
        
        GiNode p = n1;
        while(p != null)
        {
        System.out.printf("%d ", p.getNilai());
        p = p.getNext();
        }
    }
    
}
    

