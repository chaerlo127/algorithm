import math
import sys

# 테스트 케이스 갯수
maxValue = 1000000
lists = [True] * (maxValue + 1)
lists[0] = lists[1] = False

# 에라토스테네스의 체
for i in range(2, int(math.sqrt(maxValue) + 1)):
    if lists[i]:
        # 1. 시간 초과 나서 추가한 내용 => 한 번 확인한 내용은 다시 확인하지 않아도됨 아니면 같은 일을 반복하는 것이기 때문
        # 2. 다음과 같은 경우로 사용을 하면 아래 코드보다 시간이 오래걸림
        # while i * j <= maxValue:
        #     lists[i * j] = False
        #     # 짝수 및 소수가 아니면 다 False
        #     j += 1
        for j in range(i * i, maxValue + 1, i):
            lists[j] = False  # 3. 배수의 모든 값들을 False 로 변경 i*(i+i)

while True:
    n = int(sys.stdin.readline())

    # 0 이면 break
    if n == 0:
        break
    check = False

    # 계산 로직
    for i in range(3, n, 2):
        if lists[i] and lists[n - i]:
            print(str(n) + " = " + str(i) + " + " + str(n - i))
            check = True
            break

    # 두 홀수 소수의 합으로 나타낼 수 없는 경우
    if not check:
        print("Goldbach's conjecture is wrong.")
