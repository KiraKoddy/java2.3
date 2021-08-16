public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int newBalance = 1100;
        int finalBalance = (balance + newBalance);
        int bonus = 0;

        if (newBalance > 1000) {
            bonus = (newBalance / 100);

            System.out.println("Итоговый баланс: " + finalBalance);
            System.out.println("Количество бонусных рублей: " + bonus);

        } else {
            System.out.println("Итоговый баланс: " + finalBalance);
            System.out.println("Количество бонусных рублей: " + bonus);
        }

        System.out.println("Итого баланс: " + (finalBalance + bonus));
    }
}