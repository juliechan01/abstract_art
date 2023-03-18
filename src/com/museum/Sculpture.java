package com.museum;

public class Sculpture extends Art {
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void viewArt() {
		System.out.printf("I see a sculpture! It's %s \n", this.title);
	}
	
	public Sculpture(String title, String author, String description, String material) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.material = material;
	}
}
