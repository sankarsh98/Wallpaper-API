package com.wallpaper.app.image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

	private List<Image> imageList =  new ArrayList<>(Arrays.asList(
			new Image("god","ganesha.jpg","ganesha_medium.jpg"),
			new Image("space","milky-way.jpg","milky-way-medium.jpg"),
			new Image("nature","sunflower.jpg","sunflower-medium.jpg")
			));
	
	public List<Image> getAllImages(){
		return imageList;
	}
	
	public Image getImage(String key) {
		
		Image resultImage=new Image();
		
		for (Image image : imageList){
			if (image.getKey().equals(key)) {
				resultImage=image;
			}
		}
		
		return resultImage;
		
	}
	
	
	public void addImage(Image image) {
		imageList.add(image);
	}

	public void updateImage(Image image, String key) {
		
		for(int i = 0; i<imageList.size();i++) {
			if (imageList.get(i).getKey().equals(key)) {
				imageList.set(i, image);
			}
		}
	}

	public void deleteImage(String key) {
		
		for(int i = 0; i<imageList.size();i++) {
			if (imageList.get(i).getKey().equals(key)) {
				imageList.remove(i);
			}
		}
		
	}
}

