package JavaCore.HomeWork2;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            try {
                int result = methodException(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.getMessage();
        }
    }

    public static int methodException(String [][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Количество строк в массиве - 4!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (4 != arr[i].length) {
                throw new MyArraySizeException("Количество столбцов в массиве - 4!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return  sum;
    }
}
