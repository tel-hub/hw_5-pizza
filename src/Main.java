public class Main {

    static double calculateArea(double R) {
        return Math.pow(R, 2) * Math.PI;
    }

    static double calculatePizzaCalories(double R) {
        double caloriesInSquareSmOfPizza = 10;
        return calculateArea(R) * caloriesInSquareSmOfPizza;
    }

    public static void main(String[] args) {
        double d1 = 20;
        double d2 = 25;

        double diff = calculatePizzaCalories(d2) - calculatePizzaCalories(d1);

        System.out.println("На " + Math.round(diff) + " калорий меньше в пицце диаметром " + d1 + " см, чем в пицце диаметром " + d2 + " см");
    }
}
