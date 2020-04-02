public class Junk {
    public static void main(String[] args) {
        int num1, num2;
        while (true) {
            num1 = Utils.getNumber("Enter #1 ");
            num2 = Utils.getNumber("Enter #2 ");
            if (num1 > num2) {
                System.out.println(num1 + " is greater than " + num2 + ".");
            } else if (num1 < num2) {
                System.out.println(num1 + " is less than " + num2 + ".");
            } else {
                System.out.println(num1 + " and " + num2 + " is the same.");
                break;
            }
        }
        while (true) {
            String str, proTeam;
            str = Utils.getInput("Enter a State: ");
            switch (str) {
                case "tx" :  proTeam = "Mavericks";         break;
                case "az" :  proTeam = "Suns";              break;
                case "ca" :  proTeam = "Warriors";          break;
                case "fl" :  proTeam = "Magic";             break;
                case "ok" :  proTeam = "Thunder";           break;
                default   :  proTeam = "State Not Matched"; break;
            }
            System.out.println("The professional team from " + str + " is " + proTeam);
        }
    }
}
