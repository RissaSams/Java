public class ArrayExamples {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[6] = 22;
        myArray[2] = 3209;
        myArray[0] = 8690;
        myArray[myArray.length-1] = 682;

        String[] myFamily = new String[7];
        myFamily[0] = "Susan";
        myFamily[1] = "Cherelle";
        myFamily[2] = "Marissa";
        myFamily[3] = "Fayth";
        myFamily[4] = "Kilo";
        myFamily[5] = "Gracellyn";
        myFamily[6] = "Korrey";

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + ": " + myArray[i]);
        }

        for (int i = 0; i < myFamily.length; i++) {
            System.out.println(i + ": " + myFamily[i].replace("a", "@"));
        }
    }
}
