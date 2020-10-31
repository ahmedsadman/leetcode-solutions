# LeetCode 392
# O(n) time | O(1) space
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        sIndex = 0
        tIndex = 0

        while sIndex < len(s) and tIndex < len(t):
            if s[sIndex] == t[tIndex]:
                sIndex += 1
                tIndex += 1
            else:
                tIndex += 1

        return sIndex == len(s)
