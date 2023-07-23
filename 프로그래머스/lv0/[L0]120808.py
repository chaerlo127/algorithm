# 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
# 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
# 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.


# 풀이
# 각 분모의 최대 공약수를 구하여 곱해진 분자 분모에 최대 공약수를 나눔
# 구해진 분자, 분모를 약분을 하기 위해 분자, 분모의 공통된 최대 공약수를 구하여 나눔
# 유클리드 호제법을 사용하지 않고, 최대 공약수를 구함

# 트러블슈팅
# 계속해서 33.3% 만 정답 => 문제는 약분을 하지 않은 것
# 분자 분모의 최대 공약수를 구하여 각 나누면, 약분이 됨

def solution(numer1, denom1, numer2, denom2):
    # 최대공약수를 구하기
    gcd = 1
    for i in range(min(denom1, denom2), 0, -1):
        if denom1 % i == 0 and denom2 % i == 0:
            gcd = i
            break
    num = (denom1 * numer2 + denom2 * numer1) // gcd
    denomin = (denom1 * denom2) // gcd

    # 분자, 분모의 최대공약수
    for i in range(min(num, denomin), 0, -1):
        if num % i == 0 and denomin % i == 0:
            gcd = i
            break

    return [num // gcd, denomin // gcd]