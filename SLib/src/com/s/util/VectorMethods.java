package com.s.util;

public class VectorMethods {

	public static double dot(double[] v1, double[] v2) {
		// Method to do the dot product of two vectors v1 and v2
		double fin = 0;
		
		if (v1.length == v2.length) {
			for (int i = 0; i < v1.length; i++) {
				fin = fin + (v1[i] * v2[i]);
			}
		} else {
			fin = Double.NaN;
		}
		
		return fin;
	}

	
}
