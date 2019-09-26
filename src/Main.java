public class Main {
    public static void main(String[] args) {
        int amountOfPreviousPurchases = 20_000;
        int amountOfPurchases = 200_000;
        int amountForBonus = 1_000;

        if (amountOfPurchases >= 1 && amountOfPurchases <= 15_000) {
            int bonusesPerAmount = 50;
            int bonus = amountOfPurchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountOfPreviousPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
        } if (amountOfPurchases >= 15_001 && amountOfPurchases <= 150_000) {
            int bonusesPerAmount = 70;
            int bonus = amountOfPurchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountOfPreviousPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
        }if (amountOfPurchases >= 150_000) {
            int bonusesPerAmount = 100;
            int bonus = amountOfPurchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountOfPreviousPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
            }
        }
    }

