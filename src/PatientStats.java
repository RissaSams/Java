public class PatientStats {
    public static void main(String[] args) {

        String msg = "";
        String patientName, reasonForVisit, feelingLike;
        double temp, systolic, diastolic, height;
        int weight, age, howDoYouFeel;

        patientName    = Utils.getInput("Patient Name: ");
        temp           = Utils.getDouble("Temperature: ");
        systolic       = Utils.getDouble("Systolic: ");
        diastolic      = Utils.getDouble("Diastolic: ");
        height         = Utils.getDouble("Height: ");
        weight         = Utils.getNumber("Weight: ");
        age            = Utils.getNumber("Age: ");
        howDoYouFeel   = Utils.getNumber("How do you feel today on a scale of 1-5: ", 5);
        reasonForVisit = Utils.getInput("Why are you coming in today: ");

        if (temp <= 72) {
            msg += " has been dead for a few days ";
        } else if (temp <= 87.5) {
            msg += " recently died ";
        } else if (temp <= 96) {
            msg += " patient a blanket ";
        } else if (temp <= 99) {
            msg += " is normal ";
        } else if (temp <= 102) {
            msg += " needs to take some aspirin ";
        } else if (temp <= 106) {
            msg += " needs to call the ER ";
        } else if (temp > 106) {
            msg += " needs to call the CDC ";
        }

        if (height <= 1.5) {
            msg += " needs growth hormones ";
        } else if (height <= 2.3) {
            msg += " is a good height ";
        } else if (height >= 2.4) {
            msg += " should try out for the Mavs ";
        }

        switch (howDoYouFeel) {
            case 1: feelingLike = "Patient feels terrible ";            break;
            case 2: feelingLike = "Patient has had worse days ";        break;
            case 3: feelingLike = "Patient feels meh ";                 break;
            case 4: feelingLike = "Patient feels cautious ";            break;
            case 5: feelingLike = "Patient has no reason to be here ";  break;
            default: feelingLike = "";                                  break;
        }

        System.out.println(patientName + " " + msg + " " + feelingLike + " and " + reasonForVisit);
    }
}
