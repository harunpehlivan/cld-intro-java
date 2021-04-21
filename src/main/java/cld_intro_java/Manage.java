package cld_intro_java;

import java.util.Map;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class Manage {

	@SuppressWarnings({ "unchecked", "unused" })
	public static void runner(Cloudinary cloudinary) {

		try {
			// Use an empty map for no options
			Map<String, Object> noOptions = ObjectUtils.emptyMap();

			Api api = cloudinary.api();

			// List all assets (default is 10)
//			CourseUtils.jsonPrint(api.resources(noOptions));

			// List up to 500 assets
//			CourseUtils.jsonPrint(api.resources(ObjectUtils.asMap("max_results",500)));

			// Search by prefix (public id "starts with")
//			CourseUtils.jsonPrint(api.resources(ObjectUtils.asMap("type", "upload", "prefix", "sample")));

			// Rename an asset, default overwrite is false
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
//					ObjectUtils.asMap("public_id", "cheesecake")));
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().rename("cheesecake", "my_cheesecake", ObjectUtils.asMap("overwrite", true)));

			// Rename an asset, default overwrite is false
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
//			ObjectUtils.asMap("public_id","cheesecake")));
//			
//			CourseUtils.jsonPrint(cloudinary.uploader().rename("cheesecake",
//			"my_cheesecake",ObjectUtils.asMap("overwrite",true)));

			// Remove an asset
			// Upload API: destroy
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().upload("./assets/lake.jpg", ObjectUtils.asMap("public_id", "lake")));
//			CourseUtils.jsonPrint(cloudinary.uploader().destroy("lake", ObjectUtils.asMap("invalidate", true)));

			// Admin API: delete_resources
			// Upload 2 assets and them remove them
//			CourseUtils
//					.jsonPrint(cloudinary.uploader().upload("./assets/dog.jpg", ObjectUtils.asMap("public_id", "dog")));
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().upload("./assets/lake.jpg", ObjectUtils.asMap("public_id", "lake")));
//			CourseUtils.jsonPrint(
//					api.deleteResources(Arrays.asList("dog", "lake"), ObjectUtils.asMap("invalidate", true)));

			// Tag on Upload
			// By string with comma-separated tags
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/blackberry.jpg",
//					ObjectUtils.asMap("public_id", "blackberry", "tags", Arrays.asList("fruit", "berries"))));

			// Tag after Upload
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().upload("./assets/lake.jpg", ObjectUtils.asMap("public_id", "lake")));
//			CourseUtils
//					.jsonPrint(cloudinary.uploader().addTag("water", new String[] { "lake" }, ObjectUtils.emptyMap()));
//			CourseUtils.jsonPrint(api.resourcesByTag("water", ObjectUtils.emptyMap()));

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		// Cloudinary config
		Cloudinary cloudinary = new Cloudinary();
		// Reference the admin API
		Api api = cloudinary.api();

		// Manage: Admin API and Upload API
		// List all assets (default is 10)
		// System.out.println(api.resources(ObjectUtils.emptyMap()));

		// List up to 500 assets
		// System.out.println(api.resources(ObjectUtils.asMap("max_results",500)));

		// Search by prefix (public id "starts with")
//		System.out.println(api.resources(ObjectUtils.asMap("type", "upload", "prefix", "sample")));

		// Rename an asset, default overwrite is false
		// System.out.println(cloudinary.uploader().upload("./assets/cheesecake.jpg",
		// ObjectUtils.asMap("public_id","cheesecake")));
		// System.out.println(cloudinary.uploader().rename("cheesecake",
		// "my_cheesecake",ObjectUtils.asMap("overwrite",true)));

		// Remove an asset
		// Upload API: destroy
		// System.out.println(cloudinary.uploader().upload("./assets/lake.jpg",
		// ObjectUtils.asMap("public_id","lake")));
		// System.out.println(cloudinary.uploader().destroy("lake",
		// ObjectUtils.asMap("invalidate",true)));

		// Admin API: delete_resource
		// Upload 2 assets and them remove them
		// System.out.println(cloudinary.uploader().upload("./assets/dog.jpg",
		// ObjectUtils.asMap("public_id","dog")));
		// System.out.println(cloudinary.uploader().upload("./assets/lake.jpg",
		// ObjectUtils.asMap("public_id","lake")));
		// System.out.println(api.deleteResources(Arrays.asList("dog","lake"),
		// ObjectUtils.asMap("invalidate",true)));

		// Tag on Upload
		// By string with comma-separated tags
		// System.out.println(cloudinary.uploader().upload("./assets/blackberry.jpg",
		// ObjectUtils.asMap("public_id","blackberry","tags",Arrays.asList("fruit","berries"))));

		// Tag after Upload
		// System.out.println(cloudinary.uploader().upload("./assets/lake.jpg",
		// ObjectUtils.asMap("public_id","lake")));
		// System.out.println(cloudinary.uploader().addTag("water", new
		// String[]{"lake"}, ObjectUtils.emptyMap()));
		// System.out.println(api.resourcesByTag("water", ObjectUtils.emptyMap()));

		// Remove a single tag by name and then search by removed tag and unremoved tag
		// System.out.println(cloudinary.uploader().removeTag("berries", new
		// String[]{"blackberry"}, ObjectUtils.emptyMap()));
		// System.out.println(api.resourcesByTag("berries", ObjectUtils.emptyMap()));
		// System.out.println(api.resourcesByTag("fruit", ObjectUtils.emptyMap()));

		// Remove all tags
		// System.out.println(cloudinary.uploader().removeAllTags(new
		// String[]{"blackberry", "lake"}, ObjectUtils.emptyMap()));
		// System.out.println(api.resourcesByTag("fruit", ObjectUtils.emptyMap()));
		// System.out.println(api.resourcesByTag("water", ObjectUtils.emptyMap()));

	}

}
