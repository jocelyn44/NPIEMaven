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

	
	/**Constructeur de la classse unite
         * @param pnom : le nom de l'unite
         * @param pval : le coefficient multiplicateur de l'unite
         * @param pDecal : le coefficient de decallage de l'unite
         **/
	public Unite(String pNom, double pVal, double pDecal){
		nom = pNom;
		coef=pVal;
		decal=pDecal;
	}
	
        /**Getter du coefficient de decalage**/
	public double getDecal() {
		return decal;
	}
	
        /**Getter du nom de l'unite**/
	public String getNom() {
		return nom;
	}
        
        /**Getter du coefficient multiplicateur**/
	public double getVal() {
		return coef;
	}
}
