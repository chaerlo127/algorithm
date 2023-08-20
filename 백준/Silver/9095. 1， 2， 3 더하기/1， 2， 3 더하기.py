import sys

answer = [0 for _ in range(11)]
answer[1] = 1
answer[2] = 2
answer[3] = 4
for i in range(4, 11):
    for j in range(i - 3, i):
        answer[i] += answer[j]

t = int(sys.stdin.readline())

for i in range(t):
    print(answer[int(sys.stdin.readline())])
