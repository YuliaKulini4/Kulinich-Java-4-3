public class CreditPaymentService {
public double calculate (int creditTerm, int creditAmount, double creditRate){
    double monthCreditRate = creditRate / 100 / 12 ;
    double monthCreditPayment = creditAmount *  monthCreditRate * Math.pow ((1 + monthCreditRate), creditTerm * 12) / ( Math.pow ((1 + monthCreditRate), creditTerm * 12) - 1);

    return monthCreditPayment;
}
}
