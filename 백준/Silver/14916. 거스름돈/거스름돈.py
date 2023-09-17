import sys
# 값을 받아와서
# 만약 5로 나누어 떨어지지 않는다면 2을 계속 빼주고
# 후에 5로 나누어 값을 구함
n = int(sys.stdin.readline())

count = 0
while n > 0:
    if n % 5 != 0: # 5로 나누어지지 않는 경우
        n -= 2 # 2를 빼고
        count += 1 # 거스름돌을 하나 추가
    else: # 5로 나뉘어지는 경우
        count = count + n // 5 # 현재 거스름 돈에서 5로 나뉘어지는 몫(새로운 거스름돈)을 추가
        break

if n < 0:
    print(-1)
else:
    print(count)  # 정답 출력
