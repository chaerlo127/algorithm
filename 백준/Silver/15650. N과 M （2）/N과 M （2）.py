import sys

n, m = map(int, sys.stdin.readline().split())
l = [] # 답을 저장하기 위한 리스트


# 중복되는 수열을 여러 번 출력하면 안되기 때문에
# 무조건 뒤에 위치한 숫자는 앞의 숫자들보다 수열 갯수가 줄어든다. 
# 4, 2인 경우에는
# 1이 앞에 위치한 경우 => 3개 
# 2이 앞에 위치한 경우 => 2개 
# 3이 앞에 위치한 경우 => 1개
def back(k):
    if len(l) == m: # 리스트의 길이가 m과 같다면 print (답을 출력)
        print(" ".join(map(str, l)))
        return
    for i in range(k, n + 1): # 1 ~ n 까지의 자연수 중에서
        if i not in l: # 자연수가 리스트 내에 저장이 되어 있지 않다면 => 중복을 해결하기 위함
            l.append(i) # 리스트 뒤에 저장
            back(i + 1) # 재귀
            l.pop() # 리스트 내 삭제 => 다른 경우의 수를 위해


back(1)
