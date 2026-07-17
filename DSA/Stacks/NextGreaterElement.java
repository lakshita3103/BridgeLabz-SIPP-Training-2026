package DSA.Stacks;

import java.util.*;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;

        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    visitors[i] > visitors[stack.peek()]) {

                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};

        System.out.println(Arrays.toString(nextBusierDay(arr)));
    }
}