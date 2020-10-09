package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    private static ArrayList<Long> sequence = new ArrayList<>();
    private static HashSet<Long> set = new HashSet<>();
    //    private static final long MAX = (long) Math.sqrt(Long.MAX_VALUE);
    public int getIndex;
    //    private static final int iteration = (int) Math.sqrt(getIndex);
    //    private static final int iteration = 10;
    private static long MAX;
    private static int turn = 0;

    public Solution(int i) {
        getIndex = i + 1;
    }

    public static void getMAX() {
        MAX = 2;
        if (turn > 2) {
            for (int index = 0; index < turn - 2; index++) {
                MAX = MAX * 2 + 1;
            }
        }
    }

    public long getSequence() {
        set.add(1L);
//        for (int index = 0; index < iteration; index++) {
//            Solution.addX();
//            sequence.clear();
//            sequence.addAll(set);
//        }
        do {
            turn++;
            Solution.getMAX();
            Solution.addX();
            sequence.clear();
            sequence.addAll(set);
        } while (set.size() < getIndex);
        Collections.sort(sequence);
//        for (Long i : sequence) System.out.println(i);
//        System.out.println(sequence.size());
        return sequence.get(getIndex - 1);
    }

    public static void addX() {
        for (Long v : sequence) {
            long x = 2 * v + 1;
            long y = 6 * v;
            long z = v * v + 1;
            if (x <= MAX) {
                set.add(x);
            }
            if (y <= MAX) {
                set.add(y);
            }
            if (z <= MAX) {
                set.add(z);
            }
        }
    }
}

