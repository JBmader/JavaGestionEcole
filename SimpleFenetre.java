/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import javax.swing.JFrame;

/**
 *
 * @author NdR
 */
public class SimpleFenetre extends JFrame{
public SimpleFenetre(){
 super();

 build();//On initialise notre fenêtre
}


private void build(){
 setTitle("Ma première fenêtre"); //On donne un titre à l'application
 setSize(320,240); //On donne une taille à notre fenêtre
 setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
 setResizable(false); //On interdit la redimensionnement de la fenêtre
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
}
}