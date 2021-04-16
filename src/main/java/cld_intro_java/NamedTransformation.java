package cld_intro_java;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.transformation.Layer;
import com.cloudinary.transformation.TextLayer;
import com.cloudinary.utils.ObjectUtils;

public class NamedTransformation {
	public static void main(String[] args) throws Exception {
		Cloudinary cloudinary = new Cloudinary();
		//Admin API object
		Api api=cloudinary.api();

		// Create a simple named transformation from a string
		//System.out.println(api.createTransformation("standard","w_150,h_150,c_thumb,g_auto",ObjectUtils.emptyMap()));

		//Use named transformation standard
		//System.out.println(cloudinary.url().transformation(new Transformation().named("standard")).imageTag("cheesecake.jpg"));

		//Use named transform with f_auto
		//System.out.println(cloudinary.url().transformation(new Transformation().named("standard").fetchFormat("auto")).imageTag("cheesecake.jpg"));

		//Create and use complex transformation 
		//System.out.println(cloudinary.url().transformation(new Transformation().overlay(new Layer().publicId("logo")).effect("brightness:-21").x(-10).y(-200).width(304).radius("max")
		//	.chain().overlay(new TextLayer().fontFamily("Arial").fontSize(100).fontWeight("bold").text("Hello Jon")).opacity(70).x(-10).y(0).width(365)).imageTag("shirt_only.jpg"));

		//Create a named transformation for the complex transformation
		//	System.out.println(api.createTransformation("complex", new Transformation().overlay(new Layer().publicId("logo")).effect("brightness:-21").x(-10).y(-200).width(304).radius("max")
		//		.chain().overlay(new TextLayer().fontFamily("Coustard").fontSize(100).fontWeight("bold").text("Hello Jon")).opacity(70).y(0).x(-10).width(365).generate(),ObjectUtils.emptyMap()));

		//Use the complex named transform with f_auto
		//System.out.println(cloudinary.url().transformation(new Transformation().named("complex").fetchFormat("auto")).imageTag("shirt_only.png"));

	}

}
