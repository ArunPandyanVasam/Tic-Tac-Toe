import java.util.*;

public class TicTacMath {

	static int[] A = {'\0','\0','\0'};
	static int[] B = {'\0','\0','\0'};
	static int[] C = {'\0','\0','\0'};

	static void printGameBoard() {
		System.out.println("   1     2     3");
		System.out.println("A  " + A[0] + "  |  " + A[1] + "    | " + A[2]);
		System.out.println("  ------------------");
		System.out.println("B  " + B[0] + "  |  " + B[1] + "    | " + B[2]);
		System.out.println("  ------------------");
		System.out.println("C  " + C[0] + "  |  " + C[1] + "    | " + C[2]);
	}



	static void updateGameBoard(String cell, int number) {
		switch (cell) {
			case "A1":
				A[0] = number;
				break;
			case "A2":
				A[1] = number;
				break;
			case "A3":
				A[2] = number;
				break;
			case "B1":
				B[0] = number;
				break;
			case "B2":
				B[1] = number;
				break;
			case "B3":
				B[2] = number;
				break;
			case "C1":
				C[0] = number; 
				break;
			case "C2":
				C[1] = number;
				break;
			case "C3":
				C[2] = number;
				break;
		}

	}

	static String cell;
	static int cellValue;
	static Scanner scan= new Scanner(System.in);





	static void promptPlayer1() {
		System.out.print("Player1 cell: ");
		cell= scan.nextLine();

		System.out.print("Player1 number: ");
		cellValue= Integer.parseInt(scan.nextLine());
	}

	static void promptPlayer2() {
		System.out.print("Player2 cell: ");
		cell= scan.nextLine();

		System.out.print("Player2 number: ");
		cellValue= Integer.parseInt(scan.nextLine());
	}



	static boolean playerWon() {
		return  (A[0] + A[1] + A[2] == 15 ) ||
		        (B[0] + B[1] + B[2] == 15 ) ||
			(C[0] + C[1] + C[2] == 15 ) ||
			(A[0] + B[0] + C[0] == 15 ) ||
			(A[1] + B[1] + C[1] == 15 ) ||
			(A[2] + B[2] + C[2] == 15 ) ||
			(A[0] + B[1] + C[2] == 15 ) ||
			(C[0] + B[1] + A[2] == 15 );
	}


/*


 */




	public static void main(String[] args) {
		printGameBoard();

		for (int i = 0; i < 4; i++) {

			promptPlayer1();
			updateGameBoard(cell, cellValue);
			printGameBoard();
			if (playerWon()) {
				System.out.println("Player1 Won!");
				return;
			}// did someone win the game?


			promptPlayer2();
			updateGameBoard(cell, cellValue);
			printGameBoard();
			if (playerWon()) {
				System.out.println("Player2 Won!");
				return;
			}
			// did someone win the game?

			}
		for (int j=0; j<1; j++) {

			promptPlayer1();
			updateGameBoard(cell, cellValue);
			printGameBoard();
			if (playerWon()) {
				System.out.println("Player1 Won!");
				return;
			}
			System.out.println("Board is Full");
		}


	}
}

