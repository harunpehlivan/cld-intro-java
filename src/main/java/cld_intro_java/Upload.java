package cld_intro_java;

import java.util.Map;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

/**
 * Hello world!
 *
 */
public class Upload {
	@SuppressWarnings({ "unchecked", "unused" })

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
			Map<String, Object> noOptions = ObjectUtils.emptyMap();
			Map<String, Object> options = null;

			// upload an image with no options
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg", noOptions));

			// upload a video
			options = ObjectUtils.asMap("resource_type", "video");
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/video.mp4",options));

			// upload a raw file
			options = ObjectUtils.asMap("resource_type", "raw");
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/BLKCHCRY.TTF",options));

			// upload an image with public_id
			options = ObjectUtils.asMap("public_id", "dog");
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg",options));

			// upload a video with public_id
			options = ObjectUtils.asMap("resource_type", "video", "public_id", "video");
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/video.mp4", options));

			// With use_filename and not unique filename - the public id will be the
			// filename
			options = ObjectUtils.asMap("use_filename", true, "unique_filename", false);
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg", options));

			// Upload image to a folder using public id
			options = ObjectUtils.asMap("public_id", "food/my_favorite/cheesecake");
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",options));

			// Upload image to a folder using folder
			options = ObjectUtils.asMap("folder", "pets/my_favorite");
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("folder", "pets/my_favorite")));

			// Upload a remote asset
//				CourseUtils.jsonPrint(cloudinary.uploader().upload("https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__480.jpg",noOptions));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
