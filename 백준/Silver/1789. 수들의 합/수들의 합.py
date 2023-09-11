import sys

s = int(sys.stdin.readline())
answer = 0
sumS = 0

while True:
    answer += 1
    sumS += answer
    if sumS > s:
        break

print(answer-1)