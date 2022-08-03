package cld_intro_java;

import java.io.IOException;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class UploadForTransformations {
	public static void runner(Cloudinary cloudinary) throws IOException {

		// Upload files to be used in transformation exercises
		System.out.println(
				cloudinary.uploader().upload("./assets/cheesecake.jpg", ObjectUtils.asMap("public_id", "cheesecake")));
		System.out.println(
					cloudinary.uploader().upload("./assets/eagle-fish.jpg", ObjectUtils.asMap("public_id", "eagle-fish")));
		System.out.println(
				cloudinary.uploader().upload("./assets/blackberry.jpg", ObjectUtils.asMap("public_id", "blackberry")));
		System.out.println(cloudinary.uploader().upload("./assets/dog.jpg", ObjectUtils.asMap("public_id", "dog")));
		System.out.println(cloudinary.uploader().upload("./assets/face.jpg", ObjectUtils.asMap("public_id", "face")));
		System.out.println(cloudinary.uploader().upload("./assets/faces.jpg", ObjectUtils.asMap("public_id", "faces")));
		System.out.println(cloudinary.uploader().upload("./assets/lake.jpg", ObjectUtils.asMap("public_id", "lake")));
		System.out.println(cloudinary.uploader().upload("./assets/logo.png", ObjectUtils.asMap("public_id", "logo")));
		System.out.println(
				cloudinary.uploader().upload("./assets/shirt_only.png", ObjectUtils.asMap("public_id", "shirt_only")));
		System.out.println(
				cloudinary.uploader().upload("./assets/working.jpg", ObjectUtils.asMap("public_id", "working")));
		System.out.println(
				cloudinary.uploader().upload("./assets/grapes.jpg", ObjectUtils.asMap("public_id", "grapes")));
		System.out.println(cloudinary.uploader().upload("./assets/earth.mp4",
				ObjectUtils.asMap("public_id", "earth", "resource_type", "video")));
	}

}
