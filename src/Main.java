public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i=1904; i<=2096; i = i + 4){
            System.out.println("Високосный год: "+i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i=1; i<=14; i++) {
            System.out.println(i * 7);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int i=0; i<=9; i++) {
            int k = (int) Math.pow (2, i);
            System.out.println(k);
        }
    }
}