import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();

    System.out.println("'O' choose your location");

    boolean won = false;

    while (!won) {
      System.out.print("Row: ");
      int row = keyboard.nextInt();

      System.out.print("Column: ");
      int column = keyboard.nextInt();
      for (int i = 0; i < 3 ; i++ ) {
        for (int e = 0; e < 3 ; e++ ) {
          if (board[row][column] == ' ') {
            board[row][column] = 'O';
          }
        }
      }
      boolean winner = check_winner();
      displayBoard();
      // if (winner) {
      //     System.out.println("You won!");
      // }
    }
  }

  public static boolean check_winner() {
    boolean bool = false;
    for(int i = 0; i < 3; i++) {
      for (int e = 0; e < 3; e++ ) {
        if (board[i][e] == 'O' && board[i][e] == 'O' && board[i][e] == 'O') {
          bool = true;
        }
      }
    }
    return bool;
  }

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}
