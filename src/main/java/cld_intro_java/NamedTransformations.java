package cld_intro_java;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;

public class NamedTransformations {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void runner(Cloudinary cloudinary) {
		try {

			Api api = cloudinary.api();

			// Create a simple named transformation from a string
			// System.out.println(
			// 		api.createTransformation("standard", "w_200,h_200,c_thumb,g_auto", ObjectUtils.emptyMap()));

			// Use named transformation standard
			// System.out.println(
			// 		cloudinary.url().transformation(new Transformation().named("standard")).generate("cheesecake"));

			// Use named transform with f_auto
//			System.out
//					.println(cloudinary.url().transformation(new Transformation().named("standard").fetchFormat("auto"))
//							.generate("cheesecake.jpg"));

			// Create and use complex transformation
//			System.out.println(cloudinary.url().transformation(new Transformation()
//					.overlay(new Layer().publicId("logo")).effect("brightness:-21").x(-10).y(-200).width(304)
//					.radius("max").chain()
//					.overlay(new TextLayer().fontFamily("Arial").fontSize(100).fontWeight("bold").text("Hello Jon"))
//					.opacity(70).x(-10).y(0).width(365)).generate("shirt_only.jpg"));

			// Create a named transformation for the complex transformation
//			System.out.println(api.createTransformation("complex", new Transformation()
//					.overlay(new Layer().publicId("logo")).effect("brightness:-21").x(-10).y(-200).width(304)
//					.radius("max").chain()
//					.overlay(new TextLayer().fontFamily("Coustard").fontSize(100).fontWeight("bold").text("Hello Jon"))
//					.opacity(70).y(0).x(-10).width(365).generate(), ObjectUtils.emptyMap()));

			// Use the complex named transform with f_auto
//			System.out
//					.println(cloudinary.url().transformation(new Transformation().named("complex").fetchFormat("auto"))
//							.generate("shirt_only.png"));

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
