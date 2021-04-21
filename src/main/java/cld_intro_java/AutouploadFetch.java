package cld_intro_java;

import com.cloudinary.Cloudinary;

public class AutouploadFetch {
	@SuppressWarnings("rawtypes")

	public static void runner(Cloudinary cloudinary) {
		try {

		} catch (Error e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static void main(String[] args) {
		Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
		System.out.println(cloudinary.config.cloudName);

		// Fetch from a remote server (no Upload API)
		// System.out.println(cloudinary.url().type("fetch").imageTag("https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__480.jpg"));

		// Map "remote-media" to
		// "https://cloudinary-training.github.io/cld-advanced-concepts/assets/
		// Auto-upload Image with cropping
		// System.out.println(cloudinary.url().imageTag("remote-media/images/dolphin"));

		// Auto-upload Video with cropping
		// System.out.println(cloudinary.url().videoTag("remote-media/video/rooster"));

//		System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("thumb")).imageTag("remote-media/images/dolphin.jpg"));
//		System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("thumb")).generate("remote-media/images/dolphin.jpg"));

	}

}