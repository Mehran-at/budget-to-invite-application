package budgetfordinner;

public class BudgetApplication {
  public static void main(String[] args) {
    CheckBudget checkBudget = new CheckBudget();
    System.out.println(checkBudget.canInvite());
  }
}




//Exercise
//  Derek is having dinner with his friends and wants to treat them to celebrate that he got a job as developer. However, he’s not sure whether he’s got enough money to do it. In order to figure it out he needs to cover the following points:
//    . Ask himself how much money he has in his wallet.
//    . Ask himself how many friends are having dinner with him.
//    . Ask all his friends one by one how much money they have to pay.
//    . Decide whether he’s got enough money to invite them or not and say it.
//    Develop the following code:
//      a. Define a method to ask Derek how much money he has.
//      b. Define a method that asks all his friends and calculates the total money that they have to pay.
//      c. Write the code that Derek uses to say if he can invite his friends or not.
//    Hints:
//      > Try to separate every sub-problem in methods so they become easier to solve.
//      > Assume nobody needs cents that night.
//      > No need to validate for negative numbers or any other hocus-pocus.
//Exercise (Part 2)
//  Derek just realized that he also has to have his own bill into consideration to know whether he can invite everybody.
//    . If he already said he cannot invite his friends, he will not even bother on doing anything else.
//    . In case he said he could invite his friends, he will quickly update his calculation considering the money he also has to pay.
//    . If he can still invite his friends, then he says nothing else to hide the fact that he forgot to include his bill into consideration.
//    . If he cannot invite his friends after including his bill, he will explain that he made a mistake calculating and that he’s sorry but he cannot invite them today.
//  Extend the previous exercise with the following code:
//    a. Define a method to ask Derek how much he has to pay for what he ordered at the restaurant.
//    b. Update the previous code so that the new behavior is ensured.
//   Hints:
//     > Try to separate every sub-problem in methods so they become easier to solve.