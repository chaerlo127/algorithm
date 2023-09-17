import sys
# recursionError 해결
sys.setrecursionlimit(10**9)

# 양방향 매핑 그패프
n, m, r = map(int, sys.stdin.readline().split()) # 정점, 간선, 방문순서

l = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)
count = 1

# 메모리 문제로 인해 리스트를 이용하여 공간 메모리 줄이기
for _ in range(m):
    x, y = map(int, sys.stdin.readline().split())
    l[x].append(y)
    l[y].append(x)


def dfs(k):
    global count
    visited[k] = count
    l[k].sort(reverse=True) # 내림차순
    for i in l[k]:
        if visited[i] == 0:
            count += 1
            dfs(i)


dfs(r)
for i in range(1, n + 1):
    print(visited[i])
