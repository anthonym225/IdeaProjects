package runtimepractice;

import java.util.ArrayList;
import java.util.HashMap;

public class RunTimePractice {

    // Linear time O(n)
    public static int findNumsOfReps(String s, char c) {
        int sum = 0; // 1
        for (int i = 0; i < s.length(); i++){ // 1, n+1, n
            if (s.charAt(i) == c){ // n
                sum++; // n
            }
        }
        return sum; // 1
    }

    // Quadratic time O(n * m)
    public static int[] findNumsOfRepsv1(String s, char[] c){
        int[] sums = new int[c.length]; // 1
        for (int i = 0; i < s.length(); i++){ // 1, n+1, n
            for(int j = 0; j < c.length; j++){ // n, n*m + 1, n*m
                if (s.charAt(i) == c[j]){ // n*m
                    sums[j] = sums[j] + 1; // n*m
                }
            }
        }
        return sums; // 1
    }
    // Optimal time: O(n + m)
    public static int[] findNumsOfRepsv2(String s, char[] c) {
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        for (int j = 0; j < c.length; j++){
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
	// write your code here

        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfReps("abcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhlabcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhl", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        char[] a = {'a', 'b'};

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepsv1("abcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhlabcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhl", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");


        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepsv2("abcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhlabcajklfaslkkladjfaiodjfeonfklajnbvalbdvasihfadfhd;aodivjaldjfakldfnbcbajklsdfndsfjnldakfjoaidfjoiajdfniduyetyrappasdfjnjksdbcioadfihbnjdaskhfauihfbladifhakdfb;aldfucbka;sdfuhjbdfjnja;sa;khfuudajjdfhl", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");
    }
}
