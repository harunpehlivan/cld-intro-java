package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;

public class OptimizeTransformations {
	public static void runner(Cloudinary cloudinary) {
		try {

		} catch (Error e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static void main(String[] args) {
		Cloudinary cloudinary = new Cloudinary();

		// Cropping

		// Scale is default - accepts 2 ints and first is width, second is height
		// Scale default cropping mode with 1 dimension is scale

		System.out.println(
				cloudinary.url().transformation(new Transformation().width(300).crop("scale")).imageTag("cheesecake"));

		// Scale with 2 dimensions may skew
		System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(400).crop("scale"))
				.imageTag("cheesecake"));

		// Fit: applying 2 dimensins without skew
		// Media info shows width 300 and height adjusted to prevent skew
		System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(400).crop("fit"))
				.imageTag("cheesecake"));

		// Two dimensions with no skew and guaranteed exact dimensions rendered with
		// possible padding
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(400).crop("pad").background("auto"))
				.imageTag("cheesecake"));

		// Cropping takes a chunk out of an image
		System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("crop"))
				.imageTag("dog"));

		// Use gravity with thumb to get focus on someting interesting or a compass
		// point
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto"))
				.imageTag("dog"));
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto"))
				.imageTag("cheesecake"));

		// Crop with gravity: auto, fill vs thumb
		// Not all crop types can use gravity, only: crop, fill, lfill, fill_pad (auto g
		// only) or thumb
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(300).crop("fill").gravity("auto"))
				.imageTag("face"));
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto"))
				.imageTag("face"));

		// Gravity face
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(400).crop("crop").gravity("face"))
				.imageTag("working"));
		System.out.println(cloudinary.url()
				.transformation(new Transformation().width(300).height(400).crop("thumb").gravity("face"))
				.imageTag("working"));

		// Format - Add auto format
		System.out.println(cloudinary.url()
				.transformation(new Transformation().height(400).crop("fill").gravity("auto").fetchFormat("auto"))
				.imageTag("lake"));

		// Compression using quality
		System.out.println(cloudinary.url().transformation(new Transformation().quality("auto")).imageTag("lake"));

		// Auto everything - format and quality
		System.out.println(cloudinary.url().transformation(
				new Transformation().height(400).crop("fill").gravity("auto").quality("auto").fetchFormat("auto"))
				.imageTag("lake"));

	}

}
