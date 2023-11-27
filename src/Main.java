public class Main {
    public static void main(String[] args) {
        int myschet = 100;     // Объявляете переменные для входных данных и
        int fullness = 1100; // параметров программы: начального счёта,
        int edge = 100;               // суммы пополнения и тп
        int bonus = fullness / edge;

        if (fullness > 1000) {
            System.out.println("Ваш счет пополнен и добавлен бонус:" + (myschet + fullness + bonus));
        } else {
            System.out.println("Ваш счет пополнен:" + (myschet + fullness));
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}