package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

/**
 * Hello world!
 *
 */
public class Upload 
{

	public static void runner(Cloudinary cloudinary) throws Exception {
		CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",ObjectUtils.emptyMap()));
	}
	
	
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main( String[] args ) throws Exception
	{
		Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
		System.out.println(cloudinary.config.cloudName);

		//upload an image
//		Map<String,Object> options = ObjectUtils.emptyMap();
//		JSONObject result = (JSONObject) cloudinary.uploader().upload("./assets/cheesecake.jpg",options);
		CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",ObjectUtils.emptyMap()));


		//upload a video
//		jsonPrint(cloudinary.uploader().upload("./assets/video.mp4",ObjectUtils.asMap("resource_type", "video")));

		//upload a raw file
		//System.out.println(cloudinary.uploader().upload("./assets/BLKCHCRY.TTF",ObjectUtils.asMap("resource_type", "raw")))

		//upload an image with public_id
	//	JSONObject json = new JSONObject(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("public_id", "dog"))); // Convert text to object
		//System.out.println(new JSONObject(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("public_id", "dog"))).get("url")); 
//		System.out.println(new JSONObject(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("public_id", "dog"))).toString(4)); 


		//System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("public_id", "dog2"))));

		//With use_filename and unique filename
//		System.out.println(cloudinary.uploader().upload("./assets/cheesecake.jpg",ObjectUtils.asMap("use_filename", true, "unique_filename", true)));

		//With use_filename and not unique filename
		CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",ObjectUtils.asMap("use_filename", true, "unique_filename", false)));

		//Upload image to a folder using public id
		//System.out.println(cloudinary.uploader().upload("./assets/cheesecake.jpg",ObjectUtils.asMap("public_id", "food/my_favorite/cheesecake")));
		
		//Upload image to a folder using folder
		//System.out.println(cloudinary.uploader().upload("./assets/dog.jpg",ObjectUtils.asMap("folder", "pets/my_favorite")));

		//Upload a remote asset
		//System.out.println(cloudinary.uploader().upload("https://cdn.pixabay.com/photo/2015/03/26/09/39/cupcakes-690040__480.jpg",ObjectUtils.emptyMap()));
	}
}
