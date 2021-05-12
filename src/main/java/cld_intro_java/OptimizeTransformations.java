package cld_intro_java;

import com.cloudinary.Cloudinary;

public class OptimizeTransformations {
	@SuppressWarnings("rawtypes")
	public static void runner(Cloudinary cloudinary) {
		try {

			// Cropping

			// Scale default cropping mode with 1 dimension is scale
//			System.out.println(cloudinary.url().transformation(new Transformation().width(300).crop("scale"))
//					.generate("cheesecake"));

			// Scale with 2 dimensions may skew
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(400).crop("scale")).generate("cheesecake"));

			// Fit: applying 2 dimensions without skew
			// Media info shows width of 300 and height of 400 adjusted to prevent skew
//			System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(400).crop("fit"))
//					.generate("cheesecake"));

			// Two dimensions with no skew and guaranteed exact dimensions rendered with
			// possible padding
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(400).crop("pad").background("auto"))
//					.generate("cheesecake"));

			// Cropping takes a chunk out of an image
//			System.out.println(cloudinary.url().transformation(new Transformation().width(300).height(300).crop("crop"))
//					.generate("dog"));

			// Use gravity with thumb to get focus on something interesting or a compass
			// point
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto"))
//					.generate("dog"));

			// Crop with gravity: auto, fill vs thumb
			// Not all crop types can use gravity, only: crop, thumb, fill, lfill, fill_pad
			// or
			// thumb

//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("fill").gravity("auto"))
//					.generate("face"));
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto"))
//					.generate("face"));

			// Gravity face
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(400).crop("crop").gravity("face"))
//					.generate("working"));
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(400).crop("thumb").gravity("face"))
//					.generate("working"));
//
//			// Format - Add auto format
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().height(400).crop("fill").gravity("auto").fetchFormat("auto"))
//					.generate("lake"));

			// Compression using quality
//			System.out.println(cloudinary.url().transformation(new Transformation().quality("auto")).generate("lake"));

			// Auto everything - format and quality
//			System.out.println(cloudinary.url().transformation(
//					new Transformation().height(400).crop("fill").gravity("auto").quality("auto").fetchFormat("auto"))
//					.generate("lake"));

		} catch (Error e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
