package BinarySearchTree;

import java.util.Random;

public class Testers{

    // random integers
    public static int rndInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    // random binary search trees
    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(rndInt(0, 50));
        }
    }

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

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        // 1. Either something was added --> and the cardinality increased by 1.
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by 1, but the thing that was added was already a member of the tree.");
            }
            // 2. OR the thing that was added was already there and there not really added so the cardinality stayed the same
        } else if (nT == t.cardinality()){
            if (!t.member(x)){
                throw new Exception("The cardinality did not increase by 1, but we added a new thing");
            }

        } else {
            throw new Exception("Something is wrong with our program");
        }


    }
}