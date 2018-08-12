/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author pc
 */
public class list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
     addtolist a= new addtolist("lolo");
    // a.setDaemon(true);
     a.start();
     //a.join();
      deletelist z=new deletelist("soso");
      z.start();
      //z.join();
      //A o=new A();
     // o.insertAtStart(5);
      //o.insertAtEnd(6);
     displaylist b= new displaylist("momo");
     b.start();
   
    }
    
}
