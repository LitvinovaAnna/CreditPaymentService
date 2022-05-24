public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double a = 1000000;
        double b = 9.99;
        double c = 12;
        double CPS = service.calculate(a, b, c);
        System.out.println(CPS);
    }
}
