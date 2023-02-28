n = int(input())

fiboArray = [0 for _ in range(n+1)]

fiboArray[1] = 1


def fibo(n):
    if n == 0 or n == 1:
        return fiboArray[n]
    else:
        if fiboArray[n] > 0:
            return fiboArray[n]
        fiboArray[n] = fibo(n - 1) + fibo(n - 2)
        return fiboArray[n]


print(fibo(n))
