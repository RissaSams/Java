import javax.swing.*;

public class Assingment {

    public static float priceOfShipping (float orderValue, boolean satDelivery, String destination) {
        float baseShippingCost;

        switch (destination) {
            case "US":
             baseShippingCost = 20.0f;
             if (satDelivery) {
                 baseShippingCost += 10.00f;
             } if (orderValue <100) {
                 baseShippingCost -= 5.00f;
            }
             break;
            case "Canada":
             baseShippingCost = 32.0f;
             if (satDelivery) {
                 baseShippingCost += 20.00f;
             } if (orderValue > 100) {
                 baseShippingCost -= 7.00f;
            }
            break;
            default:
             baseShippingCost = 25.0f;
             if (satDelivery) {
                 baseShippingCost += 12.00f;
             } if (orderValue > 100) {
                 baseShippingCost -= 7.00f;
            }
        }
        System.out.println();
        return baseShippingCost;
    }

    public static void main(String[] args) {
        float  orderValue;
        boolean  satDelivery;
        String  destination;

        orderValue = 200.00f;
        satDelivery = true;
        destination = "Canada";

        float cost = priceOfShipping(orderValue, satDelivery, destination);
        System.out.println("The cost of shipping is: " + cost);

        orderValue = 100.00f;
        satDelivery = false;
        destination = "Mexico";

        cost = priceOfShipping(orderValue, satDelivery, destination);
        System.out.println("The cost of shipping is: " + cost);

        orderValue = 50.00f;
        satDelivery = true;
        destination = "US";

        cost = priceOfShipping(orderValue, satDelivery, destination);
        System.out.println("The cost of shipping is: " + cost);

        orderValue = 600.00f;
        satDelivery = false;
        destination = "US";

        cost = priceOfShipping(orderValue, satDelivery, destination);
        System.out.println("The cost of shipping is: " + cost);

        orderValue = 100.00f;
        satDelivery = false;
        destination = "Canada";

        cost = priceOfShipping(orderValue, satDelivery, destination);
        System.out.println("The cost of shipping is: " + cost);
    }
}
