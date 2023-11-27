public class Main {
    public static void main(String[] args) {
        int balance = 100;     // Объявляете переменные для входных данных и
        int topUp = 1100; // параметров программы: начального счёта,
        int parameter = 100;               // суммы пополнения и тп
        int bonus = topUp / parameter;

        if (topUp > 1000) {
            System.out.println("Ваш счет пополнен и добавлен бонус:" + (balance + topUp + bonus));
        } else {
            System.out.println("Ваш счет пополнен:" + (balance + topUp));
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}