public class ForLoop {

    public static void main(String[] args) {

        int searchFor = 0;
        int count;
        double total;

        String [] stuff = {"string 1", "Texas", "junk", "123", "Mars", "Falcon"};
        int[] numbers = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127, 77, 955 };

        while (true) {
            String what = Utils.getInput(
                    "\n1 while       2 do       3 average   4 total\n" +
                            "5 for index   6 fori     7 forx     8 looking\n" +
                            "9 double     10 count   	    exit");
            switch (what.toLowerCase()) {
                case "1":
                case "while":
                    count = 100;
                    while (count > 11) {
                        System.out.println("Loop 1: Count is: " + count);
                        count--;
                    }
                    break;

                case "2":
                case "do":
                    //  how is the output different between these two while loops?
                    count = 50;
                    do {
                        System.out.println("Loop 2: Count is: " + count);
                        count++;
                    } while (count < 11);
                    break;

                case "3":
                case "average":
                    count = 0;
                    total = 0;
                    //  how is the output different between these two while loops?
                    while (count < numbers.length) {
                        total += numbers[count];
                        count++;
                    }
                    System.out.println("Average is: " + total/(float)count);
                    break;

                case "4":
                case "total":
                    count = 0;
                    total = 0;
                    while (count < numbers.length) {
                        total += count;
                        System.out.println("Total is: " + count);
                        System.out.println("Total is: " + total);
                        count++;
                    }
                    System.out.println("Total is: " + total);
                    break;

                case "5":
                case "for index":
                    for (int i = 1; i < 11; i++) {
                        System.out.println("For index: Count is: " + i);
                    }
                    break;

                case "6":
                case "fori":
                    for (int i = 0; i < numbers.length; i++) {
                        int number = numbers[i];
                        System.out.println("Fori: " + i + " Item is: " + number);
                    }
                    break;

                case "7":
                case "forx":
                    for (int number : numbers) {
                        System.out.println("Extended For item: element is: " + number);
                    }
                    for (String str : stuff) {
                        System.out.println("str = " + str);
                    }
                    break;

                case "8":
                case "looking":
                    searchFor = Utils.getNumber("What are you looking for? ");

                    int foundIt = Looping.lookingFor(searchFor);

                    if (foundIt >= 0) {
                        System.out.println("Found " + searchFor + " at index " + foundIt);
                    } else {
                        System.out.println(searchFor + " not in the array");
                    }
                    break;

                case "9":
                case "double":
                    int[] foundIt2;
                    foundIt2 = Looping.lookingForDouble(searchFor);

                    if (foundIt2 != null) {
                        System.out.println("Found " + searchFor + " at [" + foundIt2[0] + ", " + foundIt2[1] + "]");
                    } else {
                        System.out.println(searchFor + " not in the array");
                    }
                    break;

                case "10":
                case "count":
                    String sLetter = Utils.getInput("What letter are you looking for? ");
                    char letter = sLetter.charAt(0);

                    String searchMe = "peter piper picked a peck of pickled peppers";
                    int charCount = Looping.countLetter(searchMe, letter);
                    System.out.println("Found " + charCount + " " + letter + "'s in the string.");
                    break;

                case "exit"	:
                    return;
            }
        }
    }
}
