package cld_intro_java;


import com.cloudinary.Cloudinary;

/**
 * 
 * @author training
 *
 * The "Helper" methods generate strings for URL, image tag and video tag.
 * These methods return strings.  Only hen you request the URL provided in any of these
 * strings, will Cloudinary attempt to cache and return an asset.
 *
 */

public class Helper {

	/**
	 * 
	 * @param cloudinary
	 * @throws Exception
	 * 
	 * This function assumes that you have uploaded an image with public id "cheesecake" and
	 * video with public id "video".
	 * 
	 */
	public static void runner(Cloudinary cloudinary) throws Exception {
		System.out.println(cloudinary.url().generate("cheesecake"));
		System.out.println(cloudinary.url().imageTag("cheesecake"));
		System.out.println(cloudinary.url().videoTag("video"));
	}
	

}
