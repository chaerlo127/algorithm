import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque(enumerate(map(int, sys.stdin.readline().split())))
ans = []

while len(q) != 0:
    index, val = q.popleft() # 가장 앞에 있는 index 값을 뽑아냄
    ans.append(index+1) # 기존의 인덱스는 print 하고자 하는 값보다 1이 작게 설정되어 있음
    if val > 0:
        q.rotate(-(val-1))  # 왼쪽(반시계) 이동 (이 때 가장 앞에 있는 값을 지웠기 때문에 -1을 하여 index의 값을 맞추고 이동
    else:
        q.rotate(-val) # 오른쪽(시계) 이동

print(*ans)
