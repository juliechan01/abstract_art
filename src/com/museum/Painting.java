package com.museum;

public class Painting extends Art {
	private String paintType;
	
	public String getPaintType() {
		return paintType;
	}
	
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	public void viewArt() {
		System.out.printf("I see a painting! It's %s \n", this.title);
	}

	public Painting(String title, String author, String description, String paintType) {
		this.title = title;
		this.author = author;
		this.description = description;
		this.paintType = paintType;
	}
	
}
