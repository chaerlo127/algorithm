import sys, heapq
# 우선 순위 큐
# python의 경우에에는 가장 앞에 있는 값이 가장 작은 값으로 자동 sorting이 되어 있음
# c++의 경우에는 반대로

N = int(sys.stdin.readline())
pq = []
for i in range(N):
    input = int(sys.stdin.readline()) 
    if input == 0:
        if len(pq) == 0: print(0)
        else: print(heapq.heappop(pq))
    else: heapq.heappush(pq, input)
