import sys

n = int(sys.stdin.readline()) # 컴퓨터 수
f = int(sys.stdin.readline()) # 네트워크 상에서 연결되어 있는 수

l = [[] for _ in range(n + 1)] # 그래프 표시
visited = [0] * (n + 1) # 방문 컴퓨터 표시
answer = 0 # 정답

# 그래프 표시
for i in range(f):
    x, y = map(int, sys.stdin.readline().split())
    l[x].append(y)
    l[y].append(x)

# 깊이 우선 탐색으로 문제 해결
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
