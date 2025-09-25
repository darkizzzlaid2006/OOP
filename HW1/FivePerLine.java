public class FivePerLine {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println(); // Move to the next line after every 5 numbers
            }
        }
    }
}
