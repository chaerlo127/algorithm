import sys
import heapq

# 파이썬에서 제공하는 우선순위 큐는 최소 힙
# 따라서 최대 힙으로 저장하려면 우선순위를 음수로 만들어 저장하면 됨
n = int(sys.stdin.readline())
heap = []
for _ in range(n):
    x = int(sys.stdin.readline())
    if x == 0:
        if len(heap) == 0: print(0)
        else: print(heapq.heappop(heap)[1])
    else:
        # 우선순위(음수로 저장된 x), x가 나란히 저장이되어 있어
        # 실제 값을 빼도록
        heapq.heappush(heap, (-x, x))