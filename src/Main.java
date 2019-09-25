public class Main {
    public static void main(String[] args) {
        // TODO: За каждую полную тысячу рублей: 50 бонусов
        int amountForPurchases = 20_000;
        int purchases = 200_000;
        int amountForBonus = 1_000;

        if (purchases >= 1 && purchases <= 15_000) {
            byte bonusesPerAmount = 50;
            int bonus = purchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
        } if (purchases >= 15_001 && purchases <= 150_000) {
            byte bonusesPerAmount = 70;
            int bonus = purchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
        } if (purchases >= 150_000) {
            byte bonusesPerAmount = 100;
            int bonus = purchases / amountForBonus * bonusesPerAmount;
            int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount;
                System.out.println(accumulatedBonuses);
                System.out.println(bonus);
            }
        }
    }

