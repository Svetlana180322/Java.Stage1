/**
  * Java level 1. Homework - 2
  *
  *@author Svetlana Budzinskaia
  *@version 27.03.2022
  */
  
 class Lesson2Homework {
	 public static void main (String[] args) {
		 System.out.println(checkSum(5, 24));
		 isNegative(0);
		 System.out.println(isPositive(-4));
		 printString("test string", 3);
	 }
	
	static boolean checkSum(int a, int b){
		if (a + b > 10 && a + b <= 20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void isNegative(int a) {
		System.out.println(a >= 0? "positive" : "negative");
	}
	
	static boolean isPositive(int a) {
		return a < 0;
	}
	
	static void printString(String s, int i) {
		for (int k=0; k<i; k++) {
			System.out.println(s);
		}
	}
 }

 