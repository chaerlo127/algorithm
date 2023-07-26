import sys
import math

m, n = map(int, sys.stdin.readline().split())

# 에라토스테네스의 체
for i in range(m, n + 1):
    if i == 1: # 1을 제외
        continue
    for j in range(2, int(math.sqrt(i)) + 1): # i를 2부터 i의 제곱근까지 나누기
        if i % j == 0: # 1을 제외한 약수가 있다면 소수가 아닌 것임
            break
    else:
        print(i)

