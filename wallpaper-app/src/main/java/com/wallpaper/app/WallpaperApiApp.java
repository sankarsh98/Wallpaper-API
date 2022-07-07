package com.wallpaper.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Telling that this class is our spring boot app
@SpringBootApplication
public class WallpaperApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is starting our application, we are mentioning which is the class having the application
		SpringApplication.run(WallpaperApiApp.class, args);

	}

}
