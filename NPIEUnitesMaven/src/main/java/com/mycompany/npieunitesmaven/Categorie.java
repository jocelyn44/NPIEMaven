/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.npieunitesmaven;

import java.util.LinkedList;

public class Categorie {
	private String nom;
	private LinkedList<Unite> list = new LinkedList<Unite>();
	
        /**Constructeur de la classe Categorie
         * 
         * @param pNom 
         */
	public Categorie(String pNom){
		nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public LinkedList<Unite> getList() {
		return list;
	}
	
        /**Retourne l'Unite associee au nom passe en parametre
         * 
         * @param unit : le nom d'une unite
         * @return Unite : objet Unite
         */
	public Unite getValUnit(String unit){
		if(unit==null || unit ==""){
			System.out.println("Veuillez passer un paramètre valide.");
			return null;
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNom().equals(unit))
				return list.get(i);
		}
		return null;
	}
	
        /**Ajoute une Unite a la Categorie
         * 
         * @param unit : Unite a ajouter
         */
	public void addUnit(Unite unit){
		this.list.add(unit);
	}
}
