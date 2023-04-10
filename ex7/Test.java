package ex7;

import java.util.HashMap;

public class Test   {
    public static void main(String[] args) {
        CurrencyUnit usd = new USDCurrency();
        CurrencyUnit vnd = new VNDCurrency();
        CurrencyUnit jpy = new JPYCurrency();
        CurrencyUnit eur = new EURCurrency();
        CurrencyUnit gbp = new GBPCurrency();

        CurrencyMeasure amount = new CurrencyMeasure(50000, vnd);
        amount = amount.convert(usd);
        System.out.println(amount.getValue());
        System.out.println("--------------------");

        CurrencyMeasure amount2 = new CurrencyMeasure(500, gbp);
        amount2 = amount2.convert(usd);
        System.out.println(amount2.getValue());
        System.out.println("--------------------");

        CurrencyMeasure amount3 = new CurrencyMeasure(50000, jpy);
        amount3 = amount3.convert(vnd);
        System.out.println(amount3.getValue());
        System.out.println("--------------------");

        CurrencyMeasure amount4 = new CurrencyMeasure(300, eur);
        amount4 = amount4.convert(jpy);
        System.out.println(amount4.getValue());
        System.out.println("--------------------");


    }
}
