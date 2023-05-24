import sys

n, m = map(int, sys.stdin.readline().split())
packageCost = [0 for _ in range(m)]
cost = [0 for _ in range(m)]
for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    packageCost[i] = x
    cost[i] = y

minPackage = minCost = 0
minPackage = min(packageCost)
minCost = min(cost)

# 패키지보다 하나 사는게 값이 더 싼 경우
if minPackage > minCost * 6:
    preCost = minCost * n

else:
    preCost = (n // 6) * minPackage
    if minPackage < (n % 6) * minCost:
        preCost = preCost + minPackage
    else: # n보다 크게, 패키지로 사는 것이 낱개로 사서 n 개수를 맞춰서 사는 것보다 싼 경우
        preCost = preCost + (n % 6) * minCost

print(preCost)
