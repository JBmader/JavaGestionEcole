/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author NdR
 */
public class Information extends JFrame {
    
    private JComboBox choix;
    private JPanel content, b1, b2, b3, north, center, south, west;
    private JButton bouton;
    private JMenuBar menuBar;
    private JMenu rechercher, maj, reporting, option;
    private JMenuItem rechercherEcole, rechercherEleve, rechercherClasse, majAction, reportingAction, quitter;
    private List anneeList, niveauList, classList, eleveList;
    private JLabel JLanneeScolaire, JLniveau, JLclasse, JLeleve;

    public Information(){
		super();
		
		build();//On initialise notre fenêtre
	}
    
    private void build(){
		setTitle("Menu"); //On donne un titre à l'application
		setSize(800,600); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		//setResizable(false); //On interdit la redimensionnement de la fenêtre
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
		content.setLayout(new BorderLayout());
		content.setBackground(Color.white);
               
                north = new JPanel();
                //On définit le layout en lui indiquant qu'il travaillera en ligne
                north.setLayout(new GridLayout(1,4));
                JLanneeScolaire = new JLabel("Annee Scolaire");
                JLclasse = new JLabel("Classe");
                JLniveau = new JLabel("Niveau");
                JLeleve = new JLabel("Eleve");
                north.add(JLanneeScolaire);
                north.add(JLniveau);
                north.add(JLclasse);
                north.add(JLeleve);
                
                center = new JPanel();
                //On définit le layout en lui indiquant qu'il travaillera en ligne
                center.setLayout(new GridLayout(1,4));
                
                anneeList = new List(1, false);
                niveauList = new List(1, false);
                classList = new List(1, false);
                eleveList = new List(1, false);
            
                center.add(anneeList);
                center.add(niveauList);
                center.add(classList);
                center.add(eleveList);
                
                south = new JPanel();
                
                west = new JPanel();
                west.setLayout(new GridLayout(2,1));
                Object[] elements = new Object[]{"Ecole", "Niveau", "Classe", "Eleve", "Note"};
                choix = new JComboBox(elements);
                west.add(choix);
                
                bouton = new JButton("Rechercher");
                west.add(bouton);
                 
                content.add(north, BorderLayout.NORTH);
                content.add(center, BorderLayout.CENTER);
                content.add(south, BorderLayout.SOUTH);
                content.add(west, BorderLayout.WEST);
                         		
		return content;
	}
    
    public JComboBox getChoix()
    {
    return choix;
}

}
