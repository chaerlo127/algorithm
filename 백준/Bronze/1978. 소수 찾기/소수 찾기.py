import sys

n = int(sys.stdin.readline())
li = list(map(int, sys.stdin.readline().split()))
answer = 0
for i in li:
    a = 0
    for j in range(1, i + 1):
        if i % j == 0:
            a += 1
    if a == 2:
        answer += 1
print(answer)
