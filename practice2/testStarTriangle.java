package practice2;

public class testStarTriangle {

	public static void main(String[] args) {
		starTriangle Pyramid = new starTriangle(5);
//		starTriangle rightAlignedPyramid = new starTriangle(5);
//		starTriangle centerAlignedPyramid = new starTriangle(5);

		System.out.println("Left Aligned Pyramid:");
		System.out.println(Pyramid.drawLeftAlignedPyramid());

		System.out.println("Right Aligned Pyramid:");
		System.out.println(Pyramid.drawRightAlignedPyramid());

		System.out.println("Center Aligned Pyramid:");
		System.out.println(Pyramid.drawCenterAlignedPyramid());
	}

}