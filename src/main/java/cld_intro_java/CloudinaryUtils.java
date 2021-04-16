package cld_intro_java;

import com.cloudinary.Cloudinary;

/**
 * @author rebeccapeltz
 *
 */
public class CloudinaryUtils {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// these utility functions just create strings
		Cloudinary cloudinary = new Cloudinary(System.getenv("CLOUDINARY_URL"));
		System.out.println(cloudinary.config.cloudName);
		System.out.println(cloudinary.url().generate("sample"));
		System.out.println(cloudinary.url().imageTag("sample"));
		System.out.println(cloudinary.url().videoTag("test"));
	}
}
