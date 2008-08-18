package ui.model.impl;

import javax.media.opengl.GL;

import ui.events.IVidisEvent;
import ui.model.structure.ASimObject;


import com.sun.opengl.util.GLUT;

import data.var.IVariableContainer;

public class Node extends ASimObject {

	
	public Node(IVariableContainer c) {
		super(c);
	}

	@Override
	protected void renderObject(GL gl) {
		GLUT glut = new GLUT();
		glut.glutSolidSphere(0.5, 20, 20);
	}

	@Override
	protected void handleEvent(IVidisEvent e) {
		// TODO Auto-generated method stub
		
	}

}