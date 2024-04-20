package topickthreads;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;


/**
 *
 * @author jalan
 */
public class Thread1 extends Thread{
  @Override
    public void run() {
    

    FilePlayer file = new FilePlayer();
   
    try{
            Thread.sleep(1000);
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\do.wav");
            System.out.println("do");
            Thread1.sleep(2000);
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\mi.wav");
            System.out.println("mi");
            Thread1.sleep(2000);
                
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\sol.wav");
            System.out.println("sol");
            Thread1.sleep(2000);
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\si.wav");
            System.out.println("si");
            Thread1.sleep(1000);
            
            file.play("C:\\Users\\jalan\\Downloads\\Multithreading  Resources\\Sounds\\do-octave.wav");
            System.out.println("do-octave");
            Thread1.sleep(1500);
                
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
