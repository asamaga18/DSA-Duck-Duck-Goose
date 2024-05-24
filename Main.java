import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask for player count
    System.out.println("Enter number of players: ");
    int players = input.nextInt();

    // Insert players into list
    while (players != 0) {
      CLList ddg = new CLList();
      for (int i = 1; i <= players; i++) {
        ddg.InsertAtTail(i);
      }
      int num = players;
      CLList.Node pointer = ddg.getFirst();

      // duck duck goose sequence
      while (num != 1) {
        ddg.DeleteNode(ddg.getData(ddg.getNext(ddg.getNext(pointer))));
        // Get next player
        pointer = ddg.getNext(ddg.getNext(pointer));
        num--;
      }

      // declaring winner
      System.out.println(ddg.getData(ddg.getFirst()) + " is the winner!");

      // reprompting until 0
      System.out.println("Enter number of players (0 to end program): ");
      players = input.nextInt();
    }
    input.close();
  }
}