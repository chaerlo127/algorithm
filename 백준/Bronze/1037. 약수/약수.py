import sys

n = int(sys.stdin.readline())
s = list(map(int, sys.stdin.readline().split()))
s = sorted(s)

if n == 1:
    print(s[0] * s[0])
else:
    print(s[0] * s[-1])


