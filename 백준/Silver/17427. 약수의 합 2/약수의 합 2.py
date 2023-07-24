import sys

n = int(sys.stdin.readline())

answer = 0
# 시간 복잡도 O(n^2) => 문제는 O(n)만 가능
#for i in range(1, n+1):
#    for j in range(i+1, 0, -1):
#        if i % j == 0:
#            answer += j

# O(n)
# i의 약수의 갯수는 n을 i로 나누고 i를 곱하면 
# 1 ~ n 까지의 자연수의 약수의 합을 더하는 것과 같음
for i in range(1, n+1):
    answer += (n // i) * i

print(answer)