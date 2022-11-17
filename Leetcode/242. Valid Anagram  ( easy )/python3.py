#
# @lc app=leetcode id=242 lang=python3
#
# [242] Valid Anagram
#

# @lc code=start
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sHashMap = {}
        tHashMap = {}

        for i in range(len(s)):
            if s[i] in sHashMap:
                sHashMap[s[i]] += 1
            else:
                sHashMap[s[i]] = 1
            if t[i] in tHashMap:
                tHashMap[t[i]] += 1
            else:
                tHashMap[t[i]] = 1

        for c in sHashMap:
            if sHashMap[c] != tHashMap.get(c, 0):
                return False
        return True
# @lc code=end

