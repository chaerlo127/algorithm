import sys

# 런타임 에러 해결
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 9)

n, m, r = map(int, input().split())
# 메모리 문제 초과로 인해 모든 행과 열을 생성하지 않고 필요한 부분만 생성
l = [[] for _ in range(n + 1)]
# 방문했는지 확인하는 배열
visited = [0] * (n + 1)
count = 1



for _ in range(1, m + 1):
    x, y = map(int, input().split())
    l[x].append(y)
    l[y].append(x)

# dfs
def dfs(v):
    global count
    visited[v] = count  # 방문한 순서를 표시
    l[v].sort()
    for j in l[v]:
        if visited[j] == 0:  # 방문하지 않은 곳은 방문 진행
            count += 1
            dfs(j)

dfs(r)

for i in range(1, n + 1):
    print(visited[i])
