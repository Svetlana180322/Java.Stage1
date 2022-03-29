/**
  * Java level 1. Homework - 3
  *
  *@author Svetlana Budzinskaia
  *@version 29.03.2022
  */
  
class Lesson3Homework {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(arr.length);
        for(int i = 0; i<arr.length; i++) {
           arr[i] = arr[i]==1? 0 : 1;
           System.out.print(arr[i] + "; ");
        }
        System.out.println();
         
        int[] arr2 = new int[100];
        for(int i = 0; i<arr2.length; i++) {
            arr2[i] = i+1;
            System.out.print(arr2[i] + "; ");
        }
        System.out.println();
         
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(arr3.length);
        for(int i = 0; i<arr3.length; i++) {
            arr3[i] = arr3[i]<6? arr3[i]*2 : arr3[i];
            System.out.print(arr3[i] + "; ");
        }
        System.out.println();

        int[][] arr4 = new int[5][5];
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                if (i==j) {
                    arr4[i][j] = 1;
                }
                if (i+j==4) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + "; ");
            }
            System.out.println();
        }
        fillMassive(6, 2);
    }
     
    static int[] fillMassive(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "; ");
        }
        return arr;
    }
}
	 