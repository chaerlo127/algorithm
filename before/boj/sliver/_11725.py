import sys

# 노드의 개수가 N (2 ≤ N ≤ 100,000)이기 때문에 인접 행렬로 접근하면
# dfs 로 접근 시, N * N (10만 * 10만)으로
# 메모리 초과가 된다.
# 따라서, 인접 리스트로 푸는 것이 메모리를 덜 차지하는 방법이다.

sys.setrecursionlimit(10 ** 9)  # 메모리 늘리기

N = int(sys.stdin.readline())
graph = [[0] for _ in range(N + 1)]  # 인접 리스트
visited = [0 for _ in range(N + 1)]

for i in range(N - 1):
    x, y = map(int, sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)


def DFS(vertex):
    for j in graph[vertex]:
        if visited[j] == 0:
            visited[j] = vertex
            DFS(j)


DFS(1)

for k in range(2, N + 1):
    print(visited[k])

# 원래 접근 방법
# import sys
#
# sys.setrecursionlimit(10**9)  # 메모리 늘리기
#
# N = int(sys.stdin.readline())
# graph = [[0] * (N + 1) for _ in range(N + 1)] # 인접 행렬
# visited = [0 for _ in range(N + 1)]
#
# for i in range(N - 1):
#     x, y = map(int, sys.stdin.readline().split())
#     graph[x][y] = y
#     graph[y][x] = x
#
#
# def DFS(vertex):
#     for j in range(1, N + 1):
#         if visited[j] == 0 and graph[vertex][j] != 0:
#             visited[j] = vertex
#             DFS(j)
#
#
# DFS(1)
#
# for k in range(2, N + 1):
#     print(visited[k])