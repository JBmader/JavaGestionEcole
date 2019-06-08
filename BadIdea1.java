/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

public class BadIdea1 extends JFrame
{
JButton b1 = new JButton("Button 1");
JButton b2 = new JButton("Button 2");
public BadIdea1()
{
setLayout(new FlowLayout());
this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.out.println("Window Closing");
System.exit(0);
}
}
);
b1.addActionListener (new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("BOUTON 1 PRESSE");
}
}
);
b2.addActionListener (new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("BOUTON DEUX PRESSE");
}
});
add(b1);
add(b2);
}
public static void main(String[] args)
{
JFrame f = new BadIdea1();
f.setSize(300,200);
f.setVisible(true);
}
}