public class App {
    public static void main(String[] args) throws Exception {
        
        String name = "Easy Egg Sandwich";
        String description = "Super easy and tasty egg sandwich";
        String[] ingredients = {
            "2 eggs",
            "1 slice tomato",
            "2 slices of your choice of bread",
            "1 kraft single slice",
            "butter as needed",
        };
        String[] steps = {
            "heat a frying pan on medium heat, add butter and wait until it melts while spreading it around the pan",
            "crack both eggs into the frying pan",
            "place bread in toaster and toast as desired, buttering when done",
            "when bottom of eggs solidify flip them carefully",
            "after eggs is fully cooked (yoke preferably still runny) place both on buttered slice of toast",
            "top eggs with your cheese and tomato, close sandwich with other piece of toast, cut in half, and enjoy",
        };
        Recipe recipe = new Recipe(name, ingredients, steps, description);
        System.out.println(recipe.toString());

    }
}
