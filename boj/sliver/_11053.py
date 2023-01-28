import sys

A = int(sys.stdin.readline())
array = list(map(int, sys.stdin.readline().split()))
list = [1] * A

for i in range(1, A):
    for j in range(i):
        if(array[i] > array[j]): list[i] = max(list[i], list[j]+1)

print(max(list))
