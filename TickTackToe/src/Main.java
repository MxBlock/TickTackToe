import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Wie viele Objekte soll es geben?");
		int k = Integer.parseInt(scan());
		int[][] table = new int[k][k];

		// zeroTable(table);
		fillTable(table);
		// ausgebenTable(table);

		System.out.println("Was möchtest du spielen - Zahl von 0 bis " + table.length);

		switch (table[Integer.parseInt(scan())][((int) (Math.random()) * table.length)]) {
		case 0:
			System.out.println("Unentschieden");
			break;
		case 1:
			System.out.println("Player win");
			break;
		case -1:
			System.out.println("PC win");
			break;
		default:
			System.out.println("ERROR");
		}

	}

	@SuppressWarnings("resource")
	public static String scan() {
		return new Scanner(System.in).nextLine();
	}

	public static void ausgebenTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void zeroTable(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = 0;
			}
		}
	}

	public static void fillTable(int[][] table) {
		int k = -1;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if (i == j) {
					table[i][j] = 0;
				} else if (i > j) {
					table[i][j] = (i - j) % 2 == 0 ? -1 : 1;
				} else {
					table[i][j] = (j - i) % 2 == 0 ? 1 : -1;
				}
			}
		}
	}
}
