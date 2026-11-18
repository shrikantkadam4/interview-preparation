/*Write a function:

class Solution { public int solution(int[] A); }
content_copy

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].*/

import java.util.HashSet;
import java.util.Set;

public class FindSmallestMissingPositiveInteger {
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        int smallestMissing = 1;
        while (set.contains(smallestMissing)) {
            smallestMissing++;
        }

        return smallestMissing;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}) == 4 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{-1, -3}) == 1 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{2, 3, 4, 5}) == 1 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{1}) == 2 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{0, -10, 1000000}) == 1 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}) == 5 ? "Passed ✅" : "Failed ❌");
        System.out.println(solution(new int[]{-1, -3, -6, -4, 1, -2}) == 2 ? "Passed ✅" : "Failed ❌");
    }
}
