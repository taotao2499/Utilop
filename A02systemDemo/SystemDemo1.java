package A02systemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {


        long l = System.currentTimeMillis();
        System.out.println(l);//1745997109397

        //拷贝数组
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("=============");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());

    }

}
