import sys
sys.setrecursionlimit(10**9)
t = int(sys.stdin.readline())


def bina(a, b, arrays):
    if a == b or b == 0:  # index가 하나씩 작게 있으므로 b = 1일 때 값 1을 갖게 됨. 이를 의미한 것임
        return 1
    else:
        if arrays[a][b] == 0:
            arrays[a][b] = bina(a - 1, b - 1, arrays) + bina(a - 1, b, arrays)
        return arrays[a][b]


for _ in range(t):
    n, m = map(int, sys.stdin.readline().split())

    if n < m: # m이 n 보다 큰 경우 index의 차이로 인해 에러 발생 -> 값을 변경해줌. 서로 반대라도 결과 값은 같음
        n, m = m, n

    array = [[0] * (m + 1) for _ in range(n + 1)]

    print(bina(n, m, array))
