package budgetfordinner;

import java.util.Scanner;

public class FriendsShare {

  public int getFriendsNumber(int numberOfFriends) {

    int firendsDinnerCost = 0;

    for (Integer share = 0; share < numberOfFriends; share++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How much you have to pay?");
      int answer = scanner.nextInt();
      firendsDinnerCost += answer;
    }

    System.out.println("Friends dinner costs all together " + firendsDinnerCost + " euro/s.");

    return firendsDinnerCost;
  }
}
