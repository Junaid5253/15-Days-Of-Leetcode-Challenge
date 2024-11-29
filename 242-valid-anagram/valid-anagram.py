class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s) != len(t)):
            return False
        else:
            s = sorted(s)
            t = sorted(t)
            for i in range(len(s)):
                if(s[i] != t[i]):
                    return False
            else:
                return True