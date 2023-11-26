public class Main {
    public static void main(String[] args) {
        int Myschet = 100;     // Объявляете переменные для входных данных и
        int popolnenie = 1100; // параметров программы: начального счёта,
        int K = 100 ;               // суммы пополнения и тп
        int bonus = popolnenie/K;

        if (popolnenie >= 1000) {
            System.out.println("Ваш счет пополнен и добавлен бонус:" + (Myschet + popolnenie + bonus));
        } else {
            System.out.println("Ваш счет пополнен:" + (Myschet + popolnenie));
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}