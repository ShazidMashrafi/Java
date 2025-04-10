import java.util.Scanner;
class Matrix {
    int[][] data;
    int rows;
    int cols;
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public void set(int i, int j, int value) {
        data[i][j] = value;
    }
    public int get(int i, int j) {
        return data[i][j];
    }
    public int getRows() {
        return rows;
    }
public int getCols() {
        return cols;
    }
    public static boolean areAddable(Matrix a, Matrix b) {
        return a.getRows() == b.getRows() && a.getCols() == b.getCols();
    }
    public static boolean areMultipliable(Matrix a, Matrix b) {
        return a.getCols() == b.getRows();
    }
    public static Matrix add(Matrix a, Matrix b) {
        if (!areAddable(a, b)) {
            System.out.println("Matrices must have the same dimensions to be added.");
            return null;
        }
        Matrix result = new Matrix(a.getRows(), a.getCols());
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                result.set(i, j, a.get(i, j) + b.get(i, j));
            }
        }
        return result;
    }
    public static Matrix multiply(Matrix a, Matrix b) {
        if (!areMultipliable(a, b)) {
            System.out.println(
                    "Number of columns in the first matrix must be equal 
                    to the number of rows in the second matrix for multiplication.");
            return null;
        }
        Matrix result = new Matrix(a.getRows(), b.getCols());
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                int sum = 0;
                for (int k = 0; k < a.getCols(); k++) {
                    sum += a.get(i, k) * b.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for row " + (i + 1) + " column " + (j + 1) + ": ");
                data[i][j] = scanner.nextInt();
            }
        }
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        Matrix a = new Matrix(rowsA, colsA);
        System.out.println("Enter values for matrix A:");
        a.inputMatrix();

        System.out.print("Enter number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        Matrix b = new Matrix(rowsB, colsB);
        System.out.println("Enter values for matrix B:");
        b.inputMatrix();

        System.out.println("Matrix A:");
        a.print();
        System.out.println("Matrix B:");
        b.print();
        if (Matrix.areAddable(a, b)) {
            System.out.println("Sum of A and B:");
            Matrix sum = Matrix.add(a, b);
            sum.print();
        } else {
            System.out.println("Matrices A and B cannot be added due to different dimensions.");
        }
        if (Matrix.areMultipliable(a, b)) {
            System.out.println("Product of A and B:");
            Matrix product = Matrix.multiply(a, b);
            product.print();
        } else {
            System.out.println("Matrices A and B cannot be multiplied due to incompatible dimensions.");
        }
    }
}