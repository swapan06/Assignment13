Ques1:Create a multi-thread program with a synchronized method?

package multithreading;
import java.lang.Thread;


public class Multithreading extends Thread{

    public synchronized void run(){
       
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread thread1=new Multithreading();
        Thread thread2=new Multithreading();
        thread1.start();
        thread2.start();
        
    }
    
    
}

