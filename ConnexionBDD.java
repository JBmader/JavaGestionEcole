/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author NdR
 */

;
 
public class ConnexionBDD extends JFrame {
     private final JLabel serveur, bdd, login, mdp;
     private final JTextField serveurText, bddText, loginText;
     private final JPasswordField mdpText;
     private final JButton connexion;
     private final JPanel p0, nord;
  
    public ConnexionBDD(){             
    this.setTitle("Ma première fenêtre Java");
    this.setSize(600, 800);
    this.setLocationRelativeTo(null); 
    setLayout(new BorderLayout());
    
    serveur = new JLabel("Serveur: ");
    bdd = new JLabel("Base de donnée: ");
    login = new JLabel("Login: ");
    mdp = new JLabel("Mot de passe:");
  
    
    serveurText = new JTextField();
    bddText = new JTextField();
    loginText = new JTextField();
    mdpText = new JPasswordField(8);
    
    connexion = new JButton("Connexion");
    //Instanciation d'un objet JPanel
     nord = new JPanel();
     p0 = new JPanel();
     p0.setSize(300, 400);
     p0.setLayout(new FlowLayout());
     p0.add(serveur);
     p0.add(serveurText);
     p0.add(bdd);
     p0.add(bddText);
     p0.add(login);
     p0.add(loginText);
     p0.add(mdp);
     p0.add(mdpText);
     p0.add(connexion);
     
    //On définit le layout en lui indiquant qu'il travaillera en ligne
    this.getContentPane().add(nord, BorderLayout.NORTH);
    this.getContentPane().add(p0, BorderLayout.CENTER);
    //Au nord

    //On prévient notre JFrame que notre JPanel sera son content pane     
    this.setVisible(true);
  }       
}
