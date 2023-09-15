import sys
from collections import deque

# queue
# first input first output

n = int(sys.stdin.readline())
# 기존의 리스트로 진행하면 [시간초과]에러 발생
# => 맨 앞의 값을 지우고 다시 그 다음의 값을 앞으로 옮기는 과정에서 O(n)의 시간 복잡도가 발생하기 때문
# 이를통해 deque를 통해 해결
# l = []
q = deque()

for _ in range(n):
    c = sys.stdin.readline().split()
    if c[0] == 'push':
        q.append(c[1])
    if c[0] == 'pop':
        if len(q) == 0:
            print(-1)
        else:
            print(q.popleft())

    if c[0] == 'size':
        print(len(q))
    if c[0] == 'empty':
        if len(q) == 0:
            print(1)
        else:
            print(0)
    if c[0] == 'front':
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])
    if c[0] == 'back':
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])
