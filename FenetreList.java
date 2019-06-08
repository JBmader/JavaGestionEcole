/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NdR
 */
public class FenetreList extends JFrame {
    private final JPanel content, boutonPane, center, south;
    private final List anneeList, niveauList, classList, eleveList;
    private final JButton rechercher, maj, reporting, quitter; 
    private final JLabel JLanneeScolaire, JLniveau, JLclasse, JLeleve;
      
    public FenetreList(){
    this.setTitle("FenetreList");
    this.setSize(600, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    content = new JPanel(); 
    boutonPane = new JPanel();
    center = new JPanel();
    south = new JPanel();
    
    JLanneeScolaire = new JLabel("Annee Scolaire",  JLabel.CENTER);
    JLclasse = new JLabel("Classe",  JLabel.CENTER);
    JLniveau = new JLabel("Niveau",  JLabel.CENTER);
    JLeleve = new JLabel("Eleve",  JLabel.CENTER);
    
    anneeList = new List(1, false);
    niveauList = new List(1, false);
    classList = new List(1, false);
    eleveList = new List(1, false);

    
    rechercher = new JButton("Recherche d'information");
    maj = new JButton("Mise à jour BDD");
    reporting = new JButton("Reporting");
    quitter = new JButton("Quitter");
    
    
    //content.setLayout(new GridLayout(2,4));
    
    boutonPane.add(rechercher);
    boutonPane.add(maj);
    boutonPane.add(reporting);
    
    center.setLayout(new GridLayout(2,4));
    center.add(JLanneeScolaire);
    center.add(JLniveau);
    center.add(JLclasse);
    center.add(JLeleve);
    center.add(anneeList);
    center.add(niveauList);
    center.add(classList);
    center.add(eleveList);
    
    south.add(quitter);
    content.add(center);
    
    add(boutonPane, BorderLayout.NORTH);
    add(content, BorderLayout.CENTER);
    add(south, BorderLayout.SOUTH);
    this.setVisible(true);
}
}