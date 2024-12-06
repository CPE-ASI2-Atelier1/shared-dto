package com.cpe.asi2.atelier1.dto;

import java.util.List;

public class CardDTO {
	private Integer id;
	private float energy;
	private float hp;
	private float defence;
	private float attack;
	private float price;
	private Integer userId;
	private String name;
	private String description;
	private String family;
	private String affinity;
	private String imgUrl;
	private String smallImgUrl;

	public CardDTO() {}

	// Pour résoudre le soucis de DTO, je vais devoir en créer un nouveau qui soit dépendant de personne et qui refait tous les attributs.
	// Au lieu d'avoir des Users on aura des IDs ce qui découple.
	// Enfin, on utilise un mapper pour que ce DTO publique puisse s'interfacer avec le DTO privé du monolythique.
	
	public CardDTO(Integer id,
			float energy, 
			float hp, 
			float defence, 
			float attack, 
			float price, 
			Integer userId, 
			String name, 
			String description, 
			String family, 
			String affinity, 
			String imgUrl, 
			String smallImgUrl) {
		this.id = id;
		this.energy = energy;
		this.hp = hp;
		this.defence = defence;
		this.attack = attack;
		this.price = price;
		this.userId = userId;
		this.name = name;
		this.description = description;
		this.family = family;
		this.affinity = affinity;
		this.imgUrl = imgUrl;
		this.smallImgUrl = smallImgUrl;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getFamily() {
		return family;
	}

	public String getAffinity() {
		return affinity;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getSmallImgUrl() {
		return smallImgUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getEnergy() {
		return energy;
	}

	public void setEnergy(float energy) {
		this.energy = energy;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getDefence() {
		return defence;
	}

	public void setDefence(float defence) {
		this.defence = defence;
	}

	public float getAttack() {
		return attack;
	}

	public void setAttack(float attack) {
		this.attack = attack;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}