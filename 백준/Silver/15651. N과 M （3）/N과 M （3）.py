import sys

n, m = map(int, sys.stdin.readline().split())
answer = []


def back():
    if len(answer) == m:
        print(" ".join(map(str, answer)))
    else:
        for i in range(1, n + 1):
            answer.append(i)
            back()
            answer.pop()

back()