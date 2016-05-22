package standardVariation;

import java.util.ArrayList;

public class GetStandardVariation {
	
	public static void main(String args[]){
		ArrayList<Integer> setValues = new ArrayList<Integer>();

		setValues.add(9);
		setValues.add(2);
		setValues.add(5);
		setValues.add(4);
		setValues.add(12);
		setValues.add(7);
		setValues.add(8);
		setValues.add(11);
		setValues.add(9);
		setValues.add(3);
		setValues.add(7);
		setValues.add(4);
		setValues.add(12);
		setValues.add(5);
		setValues.add(4);
		setValues.add(10);
		setValues.add(9);
		setValues.add(6);
		setValues.add(9);
		setValues.add(4);
		double meany = getMean(setValues);
		System.out.println("Mean Result: " + meany);
		ArrayList<Double> resultSq = getSquaredRes(setValues, meany);
		System.out.println("Square Root: " + resultSq);
		double stanVar = getStandardVariance(resultSq);
		System.out.println("Standard Variance: " + stanVar);
		double root = Math.sqrt(stanVar);
		System.out.println("Final Result: " + root);
	}
	
	public static double getMean(ArrayList<Integer> givenValues) {
		double ctr = 0;
		double resultX;
		for(int x = 0; x < givenValues.size(); x++){
			ctr += givenValues.get(x);
		}
		resultX = ctr / givenValues.size();
		
		return resultX;
	}
	
	public static ArrayList<Double> getSquaredRes(ArrayList<Integer> givenValues, double mean) {
		ArrayList<Double> tempList = new ArrayList<Double>();
		for(int x = 0; x < givenValues.size(); x++){
			double getSquaredRes = givenValues.get(x) - mean;
			tempList.add(Math.pow(getSquaredRes, 2));
		}
		
		return tempList;
	}
	
	public static double getStandardVariance(ArrayList<Double> givenValues){
		double getVar = 0;
		for(int x = 0; x < givenValues.size(); x++){
			getVar += givenValues.get(x);
		}
		double minOne = givenValues.size();
		double divRes = 1 / minOne;
		return divRes * getVar;
	}
}
