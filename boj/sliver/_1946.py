import sys

T = int(input())

for _ in range(T):
    n = int(input())
    array = list()
    for _ in range(n) :
        array.append(list(map(int, sys.stdin.readline().split())))

    array.sort() # 정렬

    ans = 1;
    standard = array[0][1]
    for i in range (1, n):
        if standard > array[i][1]: # 제일 낮은 점수보다 낮으면 불합격
            standard = array[i][1]
            ans += 1
    print(ans)    
    