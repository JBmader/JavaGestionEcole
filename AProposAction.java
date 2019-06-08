/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 *
 * @author NdR
 */
public class AProposAction extends AbstractAction {
private CalculatriceFenetre fenetre;
public AProposAction(CalculatriceFenetre fenetre, String texte){
 super(texte);

 this.fenetre = fenetre;
}
public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(fenetre, "Ce programme a été développé par <Nom du développeur>");
}
}

