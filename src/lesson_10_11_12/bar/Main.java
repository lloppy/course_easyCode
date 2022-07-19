package lesson_10_11_12.bar;

public class Main {
    public static void main(String[] args) {
        print(chooseDrinks(1,1,5));
        print(chooseDrinks(1,5,5));
        print(chooseDrinks(1,6,5));
        print(chooseDrinks(6,6,4));
    }

    private static String chooseDrinks(int costBeer, int costWhiskey, int money ) {
        if (money < costBeer + costWhiskey){
            if (money >= costWhiskey) {
                return "drink whiskey";
            } else if (money >= costBeer) {
                return "drink beer";

            } else {
                return "you re poor(";
            }
        } else{
            return "take all!";
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
