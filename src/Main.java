public class Main {
    public static void main(String[] args) {
        int [] weights = { 90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights [0] = 90;
        int januaryWeight = weights [0];
        System.out.println(januaryWeight);
        System.out.println(weights [4]);
        System.out.println(weights[11]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
        task1();task2();
    }
    public static void task1(){

        // Задача 1.1
        int [] dogs = new int [3];
        dogs [0] = 1;
        dogs [1] = 2;
        dogs [2] = 3;
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }

        // Задача 1.2
        double [] arr = {1.57, 7.654, 9.986};
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

        // Задача 1.3
        double [] numbers = {1.08, 2.7, 3.9, 4.8, 7.7 };
        for (int b = 0; b < numbers.length; b++) {
            System.out.println(numbers[b]);
        }

        // Задача 2
        System.out.println(dogs[0] + ", " +  dogs[1] + ", " + dogs[2]);
        System.out.println(arr [0] + ", " +  arr [1] + ", " + arr [2]);
        System.out.println(numbers [0] + ", " +  numbers [1] + ", " + numbers [2]+ ", " +  numbers [3] + ", " + numbers [4]);

        // Задача 3
        System.out.println(dogs[2] + ", " +  dogs[1] + ", " + dogs[0]);
        System.out.println(arr [2] + ", " +  arr [1] + ", " + arr [0]);
        System.out.println(numbers [4] + ", " +  numbers [3] + ", " + numbers [2]+ ", " +  numbers [1] + ", " + numbers [0]);}
    public static void task2(){

        // Задача 4
        int [] dogs = new int [3];
        dogs [0] = 1 + 1;
        dogs [1] = 2;
        dogs [2] = 3 + 1;
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }



    }
}