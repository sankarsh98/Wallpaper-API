package com.wallpaper.app.image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String term;
	private String rawUrl;
	private String regularUrl;
	
	
	public Image() {
		
	}
	
	public Image(int id, String term, String rawUrl, String regularUrl) {
		super();
		this.id = id;
		this.term = term;
		this.rawUrl = rawUrl;
		this.regularUrl = regularUrl;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getRawUrl() {
		return rawUrl;
	}
	public void setRawUrl(String rawUrl) {
		this.rawUrl = rawUrl;
	}
	public String getRegularUrl() {
		return regularUrl;
	}
	public void setRegularUrl(String regularUrl) {
		this.regularUrl = regularUrl;
	}
	
	
}
