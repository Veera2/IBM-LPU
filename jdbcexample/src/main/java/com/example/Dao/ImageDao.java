package com.example.Dao;

import java.util.List;

import com.example.model.Image;


	public interface ImageDao {

		public void create(String imageId,String imageUrl,boolean isAvailable);
		
		public void getImage();
		
		public void update(String oldurl,String newurl);
		
		public void delete(String url);
	}

