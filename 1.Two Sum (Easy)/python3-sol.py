from typing import List
import collections
import itertools
import functools
import math
import string
import random
import bisect
import re
import operator
import heapq
import queue

from queue import PriorityQueue
from itertools import combinations, permutations
from functools import lru_cache
from collections import defaultdict
from collections import OrderedDict
from collections import deque
from collections import Counter

# nums = [1, 3, 5, 9]
# target = 8
# declare dictionary
# accessing index and its value from nums list
# storing difference of target and values from the nums list
# check the diff value already present in the dictionary 
# or not. For first iteration it wont be there, since it is empty dict
# if value present return the index stored in dict and iteration number (i)
# storing the value and its index in dict


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}  
        for i, n in enumerate(nums): 
            diff = target - n   
            if diff in prevMap:   
                return [prevMap[diff], i]  
            prevMap[n] = i   
        return


print(Solution().twoSum(nums=[2,7,11,15], target=9))