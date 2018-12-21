#!/bin/python

import math
import os
import random
import re
import sys


# Complete the maximumToys function below.
def maximumToys(prices, k):
    total = 0
    count = 0
    n = len(prices)
    for j in range(n):
        for i in range(0,n-j-1):
            if prices[i] > prices[i+1]:
                prices[i], prices[i+1] = prices[i+1], prices[i]
        if total + prices[j] <= k:
            total += prices[j]
            count +=1
        else:
            break
    return count


if __name__ == '__main__':
    fptr = open('output.txt', 'w')

    nk = raw_input().split()

    n = int(nk[0])

    k = int(nk[1])

    prices = map(int, raw_input().rstrip().split())

    result = maximumToys(prices, k)

    fptr.write(str(result) + '\n')

    fptr.close()
