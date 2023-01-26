package ie.atu.week1;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] firstArray;
        firstArray = new int[10];

        for(int i = 0; i <= 9; i++) {
            int arrayItem = 100;
            arrayItem *= i+1;
            firstArray[i] = arrayItem;
            System.out.println(i + " - Array item: " + firstArray[i]);
        }
    }
}
