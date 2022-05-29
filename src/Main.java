public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int addMoney = 1500;

        int bonus = addMoney > 1000 ? addMoney / 100 : 0;
        int sum = balance + addMoney + bonus;

        System.out.println("Итоговая сумма: " + sum);

        System.out.println("Бонус: " + bonus);
    }
}
