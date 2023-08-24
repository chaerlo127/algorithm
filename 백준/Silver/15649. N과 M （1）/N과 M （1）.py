import sys

n, m = map(int, sys.stdin.readline().split())
l = [] # 답을 저장하기 위한 리스트


def back():
    if len(l) == m: # 리스트의 길이가 m과 같다면 print (답을 출력)
        print(" ".join(map(str, l)))
        return
    for i in range(1, n + 1): # 1 ~ n 까지의 자연수 중에서
        if i not in l: # 자연수가 리스트 내에 저장이 되어 있지 않다면 => 중복을 해결하기 위함
            l.append(i) # 리스트 뒤에 저장
            back() # 재귀
            l.pop() # 리스트 내 삭제 => 다른 경우의 수를 위해


back()
