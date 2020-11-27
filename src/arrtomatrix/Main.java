package arrtomatrix;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();

		int x = rand.nextInt(7);

		int y = rand.nextInt(10);

		int[] array = new int[100];

		System.out.println("x=" + x + " y=" + y);

		int start = y * 10 + x;

		for (int k = 0; k < 10; k++) {
			array[x] = 2;
			array[x + 3] = 2;
			x = x + 10;
		}

		for (int j = 0; j < 4; j++) {
			array[start] = 1;
			start++;
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(array[i] + " ");
		}

	}

}
