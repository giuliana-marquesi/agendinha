/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahellocollections;

import JavaMVCControllers.*;
import java.util.Date;
import JavaMVCModels.*;

/**
 *
 * @author AfzaalAhmad
 */
public class JavaHelloCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //HelloWorldController controller = new HelloWorldController();
        // Start the application
        //controller.startApplication();
        LembreteController controller = new LembreteController();
        Date data = new Date();
        
        Lembrete lembrete = controller.createLembrete(data, "Agendinha");
        Lembrete lembrete2 = controller.createLembrete(data, "Agendinha2");

        System.out.println(controller.readLembrete(lembrete));
        System.out.println(controller.readLembrete(lembrete2));

        try {
            Thread.sleep(5000);
            Date novaData = new Date();
            controller.updateLembrete(lembrete, novaData, "Nova agendinha aewwwwoooo!");
            controller.updateLembrete(lembrete2, novaData, "Nova agendinha aewwwwoooo2!");
            System.out.println(controller.readLembrete(lembrete));
            System.out.println(controller.readLembrete(lembrete2));
        } catch(InterruptedException ex) {
            System.out.println("ERRROOW!");
        }
        
        
    }
}
