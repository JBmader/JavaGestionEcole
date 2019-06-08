/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author NdR
 */
public class QuitterAction extends AbstractAction {
public QuitterAction(String texte){
 super(texte);
}
public void actionPerformed(ActionEvent e) {
 System.exit(0);
}
}

