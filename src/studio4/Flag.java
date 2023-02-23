package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(255, 40, 170);
		StdDraw.filledRectangle(.3, .3, .3, .3);
		StdDraw.rectangle(3, 13, 3, 3);
		StdDraw.rectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(.16, .13, .6, .3);
		StdDraw.setPenColor(170, 40, 250);
		StdDraw.rectangle(11, 8, 11, 1);
		StdDraw.rectangle(8, 8, 1, 8);
	}
}