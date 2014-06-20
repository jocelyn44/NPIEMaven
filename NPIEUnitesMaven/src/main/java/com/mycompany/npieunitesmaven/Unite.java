/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.npieunitesmaven;

public class Unite {
	private String nom;
	private double coef; //coefficient multiplicateur
	private double decal; // coefficient de decallage

	
	//constructeur 
	public Unite(String pNom, double pVal, double pDecal){
		nom = pNom;
		coef=pVal;
		decal=pDecal;
	}
	
	public double getDecal() {
		return decal;
	}
	
	public String getNom() {
		return nom;
	}

	public double getVal() {
		return coef;
	}
}
