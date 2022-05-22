/**
  * JКласс Object. Homework - 2
  *
  *@author Svetlana Budzinskaia
  *@version 21.05.2022
  */


public class LessonJavaExceptionHomework {
    
    static void SizeExceptionTest(String[][] arr) throws MyArraySizeException{
        if (arr.length != 4) throw new MyArraySizeException("Wrong rows quantity");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Wrong columns quantity at row #" + i);
        }
    }
    static void TypeExceptionTest(String Value, int y, int x) throws MyArrayDataException{
        int intValue = 0;
                try {
                    intValue = Integer.parseInt(Value);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("There is no integer value in  row #"+x+" col #" + y);
                    }
    }
    static int Summarize(String[][] arr) {
        int Summa = 0;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x <4; x++) {
                try {
                    TypeExceptionTest(arr[x][y], y, x);
                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                        }
                        Summa = Summa + Integer.parseInt(arr[x][y]);
            }
        }
        return Summa;
    }
    public static void main (String[] args) {
        String[][] array = {
                {"1", "2", "h", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        // String[][] array = {
                // {"1", "2", "3", "4"},
                // {"1", "2", "3", "4"},
                // {"1", "2", "3", "4"}
        // };
        // String[][] array = {
                // {"1", "2", "3", "4"},
                // {"1", "2", "4"},
                // {"1", "2", "3", "4"},
                // {"1", "2", "3", "4"}
        // };
        try {
            SizeExceptionTest(array);
       } catch (MyArraySizeException e) {
           e.printStackTrace();
       }
       System.out.println("The summ of all values in the array is "+Summarize(array));
    }

  }

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}