package menu;

public class MenuRunner {
	public static void main(String[] args) {
        Menu firstMenu = new Menu("First menu");
        Menu secondMenu = new Menu("Second menu");

        Dish dishOne = new Dish("Campot", "Sdoba", 130);
        Dish dishTwo = new Dish("Vareniki", "Something about Vareniki", 100);
        Dish dishThird = new Dish("Borsh", "Pampuski", 120);
        Dish dishFour = new Dish("Chicen Salat",
                "Sous and beef", 140);

        firstMenu.addDish(dishOne);
        firstMenu.addDish(dishFour);
        firstMenu.addDish(dishThird);

        System.out.println(firstMenu.toString());
        System.out.println("The chipest dish is: " + firstMenu.getCheapestDish().getName());

        secondMenu.addDish(dishOne);
        secondMenu.addDish(dishFour);
        secondMenu.addDish(dishTwo);

        System.out.println(secondMenu.toString());
        System.out.println("The chipest dish is: " + secondMenu.getCheapestDish().getName());
    }

}
