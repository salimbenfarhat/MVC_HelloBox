package com.salimbenfarhat;

import com.salimbenfarhat.controller.Controller;
import com.salimbenfarhat.model.Model;
import com.salimbenfarhat.view.View;

public class App {
	public static void main(String[] args) {
		Model m = new Model("Salim", "Benfarhat");
		View v = new View("MVC_HelloBox");
		Controller c = new Controller(m, v);
		c.initController();
	}
}
