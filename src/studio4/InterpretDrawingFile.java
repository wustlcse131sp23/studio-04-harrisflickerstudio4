package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		Color made = new Color (redComponent, greenComponent, blueComponent);
		boolean isFilled = in.nextBoolean();
		if (shapeType.equals("rectangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			if (isFilled) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}}
		if (shapeType.equals("triangle")) {
			double [] x = new double[3];
			x [0] = in.nextDouble();
			x [1] = in.nextDouble();
			x [2] = in.nextDouble();
			double [] y = new double[3];
			y [0] = in.nextDouble();
			y [1] = in.nextDouble();
			y [2] = in.nextDouble();
			StdDraw.setPenColor(made);
			if (isFilled) {
				StdDraw.filledPolygon(x, y);				 
			}
			else {
				StdDraw.polygon(x,y);
			
			
		
		
		}
	}}}

