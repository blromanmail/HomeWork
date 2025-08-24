public class Task_1 {
    public static void main(String[] args) {
        //Задача 1
        int b = 120;
        int c = 65;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("Результат:" + a);

        //Задача 2
        int n=26;
        int x=n/10+n%10;
        System.out.println("Результат:" + x);

        //Задача 3
        int y=555;
        int z=y/100+(y%100)/10+y%10;
        System.out.println("Результат:" + z);

        //Задача 4
        double d= 70.8;
        int e = (int)(d + 0.5);
        System.out.println("Результат:" + e);

        //Задача 5
        int q = 55;
        int w = 7;
        int k = q / w;
        int l = q % w;
        System.out.println("Результат:" + (k + " и остаток " + l));

        //Задача 6
        int t = 1;
        int s = 2;
        t = t + s;
        s = t - s;
        t = t - s;
        System.out.println(t);
        System.out.println(s);
    }
}
