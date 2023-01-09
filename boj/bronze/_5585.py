price = 1000 - int(input())

change = [500, 100, 50, 10, 5, 1]
count = 0
for i in change:
    count += price // i # 몫을 더함 -> 몫을 다 더한 것이 거스름돈의 최종 개수
    price = price % i # 나머지
print(count)