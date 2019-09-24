public class Main {
    public static void main(String[] args) {
        // TODO: За каждую полную тысячу рублей: 50 бонусов
        int amountForPurchases = 20_000;
        int purchases = 20_000;
        byte blueCard = 1;
        byte silverCard = 1;
        byte goldCard = 1;
        int amountForBonus = 1000;
        byte bonusesPerAmount = 50;
        int bonus = purchases / amountForBonus * bonusesPerAmount;
        int accumulatedBonuses = amountForPurchases / amountForBonus * bonusesPerAmount;


        if (blueCard >=1 && blueCard <= 15_000) {
            System.out.println(accumulatedBonuses);
            System.out.println(bonus);
        } else {
            if (silverCard >= 15_001 && silverCard <= 150_000)
            System.out.println(accumulatedBonuses);
            System.out.println(bonus);
        } if (goldCard >= 150_000){
            System.out.println(accumulatedBonuses);
            System.out.println(bonus);
        }

        }
    }

