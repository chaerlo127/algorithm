import sys
from collections import deque

t = int(sys.stdin.readline())

for _ in range(t):
    n, m = map(int, sys.stdin.readline().split())
    importArray = deque(list(map(int, sys.stdin.readline().split())))
    count = 0

    while importArray:
        maxNum = max(importArray)  # 가장 큰 값
        num = importArray.popleft()  # 가장 앞의 값
        m -= 1
        if maxNum == num:  # 확인 해서 같으면
            count += 1
            if m < 0:  # 현재 찾고자 하는 문서 번째면
                print(count)
                break
        else:
            importArray.append(num) # 아니면 넣어 주고
            if m < 0: # m만큼 이동했는데도 다 못찾으면
                m = len(importArray) - 1 # 제일 뒤로 넣기
