import sys

# test
n = int(sys.stdin.readline())
# dynamic programming
dp = [0 for _ in range(n + 1)]

# 1은 이미 0
# 2부터 시작 -> 1
# 3은 -> 1
for i in range(2, n+1):
    dp[i] = dp[i-1] + 1 # 일단 이전의 값에서 +1 (2, 3 으로 나누어지지 않는 경우 1을 더한다의 경우의 수)
    if i % 2 == 0: # 2로 나누어지는 경우라면
        dp[i] = min(dp[i//2]+1, dp[i]) # dp[i+1]의 값과 이전의 구한 값에서 1을 더한 것 중에 더 작은 것을 dp 에 저장
    if i % 3 == 0:
        dp[i] = min(dp[i//3]+1, dp[i])

print(dp[n])
