

public class MathApp {
    static void main(String[] args) {
        // highest salary
        int bobSalary = 40000;
        int garySalary = 120000;
        int highestSalary = Math.max (bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        // Smallest of the two variables
        int carPrice = 50000;
        int truckPrice = 25160;
        int smallestTwo = Math.min(carPrice, truckPrice);
        System.out.println( "The smallest of the two variable is: " + smallestTwo);

       // Area of a circle;
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

        // square root;

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root: " + squareRoot);

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        System.out.println("Distance: " + distance);

        // absolute value
        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute value: " + absoluteValue);

        // Random number
        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);

        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int totalHours = days * hoursPerDay;
        int totalMinutes = totalHours * minutesPerHour;

        System.out.println("Minutes in 24 days: " + totalMinutes);










    }
}


