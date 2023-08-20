import sys
# 1,2,3만을 가지고 합을 구해야 함. 즉, 그 이외의 것들은 구하는 것은 의미 없음
# 5의 경우는 간단하게 생각해보면  1 + 4, 2 + 3, 3 + 2, 4 + 1이 있음
# 즉, 앞의 `1 + 4, 2 + 3, 3 + 2` 경우의 수만 따지면 되고, 그 이후의 것들은 따지지 않아도 됨.
# 앞에서 구했던 4, 3, 2의 경우의 수를 더한 값이 5의 경우의 수와 같은 것
answer = [0 for _ in range(11)]
answer[1] = 1
answer[2] = 2
answer[3] = 4
for i in range(4, 11):
    for j in range(i - 3, i):
        answer[i] += answer[j]

t = int(sys.stdin.readline())

for i in range(t):
    print(answer[int(sys.stdin.readline())])
