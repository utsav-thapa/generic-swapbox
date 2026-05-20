package generics;

public class Program {
    public static void main(String[] args) {
        SwapBox<String> words = new SwapBox<>("coffee", "tea");
        SwapBox<Integer> scores = new SwapBox<>(85, 92);
        SwapBox<Double> prices = new SwapBox<>(4.99, 9.49);

        System.out.println(words.describe());
        words.swap();
        System.out.println(words.describe());

        System.out.println();

        displayBox("Before Swap",scores);
        scores.swap();
        displayBox("After Swap",scores);

        System.out.println();

        displayBox("Before Swapping prices",prices);
        prices.swap();
        displayBox("After Swapping prices",prices);
        System.out.println();

        displayBox("", prices);
        itemMatch(prices);

    }
    public static <T> void displayBox(String label, SwapBox<T> box) {
        System.out.println(label + " " + box.describe());
    }

    public static <T> void itemMatch(SwapBox<T> item) {
        System.out.println("Do these " + item.getLeftItem().getClass().getSimpleName() + " match? \n" + item.itemsMatch());
    }
}
