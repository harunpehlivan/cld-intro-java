package cld_intro_java;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class Preset {
	public static void main(String[] args) throws Exception {
		Cloudinary cloudinary = new Cloudinary();
		Api api=cloudinary.api();
		//Unsigned Preset
		//Create an unsigned upload preset
		//	System.out.println(api.createUploadPreset(ObjectUtils.asMap("name", "unsigned-image", "unsigned", true, "tags" , "unsigned", "allowed_formats","jpg,png")));

		// Use unsigned preset
		//System.out.println(cloudinary.uploader().upload("./assets/logo.png", ObjectUtils.asMap("upload_preset","unsigned-image")));

		//Create signed preset
		//System.out.println(api.createUploadPreset(ObjectUtils.asMap("name", "signed-image", "unsigned", false, "tags" , "signed", "allowed_formats","jpg,png")));

		//Use signed preset
		//System.out.println(cloudinary.uploader().upload("./assets/lake.png", ObjectUtils.asMap("upload_preset","signed-image")));

	}

}
