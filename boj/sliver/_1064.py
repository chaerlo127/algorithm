import math
import sys

xa, ya, xb, yb, xc, yc = map(int, sys.stdin.readline().split())

# ab
ab = math.sqrt(math.pow(xa - xb, 2) + math.pow(ya - yb, 2))
# bc
bc = math.sqrt(math.pow(xb - xc, 2) + math.pow(yb - yc, 2))
# ca
ca = math.sqrt(math.pow(xc - xa, 2) + math.pow(yc - ya, 2))

if (xb - xa) * (yc - yb) == (xc - xb) * (yb - ya):
    # ab와 ca의 기울기가 같은 경우 세 점이 같은 직선 상에 있는 것과 같기 때문에 평행 사변형이 만들어지지 않음
    answer = -1.0
else:
    maxLen = max(ab, max(bc, ca))
    minLen = min(ab, min(bc, ca))
    answer = (maxLen - minLen) * 2

print(answer)
