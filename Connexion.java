/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.NORTH;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author NdR
 */
public class Connexion extends JFrame {
   private JPanel content, north, center;
   private JLabel serveur, bdd, login, mdp;
   private JTextField serveurText, bddText, loginText, mdpText;
   private JButton connexion;
   private JMenuBar menuBar;
   private JMenu menu1, menu2;
   private JMenuItem quitter, autre;
   public Connexion(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
   private void build(){
		setTitle("Connexion à la BDD"); //On donne un titre à l'application
		setSize(800,600); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		//setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
                menuBar = new JMenuBar();
                menu1 = new JMenu("Options");
                quitter = new JMenuItem("Quitter");
                menu1.add(quitter);
                autre = new JMenuItem("Autre");
                menu1.add(autre);
                menuBar.add(menu1);
                setJMenuBar(menuBar);  
	}
   
   private JPanel buildContentPane(){
		content = new JPanel();
		content.setLayout(new BorderLayout());
		content.setBackground(Color.white);
                
                north = new JPanel();
                north.setLayout(new GridLayout(1,8));
                
                serveur = new JLabel("Serveur:", JLabel.CENTER);
                bdd = new JLabel("Base de donnée:", JLabel.CENTER);
                login = new JLabel("Login:", JLabel.CENTER);
                mdp = new JLabel("Mot de passe:", JLabel.CENTER);
  
                serveurText = new JTextField(15);
                bddText = new JTextField(15);
                loginText = new JTextField(15);
                mdpText = new JPasswordField(15);
                
                north.add(serveur);
                north.add(serveurText);
                north.add(bdd);
                north.add(bddText);
                north.add(login);
                north.add(loginText);
                north.add(mdp);
                north.add(mdpText);
                
                center = new JPanel();
                center.setLayout(new FlowLayout());
                
                connexion = new JButton("Connexion");
                center.add(connexion);
	
		content.add(north, BorderLayout.NORTH);
                content.add(center, BorderLayout.CENTER);
                
		return content;
	}
}
