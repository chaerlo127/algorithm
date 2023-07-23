# 최대 공약수
def GCD(a, b):
    if b == 0:
        return a
    else:
        return GCD(b, a % b)


# 최소 공배수
def LCM(a, b, gcd):
    return a * b // gcd


a, b = map(int, input().split())
gcd = GCD(a, b)
print(gcd)
print(LCM(a, b, gcd))
