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
public class addtolist extends Thread {
    A o=null;
    Random r;
    Lock lock;
    
    addtolist(String h){
   
    setName(h);
     o = new A();
    r=new Random();
    lock=new ReentrantLock();
    
    }
public void run(){

    
  while(true){ 
lock.lock();
      try {
          
          //int w =r.nextInt(111);
          o.insertAtStart();
          o.insertAtEnd();
      } finally {
          lock.unlock();
      }
  


}
    
    

}    
    
}
