/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;
import JavaMVCViews.*;

/**
 *
 * @author gigik_user
 */
public class InitialController {
    
    public InitialController(){
    }
    
    public void startApplication() {
        // View the application's GUI
        MasterPage view = new MasterPage();
        view.setVisible(true);
    }
    
}
