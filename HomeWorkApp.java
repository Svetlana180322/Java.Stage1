class HomeWorkApp {
	public static void main(String[] args) {
	printThreeWords();
	checkSumSign();
	printColor();
	compareNumbers();
	}
	public static void printThreeWords() {
	System.out.println("Orange");
	System.out.println("Banana");
	System.out.println("Apple");
}
public static void checkSumSign() {
	int a, b;
	a = 5;
	b = -6;
	if (a + b >= 0) {System.out.println("Сумма положительная polozhitelnaya");}
	else {System.out.println("Сумма отрицательная otritsatelnaya");}
}
public static void printColor() {
	int value;
	value = -105;
	if (value <= 0) {System.out.println("Красный red");}
	else if (value <= 100) {System.out.println("Желтый yellow");}
	else {System.out.println("Зеленый green");}
}
public static void compareNumbers() {
	int a, b;
	a = 15;
	b = 0;
	if (a >= b) {System.out.println("a >= b");}
	else {System.out.println("a < b");}
}}

