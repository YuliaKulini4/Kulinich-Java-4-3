public class Main {
    public static void main(String[] args) {
    CreditPaymentService service = new CreditPaymentService();
    int creditTerm = 3;
    int creditAmount = 1_000_000;
    double creditRate = 9.99;
        double monthCreditRate = service.calculate(creditTerm, creditAmount, creditRate);
        System.out.printf("%8.0f", monthCreditRate);;
}
}
