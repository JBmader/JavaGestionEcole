/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author NdR
 */
public class Menu extends JFrame {
   private JPanel content, north, center;
   private JButton Rechercher, MAJ, Reporting;
   private JMenuBar menuBar;
   private JMenu rechercher, maj, reporting, option;
   private JMenuItem rechercherEcole, rechercherEleve, rechercherClasse, majAction, reportingAction, quitter;
   
   public Menu(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
   private void build(){
		setTitle("Menu"); //On donne un titre à l'application
		setSize(800,600); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
                menuBar = new JMenuBar();
                rechercher = new JMenu("Recherche d'informations");
                rechercherEcole = new JMenuItem("Rechercher Ecole");
                rechercher.add(rechercherEcole);
                rechercherEleve = new JMenuItem("Rechercher Eleve");
                rechercher.add(rechercherEleve);
                rechercherClasse = new JMenuItem("Rechercher Classe");
                rechercher.add(rechercherClasse);
                menuBar.add(rechercher);
                maj = new JMenu("MAJ des données");
                majAction = new JMenuItem("Faire MAJ");
                maj.add(majAction);
                menuBar.add(maj);
                reporting = new JMenu("Reporting");
                reportingAction = new JMenuItem("Reporting");
                reporting.add(reportingAction);
                menuBar.add(reporting);
                option = new JMenu("Options");
                quitter = new JMenuItem(new QuitterAction("Quitter"));
                option.add(quitter);
                menuBar.add(option);
                setJMenuBar(menuBar);  
	}
   
   private JPanel buildContentPane(){
		content = new JPanel();
		content.setLayout(new FlowLayout());
		content.setBackground(Color.white);
		
		Rechercher = new JButton("Recherche des informations");
                MAJ = new JButton("Faire une mis à jour des données");
                Reporting = new JButton("Reporting");
	
                content.add(Rechercher);
                content.add(MAJ);
                content.add(Reporting);
		
		return content;
	}
}
