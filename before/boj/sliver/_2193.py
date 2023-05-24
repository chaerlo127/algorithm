import sys

N = int(sys.stdin.readline())
list = [1] * N

for i in range(2, N):
    list[i] = list[i-1] + list[i-2]

print(list[N-1])