package cld_intro_java;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.transformation.Layer;
import com.cloudinary.transformation.TextLayer;

public class AestheticsTransformations {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void runner(Cloudinary cloudinary) {
		try {

			// Radius rounded corners and transparent background
//			System.out
//					.println(cloudinary
//							.url().transformation(new Transformation().width(300).height(300).crop("thumb")
//									.gravity("auto").fetchFormat("auto").quality("auto").radius("max"))
//							.generate("dog.jpg"));

			// Borders '10px_solid_rgb:bde4fb'
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().border("10px_solid_rgb:bde4fb").width(300).height(300)
//							.crop("thumb").gravity("auto").fetchFormat("auto").quality("auto").radius("max"))
//					.generate("dog.jpg"));

			// crop pad to capture full image with padding to prevent skew
			// change AR vertical to horizontal
//			System.out
//					.println(cloudinary.url()
//							.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto")
//									.fetchFormat("auto").quality("auto").radius("max").background("red"))
//							.generate("face.jpg"));

			// Effects and Filters
			// color tint
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("face")
//							.fetchFormat("auto").quality("auto").radius("max").effect("tint:40:magenta"))
//					.generate("face.jpg"));

			// Duotone: chained transformation grayscale + tint
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("face")
//							.fetchFormat("auto").quality("auto").radius("max").effect("grayscale").chain()
//							.effect("tint:40:magenta").fetchFormat("auto").quality("auto"))
//					.generate("face.jpg"));

			// Outline effect for transparent images
//			System.out.println(cloudinary.url().transformation(
//					new Transformation().width(300).crop("scale").quality("auto").effect("outline:15").color("orange"))
//					.generate("blackberry.jpg"));

			// Improve color, contrast, lightness
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").gravity("auto")
//							.fetchFormat("auto").quality("auto").radius("max").effect("improve:outdoor"))
//					.generate("blackberry.jpg"));

			// Art Filters
			// Zorro
//			System.out
//					.println(cloudinary
//							.url().transformation(new Transformation().width(300).height(300).crop("thumb")
//									.gravity("auto").fetchFormat("auto").quality("auto").effect("art:zorro"))
//							.generate("lake.jpg"));

			// Cartoonify
//			System.out
//					.println(cloudinary
//							.url().transformation(new Transformation().width(300).height(300).crop("thumb")
//									.gravity("auto").fetchFormat("auto").quality("auto").effect("cartoonify"))
//							.generate("lake.jpg"));

			// Overlay
			// Text over image
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").chain()
//							.overlay(new TextLayer().fontFamily("Arial").text("Tutoring").fontSize(30))
//							.background("white").color("blue").gravity("north_west").x(10).y(10))
//					.generate("faces.jpg"));

			// Image over image
//			System.out.println(cloudinary.url()
//					.transformation(new Transformation().width(300).height(300).crop("thumb").chain()
//							.overlay(new Layer().publicId("logo")).height("50").gravity("south_west").x(10).y(10))
//					.generate("faces.jpg"));

			// Text over video
//			System.out.println(cloudinary.url().resourceType("video")
//					.transformation(new Transformation().width(300).crop("scale").chain()
//							.overlay(new TextLayer().fontFamily("Arial").text("Earth").fontSize(30)).background("white")
//							.color("blue").gravity("north_west").x(10).y(10))
//					.generate("earth.mp4"));

			// Image over video
//			System.out.println(cloudinary.url().resourceType("video")
//					.transformation(new Transformation().width(400).crop("scale").chain()
//							.overlay(new Layer().publicId("logo")).height("50").gravity("north_west").x(10).y(10))
//					.generate("earth.mp4"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
