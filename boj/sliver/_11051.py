import sys
sys.setrecursionlimit(10**9)
n, k = map(int, sys.stdin.readline().split())

array = [[0] * (k + 1) for _ in range(n+1)]


def binomial_coefficient(a, b):
    if a == b or b == 0:
        return 1
    else:
        if array[a][b] == 0:
            array[a][b] = (binomial_coefficient(a - 1, b - 1) + binomial_coefficient(a - 1, b)) % 10007
        return array[a][b]


print(binomial_coefficient(n, k))
