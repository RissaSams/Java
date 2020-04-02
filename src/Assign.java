public class Assign {
    public static int getDayNumber(String day) {
        while (true) {
            int dayNumber;
            day = Utils.getInput("Enter day of week: ");
            switch (day.toLowerCase().substring(0,3)) {
                case "sun":
                    dayNumber = 0;
                    break;
                case "mon":
                    dayNumber = 1;
                    break;
                case "tue":
                    dayNumber = 2;
                    break;
                case "wed":
                    dayNumber = 3;
                    break;
                case "thu":
                    dayNumber = 4;
                    break;
                case "fri":
                    dayNumber = 5;
                    break;
                default:
                    dayNumber = 6;
                    break;
            }
            System.out.println(day + " is the " + dayNumber + " day of the week.");
        }
    }
}
