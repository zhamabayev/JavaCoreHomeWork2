package JavaCore.HomeWork2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super(String.format("Невалидное значение в ячейке [%d, %d]\n", row, col ));
    }
}
