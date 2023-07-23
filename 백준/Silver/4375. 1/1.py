# int 형만 가능 => 메모리 문제
# 본 문제대로만 코드를 생성하면 런타임에러가 발생
while True:
    try:
        n = int(input())
    except:
        break
    num = 0
    check = 1
    while True:
        num = num * 10 + 1
        if num % n == 0:
            break
        check = check + 1
    print(check)
