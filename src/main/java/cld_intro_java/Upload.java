package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class Upload {

	/**
	 * 
	 * @param cloudinary Authenticated Cloudinary Object
	 * 
	 *                   Suppressing warning on "unchecked" because
	 *                   ObjectUtils.emptyMap and ObjectUtils.asMap can't guarantee
	 *                   run time code will return <Object, String>.
	 * 
	 *                   Suppressing warning on "unused" for training we may not use
	 *                   or comment out
	 * 
	 */
	public static void runner(Cloudinary cloudinary) {
		try {
			// Use an empty map for no options
			// upload an image with no options
			// CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
			// ObjectUtils.emptyMap()));

			// upload a video
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4", 
//					ObjectUtils.asMap("resource_type", "video")));

//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4", 
//			ObjectUtils.asMap("resource_type", "auto")));

			// upload a raw file
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/BLKCHCRY.TTF", 
//					ObjectUtils.asMap("resource_type", "raw")));

			// upload an image with public_id
//			CourseUtils
//					.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg", ObjectUtils.asMap("public_id", "dog")));

			// upload a video with public_id
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/earth.mp4",
//					ObjectUtils.asMap("resource_type", "video", "public_id", "earth")));

			// With use_filename and not unique filename - the public id will be the
			// filename
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
//					ObjectUtils.asMap("use_filename", true, "unique_filename", false)));

			// Upload image to a folder using public id
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
//					ObjectUtils.asMap("public_id", "food/my_favorite/cheesecake")));

			// Upload image to a folder using folder
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg", 
//					ObjectUtils.asMap("folder", "pets/my_favorite")));

			// Upload a remote asset
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__480.jpg", 
//					ObjectUtils.emptyMap()));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
