package bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {

        //1.通过传递double类型的数据来创建BigDecimal对象
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);

        //2.通过传递String类型的数据来创建BigDecimal对象
        BigDecimal bd4 = new BigDecimal("0.01");
        BigDecimal bd5 = new BigDecimal("0.09");
        BigDecimal bd6 = bd4.add(bd5);

        //减法
        BigDecimal bd7 = bd4.subtract(bd5);
        //乘法
        BigDecimal bd8 = bd4.multiply(bd5);
        //除法
        BigDecimal bd9 = bd4.divide(bd5);
        System.out.println(bd4);





    }
}
