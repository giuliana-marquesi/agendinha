/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahellocollections;

import JavaMVCControllers.*;
import java.util.Date;
import JavaMVCModels.*;
import JavaMVCViews.*;

/**
 *
 * @author AfzaalAhmad
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    private static InitialController inicia = new InitialController();
    
    public static void main(String[] args) {
        
        inicia.startApplication();
    }
}
