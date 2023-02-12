package Que1;

public class SimpleInterest {
	
	public static void main(String args[]) {
		
		var P=5000;
		var R=7;
		var T=5;
		FunctionalInterface FuncObj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(FuncObj.SI_Interest(P, R, T));
	}
	
	interface FunctionalInterface{
		double SI_Interest(double P,double R,double T);
	}
}
