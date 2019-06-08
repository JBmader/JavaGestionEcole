/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
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
public class Window extends JFrame implements ActionListener, ItemListener {
    private final List ListYear, ListNiveau, ListClasse, ListEleve;
    private final JLabel loginBDD, passBDD, nameBDD, Updatebdd, JLanneeScolaire, JLniveau, JLclasse, JLeleve;
    private final JTextField loginBDDTexte, nameBDDTexte;
    private final JPasswordField passBDDTexte;
    private final JButton connect, JBclasse, JBeleve, JBteacher;
    private final JPanel p0, p1,p2, p3, p4, nord;


    public Window() {
        super (" Projet : Gestion d'une école");
        setLayout(new BorderLayout());
        setBounds(0,0,800,800);
        setResizable(true);
        setVisible(true);

        /**
         * Création des Jbuttons de la fentre
         * JButton connection Base de Donnees
         */
        connect = new JButton("Connexion BDD");
        JBclasse = new JButton("Classe");
        JBeleve = new JButton("Eleve");
        JBteacher = new JButton("je sais pas encore");

        /**
         * Création des Listes pour les tables
         */
        ListClasse = new List(1, false);
        ListNiveau = new List(1, false);
        ListYear = new List(1, false);
        ListEleve = new List(1, false);


        /**
         * initilastion des Arraylist
         */
    
        /**
         * Création des JTextField
         * Pouvoir se connecter à la base de données
         */
        loginBDDTexte = new JTextField();
        nameBDDTexte = new JTextField();
        passBDDTexte = new JPasswordField(8);

        /**
         * Creation des labels
         */

        loginBDD = new JLabel("Login : ", JLabel.CENTER);
        passBDD = new JLabel("Password : ", JLabel.CENTER);
        nameBDD = new JLabel("Name BDD : ");
        Updatebdd = new JLabel("Update your bdd",  JLabel.CENTER);
        JLanneeScolaire = new JLabel("Annee Scolaire",  JLabel.CENTER);
        JLclasse = new JLabel("Classe",  JLabel.CENTER);
        JLniveau = new JLabel("Niveau",  JLabel.CENTER);
        JLeleve = new JLabel("Eleve",  JLabel.CENTER);

        /**
         * Initialition des panels de la fenetre
         */
        p0 = new JPanel();
        p1 = new JPanel();
        nord = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        /**
         * Mise en page des panels de la fenetre
         */
        p0.setLayout(new GridLayout(1,11));
        p1.setLayout(new GridLayout(1,4));
        p4.setLayout(new GridLayout(1,4));
        nord.setLayout(new GridLayout(3,1));
        p2.setLayout(new GridLayout(1,4));
        p3.setLayout(new GridLayout(1,2));


        /**
         * Ajout des objets graphique dans les panels
         */
        p0.add(loginBDD);
        p0.add(loginBDDTexte);
        p0.add(passBDD);
        p0.add(passBDDTexte);
        p0.add(nameBDD);
        p0.add(nameBDDTexte);
        p0.add(connect);

        p1.add(Updatebdd);
        p1.add(JBclasse);
        p1.add(JBteacher);
        p1.add(JBeleve);

        p4.add(JLanneeScolaire);
        p4.add(JLniveau);
        p4.add(JLclasse);
        p4.add(JLeleve);

        nord.add("North", p0);
        nord.add("North", p1);
        nord.add("North", p4);

        p2.add(ListYear);
        p2.add((ListNiveau));
        p2.add(ListClasse);
        p2.add(ListEleve);


        /**
         * Ajout des Actionlisteners sur les JButtons
         */
        connect.addActionListener(this);
        JBclasse.addActionListener(this);
        JBeleve.addActionListener(this);
        JBteacher.addActionListener(this);
        loginBDDTexte.addActionListener(this);
        passBDDTexte.addActionListener(this);
        nameBDDTexte.addActionListener(this);

        ListYear.addItemListener(this);
        ListNiveau.addItemListener(this);
        ListClasse.addItemListener(this);
        ListEleve.addItemListener(this);

        /**
         * Ajout Couleur sur les panels et autre
         */
        p0.setBackground(Color.blue);
        ListClasse.setBackground(Color.CYAN);
        ListYear.setBackground(Color.GREEN);
        ListEleve.setBackground(Color.orange);

        /**
         * Disposition Graphique des panels
         */
        add("North", nord);
        add(p2);

        /**
         * Pour pouvoir fermer la fenetre
         */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
       }
    

