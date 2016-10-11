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
        //LembreteController ctrlLembrete = new LembreteController();
        AgendaController ctrlAgenda = new AgendaController();
        Agenda agendinha = ctrlAgenda.createAgenda("Teste", "Eu mesmo", "3");
        System.out.println(ctrlAgenda.readAgenda(agendinha));
        
        Date data = new Date();        
        ctrlAgenda.adicionaLembrete(agendinha, data, "Agendinha1");
        ctrlAgenda.adicionaLembrete(agendinha, data, "Agendinha2");
        ctrlAgenda.adicionaLembrete(agendinha, data, "Agendinha3");
        ctrlAgenda.adicionaLembrete(agendinha, data, "Agendinha4");
        ctrlAgenda.adicionaLembrete(agendinha, data, "Agendinha5");

        System.out.println(ctrlAgenda.readAgenda(agendinha));

        ctrlAgenda.deleteLembrete(agendinha, agendinha.getLembretes().get(0));
        System.out.println(ctrlAgenda.readAgenda(agendinha));
        
        ctrlAgenda.deleteAllLembretes(agendinha);
        System.out.println(ctrlAgenda.readAgenda(agendinha));
        
        /*
        Lembrete lembrete = ctrlLembrete.createLembrete(data, "Agendinha");
        Lembrete lembrete2 = ctrlLembrete.createLembrete(data, "Agendinha2");

        System.out.println(ctrlLembrete.readLembrete(lembrete));
        System.out.println(ctrlLembrete.readLembrete(lembrete2));

        try {
            Thread.sleep(5000);
            Date novaData = new Date();
            ctrlLembrete.updateLembrete(lembrete, novaData, "Nova agendinha aewwwwoooo!");
            ctrlLembrete.updateLembrete(lembrete2, novaData, "Nova agendinha aewwwwoooo2!");
            System.out.println(ctrlLembrete.readLembrete(lembrete));
            System.out.println(ctrlLembrete.readLembrete(lembrete2));
        } catch(InterruptedException ex) {
            System.out.println("ERRROOW!");
        }*/        
        
        
        
        
    }
}
