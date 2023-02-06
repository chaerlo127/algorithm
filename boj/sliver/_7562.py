import sys
from collections import deque


def bfs(a, b, c, d):
    dx = [1, 2, 2, 1, -1, -2, -2, -1]
    dy = [2, 1, -1, -2, -2, -1, 1, 2]
    q = deque()
    q.append([a, b])
    while q:
        e, f = q.popleft()
        if e == c and f == d:
            print(array[c][d] - 1) # 처음에 1로 시작햇기 때문
            return
        for i in range(8):
            nx = e + dx[i]
            ny = f + dy[i]
            if 0 <= nx < x and 0 <= ny < x and array[nx][ny] == 0:
                array[nx][ny] = array[e][f] + 1
                q.append([nx, ny])


T = int(sys.stdin.readline())

for _ in range(T):
    x = int(sys.stdin.readline())
    sx, sy = map(int, sys.stdin.readline().split())
    ex, ey = map(int, sys.stdin.readline().split())

    array = [[0] * x for _ in range(x)]
    array[sx][sy] = 1
    bfs(sx, sy, ex, ey)
