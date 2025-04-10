import java.math.BigDecimal;
import java.math.RoundingMode;

public class Taxes {
    public static void main(String[] args) {
        double price = 9.99;
        double vat = 0.23;
        double gross = price * (1 + vat);
        double gross_total = gross * 10000;
        double net_total = gross_total / (1 + vat);

        System.out.println("Double calculations:");
        System.out.println("Gross price: " + gross);
        System.out.println("Total gross: " + gross_total);
        System.out.println("Total net: " + net_total);

        BigDecimal price2 = new BigDecimal("9.99");
        BigDecimal vat2 = new BigDecimal("0.23");
        BigDecimal gross2 = price2.multiply(vat2.add(BigDecimal.ONE));
        BigDecimal gross_total2 = gross2.multiply(new BigDecimal("10000"));
        BigDecimal net_total2 = gross_total2.divide(vat2.add(BigDecimal.ONE),
            2,RoundingMode.HALF_UP);

        System.out.println("\nBigDecimal calculations:");
        System.out.println("Gross price: " + gross2);
        System.out.println("Total gross: " + gross_total2);
        System.out.println("Total net: " + net_total2);

        System.out.println("\nConclusions:");
        System.out.println("The BigDecimal is more accurate");
    }
}