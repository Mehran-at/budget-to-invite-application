package budgetfordinner;

public class CheckBudget {
  TotalMoney totalMoney = new TotalMoney(140, 22, 4);
  FriendsShare friendsShare = new FriendsShare();

  public Boolean canInvite() {

    int derekTotalMoney = totalMoney.getDerekTotalMoney();
    int derekFoodCost = totalMoney.getDerekFoodCost();
    int friendsFoodShare = friendsShare.getFriendsNumber(totalMoney.getNumberOfFriendsOfDerek());

    return derekTotalMoney >= derekFoodCost + friendsFoodShare;
  }
}
