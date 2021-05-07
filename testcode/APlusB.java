import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class APlusB{
    public static void main(String[] args) {
        Scanner jin=new Scanner(System.in);

        // read till end of file
        while(jin.hasNextBigInteger()) {
            BigInteger a = jin.nextBigInteger();
            BigInteger b = jin.nextBigInteger();
            System.out.println(a.add(b));
        }
        jin.close();
    }
}