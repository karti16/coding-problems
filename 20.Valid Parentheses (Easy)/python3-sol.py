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

from matplotlib.cbook import index_of


class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closeToOpen = {
           ']':'[',
           ')':'(',
           '}':'{'
       }

        for char in s:
            if char in closeToOpen:
                if stack and stack[-1] == closeToOpen[char]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(char)
        return True if not stack else False

print(Solution().isValid(s="[[]]"))