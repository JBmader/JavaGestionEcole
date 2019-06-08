/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author NdR
 */
public class Search extends JFrame {
    
    private JComboBox choix;
    private JPanel content;
    private JButton bouton;
    private JMenuBar menuBar;
    private JMenu rechercher, maj, reporting, option;
    private JMenuItem rechercherEcole, rechercherEleve, rechercherClasse, majAction, reportingAction, quitter;

    public Search(){
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
                
                Object[] elements = new Object[]{"Ecole", "Niveau", "Classe", "Eleve", "Note"};
                choix = new JComboBox(elements);
		content.add(choix);
                
		bouton = new JButton("Rechercher");
                content.add(bouton);
		
		return content;
	}
    
    public JComboBox getChoix()
    {
    return choix;
}

}
