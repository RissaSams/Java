public class Quiz1 {
    public static void main(String[] args) {
        System.out.println("This is my Quiz 1!");

        String[] students = new String[6];
        students[0] = "Marissa";
        students[1] = "Maurice";
        students[2] = "Rain";
        students[3] = "Steven";
        students[4] = "Julius";
        students[5] = "Jarvis";

        int[] numbers = new int[10];
        numbers[2] = 356;
        numbers[0] = 55;
        numbers[6] = 25;
        numbers[8] = 200;

        double[] money = new double[15];
        money[0] = 99.99;
        money[money.length-1] = (double)99.99;

        System.out.println("This array of students has " + students.length + " students in it.");
        System.out.printf("The last student is %s.\n", students[students.length-1]);
        students[0] = "Gary";
        students[students.length-1] = "Marissa";

        int arraySize = (int) (Math.random() * 50) + 10;
        int[] myRandom = new int[arraySize];
        System.out.println("My array is this big: " + myRandom.length);

        for (int i = 0; i < myRandom.length; i++) {
            myRandom[i] = (int)(Math.random() * 100) + 5;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + myRandom[i]);
        }

        for (int i = myRandom.length-1; i > myRandom.length-6; i--) {
            System.out.println(i + ": " + myRandom[i]);
        }


    }
}
