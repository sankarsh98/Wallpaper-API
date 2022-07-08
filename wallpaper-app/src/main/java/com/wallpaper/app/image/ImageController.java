package com.wallpaper.app.image;

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
	
	@RequestMapping("/images/{id}")
	public Image getImage(@PathVariable int id) {
		return imageservice.getImage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/images")
	public void addImage(@RequestBody Image image) {
		imageservice.addImage(image);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/images/{id}")
	public void updateImage(@RequestBody Image image, @PathVariable int id) {
		imageservice.updateImage(image,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/images/{id}")
	public void deleteImage( @PathVariable int id) {
		imageservice.deleteImage(id);
	}


	

}
