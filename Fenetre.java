/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

/**
 *
 * @author NdR
 */
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame{
  private final CardLayout cl;
  private final JTextField nomText, prenomText, classeText, ecoleText;
  private final JLabel nom, prenom, classe, ecole;
  private final JPanel content, center, card1, card2, card3, boutonPane, p0, p1, p2, p3; 
  private final JButton rechercher, maj, reporting, search; 

  
  //Liste des noms de nos conteneurs pour la pile de cartes
  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
  int indice = 0;

  public Fenetre(){
    this.setTitle("CardLayout");
    this.setSize(600, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    cl = new CardLayout();
    content = new JPanel(); 
    boutonPane = new JPanel();
    center = new JPanel();
		
    //On crée trois conteneurs de couleur différente
    card1 = new JPanel();
    card1.setBackground(Color.blue);		
    card2 = new JPanel();
    card2.setBackground(Color.red);		
    card3 = new JPanel();
    card3.setBackground(Color.green);
    
    p0 = new JPanel();
    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();
    
    nomText = new JTextField(20);
    prenomText = new JTextField(20);
    classeText = new JTextField(20);
    ecoleText = new JTextField(20);
    
    nom = new JLabel("Nom : ", JLabel.CENTER);
    prenom = new JLabel("Prenom : ", JLabel.CENTER);
    classe = new JLabel("Classe : ", JLabel.CENTER);
    ecole = new JLabel("Ecole : ", JLabel.CENTER);
    search = new JButton("Rechercher");
        /**
         * Mise en page des panels de la fenetre
         */
    
    p0.setLayout(new GridLayout(4,2)); 
    //p2.setLayout(new GridLayout(1,3));
    //p3.setLayout(new GridLayout(1,4));
    
    p0.add(nom);
    p0.add(nomText);
    p0.add(prenom);
    p0.add(prenomText);
    p0.add(classe);
    p0.add(classeText);
    p0.add(ecole);
    p0.add(ecoleText);
    
    p1.add(search);
    
    center.add(p0);
    center.add(p1);
  
 
    rechercher = new JButton("Recherche d'information");
    //Définition de l'action du bouton
    rechercher.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //Via cette instruction, on passe au prochain conteneur de la pile
        //cl.next(content);
      }
    });
		
    maj = new JButton("Mise à jour BDD");
    //Définition de l'action du bouton2
    maj.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){				
        if(++indice > 2)
          indice = 0;
        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
        //cl.show(content, listContent[indice]);
      }
    });
    
    reporting = new JButton("Reporting");
    reporting.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //Via cette instruction, on passe au prochain conteneur de la pile
        //ConnexionBDD c = new ConnexionBDD();
        //c.setVisible(true);
      }
    });
    
		
    boutonPane.add(rechercher);
    boutonPane.add(maj);
    boutonPane.add(reporting);

    //On définit le layout
    content.setLayout(cl);
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    content.add(card3, listContent[2]);

    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
    this.getContentPane().add(center, BorderLayout.CENTER);
    this.setVisible(true);
  }	
}
