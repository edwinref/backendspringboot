package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nom")
	private String nom;

	@Column(name = "prix_unitaire")
	private float prixUnitaire;
	
	@Column(name = "quantite")
	private int quantite;
	
	public Produit() {
		
	}

	public Produit(long id, String nom, float prixUnitaire, int quantite) {
		this.id = id;
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
