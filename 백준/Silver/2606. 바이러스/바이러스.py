import sys

n = int(sys.stdin.readline())
f = int(sys.stdin.readline())

l = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)
answer = 0

for i in range(f):
    x, y = map(int, sys.stdin.readline().split())
    l[x].append(y)
    l[y].append(x)


def dfs(k):
    global answer
    if not visited[k]:
        visited[k] = True
        for i in l[k]:
            if not visited[i]:
                answer += 1
                dfs(i)


dfs(1)

print(answer)
