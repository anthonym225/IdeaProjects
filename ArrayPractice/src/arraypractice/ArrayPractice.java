package arraypractice;

public class ArrayPractice {

    public static <E> void printArray(E[] array) {
        System.out.println("[");

        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
	// write your code here
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};
    }
}
