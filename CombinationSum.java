package org.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= remain) {
                current.add(candidates[i]);
                backtrack(result, current, candidates, remain - candidates[i], i);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 14;
        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
