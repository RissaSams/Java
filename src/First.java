public class First {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String firstName, address, favColor, lastName, makeOfFirstCar;
        int age, favNum, yearOfFirstCar;
        String hometown;
        boolean isLiving;

        firstName = "Marissa";
        lastName = "Sams";
        address = "Arlington";
        favColor = "blue";
        favNum = 3;
        yearOfFirstCar = 2015;
        makeOfFirstCar = "Honda Civic";
        age = 22;
        hometown = "Arlington, TX";
        isLiving = true;

        System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old." +
                " I'm from " + hometown + " and my favorite color is " + favColor + "." +
                " My first car was a " + yearOfFirstCar + " " + makeOfFirstCar + ".");


        var random = (int)(Math.random()*100);
        System.out.println("This is just a random number: " + random);

    }
    }
