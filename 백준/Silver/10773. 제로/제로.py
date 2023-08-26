import sys

# test
n = int(sys.stdin.readline())
l = []

for _ in range(n):
    m = int(sys.stdin.readline())
    if m == 0:
        l.pop()
    else:
        l.append(m)

print(sum(l))
