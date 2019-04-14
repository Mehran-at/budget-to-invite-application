package budgetfordinner;

public class TotalMoney {
  private int derekTotalMoney;
  private int derekFoodCost;
  private int  numberOfFriendsOfDerek;

  public TotalMoney(int derekTotalMoney, int derekFoodCost, int numberOfFriendsOfDerek) {
    this.derekTotalMoney = derekTotalMoney;
    this.derekFoodCost = derekFoodCost;
    this.numberOfFriendsOfDerek = numberOfFriendsOfDerek;
  }

  public int getDerekTotalMoney() {
    return derekTotalMoney;
  }

  public int getDerekFoodCost() {
    return derekFoodCost;
  }

  public int getNumberOfFriendsOfDerek() {
    return numberOfFriendsOfDerek;
  }
}
