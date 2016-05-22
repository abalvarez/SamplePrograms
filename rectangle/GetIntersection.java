package rectangle;

import java.awt.Rectangle;

public class GetIntersection {
	public static void main(String args[]){
		/*
		 * x - the specified X coordinate
		 * y - the specified Y coordinate
		 * width - the width of the Rectangle
		 * height - the height of the Rectangle
		 * 
		 */
		Rectangle rect1 = new Rectangle(100, 100, 200, 240);
		Rectangle rect2 = new Rectangle(120, 80, 80, 120);
		Rectangle intersection = rect1.intersection(rect2);
		System.out.println(intersection);
	}
}
