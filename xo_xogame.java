
package xo_game;
import java.util.Scanner;
public class Xo_Game {

      public static void main(String[] args) {
         
    System.out.println("\t \t X O GAME ");
    System.out.println(" \t Choose a place : \n and please don't Choose a taken  place .  ");
      
        char [][] board = new char [3][3]; 
   getBoard(board); 
 
    int user;
   while(true){
    Scanner input=new Scanner(System.in);
    
     // first player.
     System.out.println("Enter a number from (1-9) for player  X : ");
     user = input.nextInt();
   placeToken( board ,user  , 'X' );
 
     if(checkWinner( 'X' , board )){
            System.out.println("\n X WINS !!");
            break;
        }else if (noWinner(board)) {
        System.out.println("No winner");
         break;
        }
    
     //second player.
     System.out.println("Enter a number from (1-9) for player  O : ");
     user = input.nextInt();
   placeToken( board ,user  , 'O' );
    
      if(checkWinner( 'O' , board )){
            System.out.println("\n O WINS !!");
            break;
        }else if (noWinner(board)) {
        System.out.println("No winner");
         break;
        } 
   } 
 }
    
    
    public static void placeToken(char [][] gameBoard  ,int user, char gamer ){
 
     switch(user){
         case 1 :
             gameBoard [0][0] =gamer; 
             break;
         case 2 :
             gameBoard [0][1] =gamer;
             break;
         case 3 :
             gameBoard [0][2] =gamer;
             break;
         case 4 :
             gameBoard [1][0] =gamer;
             break;
         case 5 :
             gameBoard [1][1] =gamer;
             break;
         case 6 :
             gameBoard [1][2] =gamer;
             break;
         case 7 :
             gameBoard [2][0] =gamer;
             break;
         case 8 :
             gameBoard [2][1] =gamer;
             break;
         case 9 :
             gameBoard [2][2] =gamer;
             break;
         default:
         break;
         
     }
      getBoard(gameBoard); 
   
    }
       
    public static boolean checkWinner(char ch , char[][] board) {
                 
    for (int row = 0; row < board.length ; row++)
      if (ch == board[row][0] && ch == board[row][1] && ch == board[row][2])
         return true;    
 
    for (int cloumn = 0; cloumn < board.length ; cloumn++)
      if (ch == board[0][cloumn] && ch == board[1][cloumn] && ch == board[2][cloumn]) 
         return true;
  
    if (ch == board[0][0] && ch == board[1][1] && ch == board[2][2]) 
         return true;
  
     if( ch == board[0][2] && ch == board[1][1] && ch == board[2][0])
         return true;
     
     return false;
  }
      
    public static void getBoard(char [][] gBoard){
          
    System.out.println("\n=============");

    for (int row = 0; row <gBoard.length ; row++) {
      System.out.print("| ");
      for (int cloumn = 0; cloumn < gBoard[row].length; cloumn++)
        System.out.print(gBoard[row][cloumn] != '\u0000' ?  gBoard[row][cloumn] + " | " : "  | ");
      System.out.println("\n=============");
    }
  }
     
    
      public static boolean noWinner(char [][] board){
            for (int row = 0; row< board.length; row++)
      for (int cloumn = 0; cloumn < board[row].length; cloumn++)
        if (board[row][cloumn] == '\u0000') return false;
 
    return true;
          
      }
}
     
    
