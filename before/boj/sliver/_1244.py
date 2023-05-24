import sys

n = int(sys.stdin.readline())

array = [0] + list(map(int, sys.stdin.readline().split()))
student_num = int(sys.stdin.readline())


def change_switch(personNum):
    if array[personNum] == 0:
        array[personNum] = 1
    elif array[personNum] == 1:
        array[personNum] = 0


for _ in range(student_num):
    person, person_num = map(int, sys.stdin.readline().split())  # 성별, 스위치 받은 수

    if person == 1:  # 남자인 경우
        for i in range(1, n + 1):
            if i * person_num > n:
                break
            else:
                change_switch(person_num * i)

    elif person == 2:  # 여자인 경우
        change_switch(person_num)  # 일단 자기 자신을 바꾸고
        for i in range(int(n / 2)):
            if person_num + i > n or person_num - i < 1:  # index 영역 밖에서 벗어나면 멈추고
                break
            if array[person_num - i] == array[person_num + i]:  # 양 옆의 값이 같으면 스위치를 변경해주고
                change_switch(person_num - i)
                change_switch(person_num + i)
            else:  # 값이 다르면 바로 멈춤
                break

for j in range(1, n + 1):
    print(array[j], end=" ")
    if j % 20 == 0:  # 예외 처리 조심! 문제 자세히 읽어 보기
        print()
