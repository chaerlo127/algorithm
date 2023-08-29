import sys
from collections import deque

n, m, v = map(int, sys.stdin.readline().split())
listM = [[0] * (n + 1) for _ in range(n + 1)]
visited = [False for _ in range(n + 1)]


def dfs(v):
    if not visited[v]:
        visited[v] = True
        print(v, end=' ')
        for i in range(1, n + 1):
            if not visited[i] and listM[v][i] == 1:
                dfs(i)


def bfs(v):
    q = deque()
    visited[v] = True
    q.append(v)
    while q:
        v = q.popleft()
        print(v, end=' ')
        for i in range(1, n + 1):
            if not visited[i] and listM[v][i] == 1:
                visited[i] = True
                q.append(i)


for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    listM[x][y] = 1
    listM[y][x] = 1

dfs(v)
# reset
visited = [False for _ in range(n + 1)]
print()
bfs(v)
