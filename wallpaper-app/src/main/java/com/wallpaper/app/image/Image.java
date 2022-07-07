package com.wallpaper.app.image;

public class Image {

	private String key;
	private String rawUrl;
	private String regularUrl;
	
	
	public Image() {
		
	}
	public Image(String key, String rawUrl, String regularUrl) {
		super();
		this.key = key;
		this.rawUrl = rawUrl;
		this.regularUrl = regularUrl;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
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
