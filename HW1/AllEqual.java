public class AllEqual {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10); 
        int num2 = (int) (Math.random() * 10); 
        int num3 = (int) (Math.random() * 10); 

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Numbers are not all equal.");
        }
    }
}