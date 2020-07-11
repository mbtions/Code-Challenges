class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if digits == "":return []
        string_maps = {"2": "abc","3": "def","4": "ghi","5": "jkl","6": "mno","7": "pqrs","8": "tuv","9": "wxyz"}
        result = [""]
        for num in digits:
            temp = []
            for an in result:
                for char in string_maps[num]:
                    temp.append(an + char)
            result = temp
        return result
