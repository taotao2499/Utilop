package MathDemo1;

public class MathDemo2 {
    public static void main(String[] args) {
        // 计算绝对值
        System.out.println(Math.abs(-10)); // 输出 10
        // 计算最大值和最小值
        System.out.println(Math.max(5, 10)); // 输出 10
        System.out.println(Math.min(5, 10)); // 输出 5
        // 计算平方根
        System.out.println(Math.sqrt(16)); // 输出 4.0
        // 计算幂次
        System.out.println(Math.pow(2, 3)); // 输出 8.0

        //向上取整
        System.out.println(Math.ceil(3.14));//输出4.0
        //向下取整
        System.out.println(Math.floor(3.14));//输出3.0
        //四舍五入
        System.out.println(Math.round(3.14));//输出3
        System.out.println(Math.round(3.54));//输出4
        //随机数
        System.out.println(Math.random());//输出0.0到1.0之间的随机数

    }
}
