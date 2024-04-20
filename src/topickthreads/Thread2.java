package topickthreads;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jalan
 */
public class Thread2 extends Thread {
   @Override
    public void run() {
    

    FilePlayer file = new FilePlayer();
    try{
                
                 Thread2.sleep(1000);

            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\re.wav");
            System.out.println("re");
            Thread2.sleep(2000);
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\fa.wav");
            System.out.println("fa");
            Thread2.sleep(2000);
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\la.wav");
            System.out.println("la");

            Thread2.sleep(2000);
            
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\do-octave.wav");
            System.out.println("do-octave2");

            Thread2.sleep(1500);
            
                                
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
    
   
    
//    for(int i=0;i<=20;i++){
//        for(int j=0;j< sounds.size();j++){
//            try{
//                Thread1.sleep(1000);
//            } catch(InterruptedException e){
//                throw new RuntimeException(e);
//            }
//            file.play(sounds.get(j));
//        }
//    }
    }
}
