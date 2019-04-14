package budgetfordinner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckBudgetTest {
  CheckBudget checkBudget = new CheckBudget();

  @Test
  void canInvite() {
//    How should I write atst for this
    int derekTotalMoney = 140;
    int derekFoodCost = 22;
    int friendsFoodShare = 58;
    Boolean actual = checkBudget.canInvite();
    Boolean expected = true;
    Assertions.assertEquals(expected, actual);
  }
}