package cld_intro_java;

import com.cloudinary.Cloudinary;

/**
 * @author training
 *
 */
public class CloudinaryUtils {
	/**
	 * @param args
	 */
	public static void runner(Cloudinary cloudinary) {
		System.out.println(cloudinary.config.cloudName);
		System.out.println(cloudinary.url().generate("cheesecake"));
		System.out.println(cloudinary.url().imageTag("cheesecake"));
		System.out.println(cloudinary.url().videoTag("video"));
	}
}
