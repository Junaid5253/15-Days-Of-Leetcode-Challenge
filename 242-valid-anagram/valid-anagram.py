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
            list = []
            for i in range(len(s)):
                list.append(s[i])
            for j in range(len(t)):
                if(t[j] not in list):
                    return False
                else:
                    list.remove(t[j])
            else:
                return True