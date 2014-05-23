/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.npieunitesmaven;
import java.util.LinkedList;
/**
 *
 * @author jocelynFac
 */
public class Categorie {
    private String nom;
	public LinkedList<Unite> list = new LinkedList<Unite>();
	
	public Categorie(String pNom){
		nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LinkedList<Unite> getList() {
		return list;
	}

	public void setList(LinkedList<Unite> list) {
		this.list = list;
	}
	
	public Unite getValUnit(String unit){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNom().equals(unit))
				return list.get(i);
		}
		return null;
	}
}
