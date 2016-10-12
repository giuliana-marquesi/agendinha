/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;
import JavaMVCModels.*;
import java.util.ArrayList;
import JavaMVCViews.*;

/**
 *
 * @author gigik_user
 */
public class ControllerStringToModel {
    
    private ArrayList<Agenda> grupoAgendas;
    private AgendaController ctrlAgenda;
    
    public ControllerStringToModel(){
        grupoAgendas = new ArrayList<Agenda>();
        ctrlAgenda = new AgendaController();
    }
    
    public void startApplication() {
        // View the application's GUI
        NewJFrame view = new NewJFrame();
        view.setVisible(true);
    }
    
    public void incluiAgenda(String nomeAgenda, String nomeDono, String tipo){
        Agenda novaAgenda = ctrlAgenda.createAgenda(nomeAgenda,nomeDono ,tipo);
        grupoAgendas.add(novaAgenda);
    }
}
