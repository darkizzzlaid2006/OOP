public class HugeArray {
    public static void main(String[] args) {
        int[] largeArray = new int[1000];

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < largeArray.length; i++) {
            System.out.print(largeArray[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); 
            }
        }
    }
}