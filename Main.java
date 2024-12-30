import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    String[] ingredients = {"Tomato", "Onion", "Lettuce", "Mayonnaise", "Mustard", "Ketchup", "Bacon", "Pickle", "Relish", "Cheese"};
    ArrayList<String> ingredientsOnBurger = new ArrayList<>();

        for (int i = 0; i < new Random().nextInt(0, 8); i++) {
            ingredientsOnBurger.add(ingredients[new Random().nextInt(ingredients.length)]);
        }

        ingredientsOnBurger.add(0, "Bun");
        ingredientsOnBurger.add("Patty");
        ingredientsOnBurger.add("Bun");

        for (String ingr : ingredientsOnBurger) {
            System.out.println(ingr);
        }
    }
}