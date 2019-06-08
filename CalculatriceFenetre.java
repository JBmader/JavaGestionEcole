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

public class CalculatriceFenetre extends JFrame{
	private JTextField field1;
	private JTextField field2;
	
	public CalculatriceFenetre(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
	private void build(){
		setTitle("Calculatrice"); //On donne un titre à l'application
		setSize(400,200); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
                JMenuBar menuBar = new JMenuBar();
                JMenu menu1 = new JMenu("Calculatrice");
                JMenuItem calculer = new JMenuItem(new CalculAction(this, "Calculer"));
                menu1.add(calculer);
                JMenuItem quitter = new JMenuItem(new QuitterAction("Quitter"));
                menu1.add(quitter);
                menuBar.add(menu1);
                JMenu menu2 = new JMenu("?");
                JMenuItem aPropos = new JMenuItem(new AProposAction(this, "A propos"));
                menu2.add(aPropos);
                menuBar.add(menu2);
                setJMenuBar(menuBar);  
	}

	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		
		field1 = new JTextField();
		field1.setColumns(10);
		
		panel.add(field1);
		
		field2 = new JTextField();
		field2.setColumns(10);
		
		panel.add(field2);
		
		JButton bouton = new JButton(new CalculAction(this, "Calculer"));
		
		panel.add(bouton);
		
		JLabel label = new JLabel("Résultat : Pas encore calculé");
		
		panel.add(label);
		
		return panel;
	}
}