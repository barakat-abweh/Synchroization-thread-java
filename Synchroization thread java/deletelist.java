/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author pc
 */
public class deletelist extends Thread {
     A o=null;
    Random r;
    Lock lock;
    public deletelist(String z){
       setName(z); 
     o = new A();
    r=new Random();
    lock=new ReentrantLock();
    
    }
public void run(){
while(true){
lock.lock();
if(o.isEmpty())
    System.out.println("list is empty");
int p =r.nextInt(300);
if(p<1 || p>o.getSize())
    System.out.println("Invalid position");
o.deleteAtPos(p);
System.out.println("been deleted");
lock.unlock();
}


}    



}
