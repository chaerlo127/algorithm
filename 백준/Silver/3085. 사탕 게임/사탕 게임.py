def checkColumn():
    global maxValue
    for i in range(n):
        cMax = 1
        for j in range(n - 1):
            if lists[i][j] == lists[i][j+1]:
                cMax += 1
                maxValue = max(cMax, maxValue)
            else:
                cMax = 1


# 행 i, 열 j
# 한 열에서 행의 앞 뒤를 실펴보아 계산 진행
def checkRow():
    global maxValue
    for i in range(n):
        cMax = 1
        for j in range(n - 1):
            if lists[j][i] == lists[j + 1][i]:
                cMax += 1
                maxValue = max(cMax, maxValue)
            else:
                cMax = 1


def swap(a, b, x, y):
    lists[a][b], lists[x][y] = lists[x][y], lists[a][b]


n = int(input())
maxValue = 0

lists = [list(input()) for _ in range(n)]


for m in range(n):
    for k in range(n):
        if k + 1 < n:
            # 가로를 변경해가며 가로, 세로 체크
            # 가로 변경
            swap(m, k, m, k + 1)  # 가로 열과 변경하려는 위치
            # 체크
            checkColumn()
            checkRow()
            # 원위치
            swap(m, k, m, k + 1)
        if m + 1 < n:
            # 세로를 변경해가며 가로, 세로 체크
            swap(m, k, m + 1, k)
            # 체크
            checkColumn()
            checkRow()
            # 원위치
            swap(m, k, m + 1, k)
print(maxValue)
