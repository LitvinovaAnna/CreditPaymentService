public class CreditPaymentService {
    public double calculate(double sum, double percent, double months) { // Формула sum*(ПС/1-(1+ПС)^months)

        double result;
        double pc = percent / (100 * 12); // месячная процентная ставка
        double a = 1 + pc; // выражение 1+ПС
        double b = months; // степень
        double c = Math.pow(a, -b); // (1+ПС)^months
        double d = 1 - c; // выражение 1-с
        double e = pc / d; // выражение (pc/(1-c))
        result = sum * (pc / (1 - c));

        return result;
    }
}
