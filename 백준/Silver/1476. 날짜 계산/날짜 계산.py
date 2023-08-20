import sys

e, s, m = map(int, sys.stdin.readline().split())

# 지구 1 ~ 15
# 태양 1 ~ 28
# 달 1 ~ 19
y = 1
#  브루트포스, 년도에서 준규 행성/항성의 년도를 빼고 행성/항성의 범위로 나눔 => 년도를 하나씩 더하여 나누어 떨어지면 답
while True:
    if (y - e) % 15 == 0 and (y - s) % 28 == 0 and (y - m) % 19 == 0:
        break
    else:
        y += 1

print(y)
