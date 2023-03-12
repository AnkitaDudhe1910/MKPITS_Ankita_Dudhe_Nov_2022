/*  Game interface and chess and checkers classes:
    Create an interface called Game that has two abstract methods: play() and getRules(). Then create two classes called
    Chess and Checkers that implement the Game interface. The Chess class should have an instance variable for the number
    of pieces, and the Checkers class should have an instance variable for the size of the board. Implement the play() and
    getRules() methods for each class. */

 interface Game
 {
	 void play();
	 void getRules();
 }
 class Chess implements Game
 {
	 String noPiece = "16";
	public void play()
	 {
		 System.out.println("number of pieces in chess is "+noPiece);
		  System.out.println("played by two person");
	 }
	public void getRules()
	 {
		  System.out.println("A piece moves to a vacant square except when capturing an opponent's piece");
		  System.out.println("the knight and casting pieces cannot jump over the pieces");
		  System.out.println(" ");
	 }
 }
 class Checkers implements Game
  {
 	 String sizeBoard = "8 * 8";
 	public void play()
 	 {
 		 System.out.println("size of checkers board is "+sizeBoard);
 		 System.out.println("played by two person");
 	 }
 	public void getRules()
 	 {
 		  System.out.println("A move consist of moving piece diagonally to an adjacent unoccupied square");

 	 }
 }
 class Program_15
 {
   public static void main(String [] args)
   {
	   Chess ch = new Chess();
	   ch.play();
	   ch.getRules();
	   Checkers chrs = new Checkers();
	   chrs.play();
	   chrs.getRules();
   }
  }