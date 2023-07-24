import sys

# 다음과 같이 코드를 작성하면 시간 초과가 남.
#for i in range(t):
#    n = int(sys.stdin.readline())
#    answer = 0
#    for j in range(1, n+1):
#        answer += n // j * j
#    print(answer)

# dp 를 사용하여 배열에 값을 저장한 후 불러오는 식으로 코드를 작성해야 함.
maxSize = 1000000
dp = [0] * (maxSize+1)

# 각 자연수의 약수의 합을 구하는 로직 = f(x)
for i in range(1, maxSize + 1): # 각 자연수의 약수를 구함
    for j in range(i, maxSize + 1, i): # 자연수의 배수(j)에 약수를 더함(i) 
        dp[j] += i
    dp[i] += dp[i-1] # g(x) 구하기
    
t = int(sys.stdin.readline())
# print answer
for _ in range(t):
    n = int(sys.stdin.readline())
    print(dp[n])

