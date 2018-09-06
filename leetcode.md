###21. Merge Two Sorted Lists
Easy

### 24. Swap Nodes in Pairs
Medium

Description:成对交换链表中的元素

Key:
用递归解写比较清晰。每次返回头节点。

### 25. Reverse Nodes in k-Group
Hard

TODO

### 26. Remove Duplicates from Sorted Array
Easy

### 35. Search Insert Position
Easy

### 520. Detect Capital
Easy

Description: 检测大写字母使用的是否合法。

Key:
1. 记录大写字母的数量，与字符串长度比较
2. 给定输入可能的范围，判断是否是小写字母的快捷方法是用'Z'去减。
ASCII表中先出现数字、再大写字母，最后小写字母。

### 521. Longest Uncommon Subsequence I
Easy

Description: 找最长的非公共子串。

Key：
1. 内容相等时，返回-1（找不到）
2. 长度不能时，返回长的那个。