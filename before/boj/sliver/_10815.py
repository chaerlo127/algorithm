
# 메모리 초과
# def numCardRecursion (start, end, data, i):
#     index = (start+end)//2
#     if start == end and i != data[index]: return False
    
#     if i == data[index]: return True
#     elif i < data[index]: return numCardRecursion(start, index-1, data, i)
#     else: return numCardRecursion(index+1, end, data, i)

def numCardIteration (start, end, data, i):
    while start <= end:
        index = (start+end)//2
        if i == data[index]: return True
        elif i <data[index]: end = index - 1
        else: start = index + 1
    return False

import sys
# sys.setrecursionlimit(10**8) # Recursion RunTime error를 줄이기 위해, 백준의 경우 recursion의 최대 깊이가 1000으로 되어 있기 때문

N = int(input())
data = list(map(int, sys.stdin.readline().split()))
M = int(input())
inputData = list(map(int, sys.stdin.readline().split()))

data.sort()

for i in range(M):
    if numCardIteration(0, N-1, data, inputData[i]) is True:
        print(1, end = ' ')
    else: print(0, end = ' ')


