import sys


def answer(s):
    k = []
    for i in s:
        if i == '(':
            k.append(i)
        elif len(k) == 0:
            return "NO"
        else:
            k.pop()
    if len(k) == 0:
        return "YES"
    else:
        return "NO"


n = int(sys.stdin.readline())
for _ in range(n):
    stack = list(sys.stdin.readline().strip()) # /n 제거
    print(answer(stack))
