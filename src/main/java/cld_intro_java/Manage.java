package cld_intro_java;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;

import java.util.Arrays;

import org.cloudinary.json.JSONObject;

import com.cloudinary.utils.ObjectUtils;

public class Manage {

	@SuppressWarnings({ "unused" })
	public static void runner(Cloudinary cloudinary) {

		try {
			// Use an empty map for no options

			Api api = cloudinary.api();

			// Manage: Admin API and Upload API
			// List all assets (default is 10)
//			CourseUtils.jsonPrint(api.resources(ObjectUtils.emptyMap()));

			// List up to 500 assets
//			CourseUtils.jsonPrint(api.resources(ObjectUtils.asMap("max_results", 500)));
//			ApiResponse response = (ApiResponse) api.resources(ObjectUtils.asMap("max_results", 500));
//			@SuppressWarnings("unchecked")
//			JSONObject responseJSON = new JSONObject(api.resources(ObjectUtils.asMap("max_results", 500)));
//			System.out.println("number of assets:" + responseJSON.getJSONArray("resources").length());

			// Search by prefix (public id "starts with")
//			CourseUtils.jsonPrint(api.resources(ObjectUtils.asMap("type", "upload", "prefix", "sample")));

			// Rename an asset, default overwrite is false
//			CourseUtils.jsonPrint(cloudinary.uploader().upload("./assets/cheesecake.jpg",
//					ObjectUtils.asMap("public_id", "cheesecake")));
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().rename("cheesecake", "my_cheesecake", ObjectUtils.asMap("overwrite", true)));

			// Remove an asset
			// Upload API: destroy
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().upload("./assets/lake.jpg", ObjectUtils.asMap("public_id", "lake")));
//			CourseUtils.jsonPrint(cloudinary.uploader().destroy("lake", ObjectUtils.asMap("invalidate", true)));

			// Admin API: delete_resource
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

			// Remove a single tag by name and then search by removed tag and existing tag
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().removeTag("berries", new String[] { "blackberry" }, ObjectUtils.emptyMap()));
//			CourseUtils.jsonPrint(api.resourcesByTag("berries", ObjectUtils.asMap("tags", true)));
//			CourseUtils.jsonPrint(api.resourcesByTag("fruit", ObjectUtils.asMap("tags", true)));

			// Remove all tags
//			CourseUtils.jsonPrint(
//					cloudinary.uploader().removeAllTags(new String[] { "blackberry", "lake" }, ObjectUtils.emptyMap()));
//			CourseUtils.jsonPrint(api.resourcesByTag("fruit", ObjectUtils.asMap("tags", true)));
//			CourseUtils.jsonPrint(api.resourcesByTag("water", ObjectUtils.asMap("tags", true)));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
