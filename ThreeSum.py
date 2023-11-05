from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        dic = {}
        lst = []
        for i in range(len(nums)):
            low = i + 1
            high = len(nums) - 1
            while low < high:
                s = nums[i] + nums[low] + nums[high]
                if s == 0:
                    val = [nums[i], nums[low], nums[high]]
                    if str(val) in dic:
                        dic[str(val)] += 1
                        print(f"Duplicate triplet: {val}, Count: {dic[str(val)]}")
                    else:
                        dic[str(val)] = 1
                        lst.append(val)
                        print(f"New triplet found: {val}")
                    low += 1
                    high -= 1
                elif s > 0:
                    high -= 1
                else:
                    low += 1
        return lst

# Sample input list
nums = [-1, 0, 1, 2, -1, -4]

# Create an instance of the Solution class
solution = Solution()

# Run the threeSum function with the sample input
result = solution.threeSum(nums)

# Print the result
print("Unique triplets with a sum of 0:")
for triplet in result:
    print(triplet)
    #