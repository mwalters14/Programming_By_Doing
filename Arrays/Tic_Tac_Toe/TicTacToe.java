import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
    Game game = new Game();
    char symbol = 'X';
    int player = 1;

		initBoard();
		displayBoard();
    game.start_game(player, symbol);


  }


static class Game {

    private static void start_game(int player, char symbol) {
      System.out.println("Player 1, you are X");
      System.out.println("Player 2, you are O\n");

      boolean winner = false;

      while (!winner) {
        int[] location = get_location(symbol);
        place_symbol(location, symbol);
        winner = check_ifWinner(symbol);
        displayBoard();

        if (winner) {
             winner(symbol);
         }
         player *= -1;
         symbol = change_symbol(player, symbol);
       }
    }

    private static char change_symbol(int player, char symbol) {
      if (player != 1) {
        symbol = 'O';
      } else {
        symbol = 'X';
      }
      return symbol;
    }
    private static void place_symbol(int[] location, char symbol) {
      for (int i = 0; i < 3 ; i++ ) {
        for (int e = 0; e < 3 ; e++ ) {
          if (board[location[0]][location[1]] == ' ') {
            board[location[0]][location[1]] = symbol;
          }
        }
      }
    }

    private static int[] get_location(char symbol) {
      Scanner keyboard = new Scanner(System.in);
      int[] location = new int[2];
      System.out.println(symbol + " choose your location");

      System.out.print("Row: ");
      int row = keyboard.nextInt();

      System.out.print("Column: ");
      int column = keyboard.nextInt();

      while (board[row][column] != ' ') {
        System.out.println("Board location is taken by " + board[row][column]);
        System.out.println("Please choose another location\n");

        System.out.print("Row: ");
        row = keyboard.nextInt();

        System.out.print("Column: ");
        column = keyboard.nextInt();
      }
      location[0] = row;
      location[1] = column;
      return location;
    }

    private static boolean check_ifWinner(char symbol) {
      boolean bool = false;
      for(int i = 0; i < 3; i++) {
        for (int e = 0; e < 3; e++ ) {
          if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
            bool = true;
          }
          if (board[0][e] == symbol && board[1][e] == symbol && board[2][e] == symbol) {
            bool = true;
          }
          if (board[i][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            bool = true;
          }
          if (board[i][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            bool = true;
          }
        }
      }
      return bool;
    }

    private static void winner(char symbol) {
      if (symbol == 'X') {
        System.out.println("Player 1 won!");
      } else {
        System.out.println("Player 2 won!");
      }
    }
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
