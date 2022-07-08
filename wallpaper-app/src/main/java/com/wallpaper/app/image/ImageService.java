package com.wallpaper.app.image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepository;
		
	private List<Image> imageList =  new ArrayList<>(Arrays.asList(
			new Image(1,"god","ganesha.jpg","ganesha_medium.jpg"),
			new Image(2,"space","milky-way.jpg","milky-way-medium.jpg"),
			new Image(3,"nature","sunflower.jpg","sunflower-medium.jpg")
			));
	
	public List<Image> getAllImages(){
		
		List<Image> images = new ArrayList<>();
		
		for(Image image:imageRepository.findAll()){
			images.add(image);
		}
		
		return images;
	}
	
	public Image getImage(int id) {
		
		return imageRepository.findById(id).get();
		
	}
	
	
	public void addImage(Image image) {
		imageRepository.save(image);
	}

	public void updateImage(Image image, int id) {
		imageRepository.save(image);
	}

	public void deleteImage(int id) {
		
		imageRepository.deleteById(id);
		
	}
}

