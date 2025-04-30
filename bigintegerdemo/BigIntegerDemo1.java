package bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //
        Random r = new Random();
        BigInteger bi1 = new BigInteger(4, r);
        System.out.println(bi1);


        //
        BigInteger bi2 = new BigInteger("123456789012345678901234567890");
        System.out.println(bi2);

        //
        BigInteger bi3 = new BigInteger("123456789012345678901234567890", 16);
        System.out.println(bi3);
        //



    }
}
