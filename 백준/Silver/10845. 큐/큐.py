import sys

q = []

n = int(sys.stdin.readline())

for _ in range(n):
    l = sys.stdin.readline().split()
    if l[0] == 'push':
        q.append(l[1])
    if l[0] == 'pop':
        if len(q) == 0:
            print(-1)
        else:
            print(q.pop(0))
    if l[0] == 'size':
        print(len(q))
    if l[0] == 'empty':
        if len(q) == 0:
            print(1)
        else:
            print(0)
    if l[0] == 'front':
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])
    if l[0] == 'back':
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])
