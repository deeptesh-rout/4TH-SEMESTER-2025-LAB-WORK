// PROGRAM 14

import java.util.*;

public class AnamorphismExample {

    static int nextInteger(int seed) {
        return seed + 1; 
    }

    static List<Integer> generateSequence(int seed, int count) {
        List<Integer> result = new ArrayList<>();
        int currentSeed = seed;
        for (int i = 0; i < count; i++) {
            result.add(currentSeed);
            currentSeed = nextInteger(currentSeed); 
        }
        return result;
    }

    public static void main(String[] args) {
        int seed = 1;   
        int count = 5; 

        List<Integer> sequence = generateSequence(seed, count);
        System.out.println("Sequence of consecutive integers:");
        System.out.println(sequence);
    }
}
