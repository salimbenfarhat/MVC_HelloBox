package com.salimbenfarhat.controller;

import javax.swing.*;
import com.salimbenfarhat.model.Model;
import com.salimbenfarhat.view.View;

public class Controller {
	/*
	* Attributs privés
	*/
	private Model model;
	private View view;
	/*
	 * Constructeur
	 */
	public Controller(Model m, View v) {
		model = m;
		view = v;
		initView();
	}
	/*
	 * Méthodes
	 */
	public void initView() {
		view.getFirstnameTextfield().setText(model.getFirstname());
		view.getLastnameTextfield().setText(model.getLastname());
	}
	public void initController() {
		view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
		view.getLastnameSaveButton().addActionListener(e -> saveLastname());
		view.getHello().addActionListener(e -> sayHello());
		view.getBye().addActionListener(e -> sayBye());
	}
	private void saveFirstname() {
		model.setFirstname(view.getFirstnameTextfield().getText());
		JOptionPane.showMessageDialog(null, "Prénom enregistré : " + model.getFirstname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}
	private void saveLastname() {
		model.setLastname(view.getLastnameTextfield().getText());
		JOptionPane.showMessageDialog(null, "Nom enregistré : " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}
	private void sayHello() {
		JOptionPane.showMessageDialog(null, "Salut " + model.getFirstname() + " " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	}
	private void sayBye() {
		System.exit(0);
	}
}