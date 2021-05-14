package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

public class AutouploadFetch {
	@SuppressWarnings("rawtypes")

	public static void runner(Cloudinary cloudinary) {
		try {
			// Fetch from a remote server (no Upload API)
//			System.out.println(cloudinary.url().type("fetch")
//					.generate("https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__480.jpg"));

			// Map "remote-media" to
			// "https://cloudinary-training.github.io/cld-advanced-concepts/assets/

			// Auto-upload Image with cropping
//			System.out.println(cloudinary.url().generate("remote-media/images/dolphin.jpg"));
//
//			System.out
//					.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("thumb"))
//							.generate("remote-media/images/dolphin.jpg"));

			// Auto-upload Video with cropping
//			System.out.println(cloudinary.url().resourceType("video").generate("remote-media/video/rooster.mp4"));

//			System.out.println(cloudinary.url().resourceType("video")
//					.transformation(new Transformation().width(300).height(300).crop("fit"))
//					.generate("remote-media/video/rooster.mp4"));

		} catch (Error e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}