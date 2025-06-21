class Finance {
    public static double calculateCompoundValue(int principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateCompoundValue(principal, rate, years - 1) * (1 + rate);
    }
}

public class Main {
    public static void main(String[] args) {
        int principal = 7000;
        double annualRate = 0.08;
        int timePeriod = 10;

        double futureValue = Finance.calculateCompoundValue(principal, annualRate, timePeriod);

        System.out.printf("Future Value after %d years: ₹%.2f\n", timePeriod, futureValue);
    }
}
