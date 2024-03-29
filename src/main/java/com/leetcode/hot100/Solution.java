package com.leetcode.hot100;


import com.leetcode.util.ListNode;

import java.util.List;

public interface Solution {
    /**
     * 题目1：两数之和
     */
    public int[] twoSum(int[] nums, int target);

    /**
     * 题目2：两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2);

    /**
     * 题目3：无重复字符串的最长子串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s);
    public String[] lengthOfLongestSubstringReturnString(String input);

    /**
     * 题目4. 寻找两个正序数组的中位数
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2);

    /**
     * 题目5. 最长回文子串
     * @param s
     * @return
     */
    public String longestPalindrome(String s);

    /**
     * 11. 盛最多水的容器 Container With Most Water
     * @param height
     * @return
     */
    int maxArea(int[] height);

    /**
     *  15. 三数之和3Sum
     */
    public List<List<Integer>> threeSum(int[] nums);

    /**
     * 17. 电话号码的字母组合Letter Combinations of a Phone Number
     */
    public List<String> letterCombinations(String digits);

    /**
     * 19. 删除链表的倒数第 N 个结点Remove Nth Node From End of List
     */
    public ListNode removeNthFromEnd(ListNode head, int n);

    /**
     * 20. 有效的括号Valid Parentheses
     */
    public boolean isValid(String s);

    /**
     * 21. 合并两个有序链表Merge Two Sorted Lists
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2);

    /**
     *22. 括号生成 Generate Parentheses
     */
    public List<String> generateParenthesis(int n);

    /**
     * 23. 合并K个升序链表Merge k Sorted Lists
     */
    public ListNode mergeKLists(ListNode[] lists);

    /**
     * 31. 下一个排列Next Permutation
     */
    public void nextPermutation(int[] nums);

    //32. 最长有效括号
    public int longestValidParentheses(String s);

    // 33. 搜索旋转排序数组
    public int search(int[] nums, int target);

    // 34. 在排序数组中查找元素的第一个和最后一个位置
    public int[] searchRange(int[] nums, int target);

    // 39. 组合总和

    /**
     * 回溯算法 + 剪枝
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target);

    /**
     * 42. 接雨水
     *  1.按行计算, 2.案列计算 3.动态规划, 4.双指针, 5.栈
     * @param height
     * @return
     */
    public int trap(int[] height);
}
