import java.math.BigDecimal;
import java.math.RoundingMode;

public class euroToDollarConverter {
    public static void main (String args[]){
        double euroValue=3;
        double dollarValue=euroValue*1.15;
        System.out.println("Value in dollars "+dollarValue);


        BigDecimal euroBigDecimal =new BigDecimal(euroValue);
        double exchangeRate = 1.15;
        BigDecimal exchangeRateBigDecimal = new BigDecimal(exchangeRate);

        BigDecimal dollarBigDecimal = euroBigDecimal.multiply(exchangeRateBigDecimal);

        System.out.println("Euros "+euroValue+"\nDollars "+dollarBigDecimal.setScale(3, RoundingMode.UP).toString());
    }
}
