package BinarySearchTree;

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {
	// write your code here
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
    }
}
