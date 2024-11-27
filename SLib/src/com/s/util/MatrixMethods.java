package com.s.util;

public class MatrixMethods {

	public static void printMat(double[][] mat) {
		// Method to print out a 3x3 matrix row by row
		
		for (int col = 0; col <= mat.length-1; col++) {
			System.out.println("Col " + (col + 1));
			for (int row = 0; row <= mat[col].length-1; row++) {
				System.out.println(mat[row][col]);
			}
		}
		
	}
	
	public static double[][] transpose(double[][] mat) {
		// Method to transpose a matrix
		double[][] newMat = new double[mat[0].length][mat.length];
		
		for (int c = 0; c <= mat.length-1; c++) {
			if (mat[c].length != mat[0].length) {
				Error.throwError("MatrixMethods transpose error: column length inconsistent");
				return null;
			}
			for (int r = 0; r <= mat[c].length-1; r++) {
				newMat[r][c] = mat[c][r]; 
			}
		}
		
		
		return newMat;
	}
	
}
