import sys
# test n
n = int(sys.stdin.readline())
# input list
l = [list(map(int, sys.stdin.readline().split())) for i in range(n)]
# dynamic programming
dp = [0 for _ in range(n + 1)]

# top - down 방식
for i in range(n-1, -1, -1):
    if i + l[i][0] > n: # day + t가 n + 1인 경우에는 퇴사 이후이므로 답이 아님
        dp[i] = dp[i + 1] # 리스트에 저장한 이전의 값을 그대로 저장
    else:
        # 이 전의 값과 i 번째에 있는 t만큼 차이나는 이후의 최대 금액 + 현재 i 에서 받을 수 있는 금액 중에서 더 큰 값을 고름
        dp[i] = max(dp[i + 1], dp[i + l[i][0]] + l[i][1])
print(dp[0])