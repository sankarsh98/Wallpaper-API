package com.wallpaper.app.image;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

	@Autowired
	private ImageService imageservice;
	
	@RequestMapping("/images")
	public List<Image> imageList(){
		
		return imageservice.getAllImages();
		
	}
	
	@RequestMapping("/images/{key}")
	public Image getImage(@PathVariable String key) {
		return imageservice.getImage(key);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/images")
	public void addImage(@RequestBody Image image) {
		imageservice.addImage(image);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/images/{key}")
	public void updateImage(@RequestBody Image image, @PathVariable String key) {
		imageservice.updateImage(image,key);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/images/{key}")
	public void deleteImage( @PathVariable String key) {
		imageservice.deleteImage(key);
	}

	

}
