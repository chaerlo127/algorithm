import sys

# 백트래킹
N, M = map(int, sys.stdin.readline().split())
s = []
visited = [False for _ in range(N + 1)]


def DFS():
    if len(s) == M:
        print(' '.join(map(str, s)))
        return
    for i in range(1, N + 1):
        if visited[i]:
            continue
        visited[i] = True
        s.append(i)
        DFS()  # 재귀로 값을 다 구하면
        visited[i] = False  # 원래 있던 상태로 변경
        s.pop()


DFS()
