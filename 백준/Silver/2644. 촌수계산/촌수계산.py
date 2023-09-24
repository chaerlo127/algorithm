import sys

n = int(sys.stdin.readline())
a, b = map(int, sys.stdin.readline().split())
m = int(sys.stdin.readline())
l = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)

for _ in range(m):
    x, y = map(int, sys.stdin.readline().split())
    # 양방향 매핑
    l[x].append(y)
    l[y].append(x)

    l[x].sort()
    l[y].sort()


# a부터 시작하여 b가 나오면 끝
# 다 돌더라도 b가 나오지 않으면 -1
def dfs(k):
    for i in l[k]:
        if visited[i] == 0:
            visited[i] = visited[k] + 1
            dfs(i)


dfs(a)
print(visited[b] if visited[b] > 0 else -1)
