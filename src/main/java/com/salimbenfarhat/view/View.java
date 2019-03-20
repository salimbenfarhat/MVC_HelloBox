package com.salimbenfarhat.view;

import java.awt.*;
import javax.swing.*;

public class View {
	/*
	* Attributs priv�s
	*/
	private JFrame frame;
	private JLabel firstnameLabel;
	private JLabel lastnameLabel;
	private JTextField firstnameTextfield;
	private JTextField lastnameTextfield;
	private JButton firstnameSaveButton;
	private JButton lastnameSaveButton;
	private JButton hello;
	private JButton bye;
	/*
	 * Constructeur
	 */
	public View(String title) {
		frame = new JFrame(title);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 120);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	 
		// Creation des Elements d'Interface
		firstnameLabel = new JLabel("Pr�nom :");
		lastnameLabel = new JLabel("Nom :");
		firstnameTextfield = new JTextField();
		lastnameTextfield = new JTextField();
		firstnameSaveButton = new JButton("Enregistrer pr�nom");
		lastnameSaveButton = new JButton("Enregistrer nom");
		hello = new JButton("Salut!");
		bye = new JButton("Au revoir!");
	 
		// Ajout des Elements d'Interface � la Fen�tre
		GroupLayout layout = new GroupLayout(frame.getContentPane());
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
		    .addComponent(lastnameLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
		    .addComponent(lastnameTextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameSaveButton)
		    .addComponent(lastnameSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
		    .addComponent(bye)));
		layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
		    .addComponent(firstnameTextfield).addComponent(firstnameSaveButton).addComponent(hello))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
		    .addComponent(lastnameTextfield).addComponent(lastnameSaveButton).addComponent(bye)));
		layout.linkSize(SwingConstants.HORIZONTAL, firstnameSaveButton, lastnameSaveButton);
		layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
		frame.getContentPane().setLayout(layout);
	 }
	/*
	 * Accesseurs et Mutateurs
	 */
	public JFrame getFrame() {
		 return frame;
	} 
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}	 
	public JLabel getFirstnameLabel() {
		 return firstnameLabel;
	}	 
	public void setFirstnameLabel(JLabel firstnameLabel) {
		 this.firstnameLabel = firstnameLabel;
	}	 
	public JLabel getLastnameLabel() {
		 return lastnameLabel;
	}	 
	public void setLastnameLabel(JLabel lastnameLabel) {
		 this.lastnameLabel = lastnameLabel;
	}	 
	public JTextField getFirstnameTextfield() {
		return firstnameTextfield;
	}	 
	public void setFirstnameTextfield(JTextField firstnameTextfield) {
		 this.firstnameTextfield = firstnameTextfield;
	}	 
	public JTextField getLastnameTextfield() {
		 return lastnameTextfield;
	}	 
	public void setLastnameTextfield(JTextField lastnameTextfield) {
		 this.lastnameTextfield = lastnameTextfield;
	}	 
	public JButton getFirstnameSaveButton() {
		 return firstnameSaveButton;
	}	 
	public void setFirstnameSaveButton(JButton firstnameSaveButton) {
		 this.firstnameSaveButton = firstnameSaveButton;
	}
	public JButton getLastnameSaveButton() {
		 return lastnameSaveButton;
	}
	public void setLastnameSaveButton(JButton lastnameSaveButton) {
		 this.lastnameSaveButton = lastnameSaveButton;
	} 
	public JButton getHello() {
		 return hello;
	}	 
	public void setHello(JButton hello) {
		 this.hello = hello;
	}	 
	public JButton getBye() {
		 return bye;
	} 
	public void setBye(JButton bye) {
		this.bye = bye;
	}	 
}