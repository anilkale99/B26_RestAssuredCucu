package Vinayak_Assignment;

public class MatrixTable {
	public static void main(String[] args) {
        int num = 1;

        for (int row = 0; row < 3; row++) {
            for (int coloum = 0; coloum < 3; coloum++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }

}
