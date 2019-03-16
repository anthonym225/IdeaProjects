package arraypractice;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++){
            int item = array[i];
            System.out.println(item);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.println("[");
        for(int i = 0; i < array.length; i++){
            String item = array[i];
            System.out.println(item);
            if (i < array.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
	// write your code here
    }
}
