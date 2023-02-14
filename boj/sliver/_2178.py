import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split())
visited = [[False] * M for _ in range(N)]  # 이동한 위치 저장
# 에러 해결 -> 세로가 N이기 때문에 [False] * N for _in range(M)이면 안됨.
array = [sys.stdin.readline().strip() for _ in range(N)]  # 배열 저장


def bfs():
    dx = [1, 0, -1, 0]  # 상하 좌우만 이동 가능
    dy = [0, 1, 0, -1]
    q = deque()
    q.append((0, 0, 1))
    visited[0][0] = True
    while q:
        x, y, d = q.popleft()

        if x == N - 1 and y == M - 1:  # None 에러 해결: 현재 index의 값은 1이 더 작아야 하기 때문
            return d

        d = d + 1
        for j in range(4):
            rx = x + dx[j]
            ry = y + dy[j]
            if 0 <= rx < N and 0 <= ry < M and array[rx][ry] == '1' and not visited[rx][ry]:
                visited[rx][ry] = True
                q.append((rx, ry, d))


print(bfs())
