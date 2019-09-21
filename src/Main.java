public class Main {
    public static void main(String[] args) {
        // TODO: За каждую полную тысячу рублей: 50 бонусов
        int amountForPurchases = 9_000;
        int purchases = 5_000;
        int amountForBonus = 1000;
        int bonusesPerAmount = 50;
        int bonus = purchases / amountForBonus * bonusesPerAmount;
        int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount;

        System.out.println(accumulatedBonuses);
        System.out.println(bonus);
    }
}
