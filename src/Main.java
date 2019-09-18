public class Main {
    public static void main(String[] args) {
        // TODO: За каждую полную тысячу рублей: 50 бонусов
        int amountForPurchases = 9_000; // сумма предыдущих покупок
        int purchases = 5_000; // стоимость текущей покупки
        int amountForBonus = 1000;
        int bonusesPerAmount = 50;
        int bonus = purchases / amountForBonus * bonusesPerAmount;
        int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount; // вычисление бонусов за предыдущие покупки

        System.out.println(accumulatedBonuses);
        System.out.println(bonus);
    }
}
