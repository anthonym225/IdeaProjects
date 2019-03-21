package BinarySearchTree;

public class Testers{

    public static void checkIsEmpty(Tree t) throws Exception {
        //If the tree T is an instance of EmptyBST --> t.isEmpty --> true
        //If the tree t is an instance oof NonEmptyBST --> t.isEmpty --> false

        if(t instanceof EmptyBST) {
            if(!t.isEmpty()) {
                throw new Exception("All is good, the tree is an EmptyBST and it is empty");
            } else if (t instanceof NonEmptyBST) {
                if (t.isEmpty()){
                    throw new Exception("All is good, the tree is a NonEmptyBST and it is non-empty");
                }
            }
        }
    }
}