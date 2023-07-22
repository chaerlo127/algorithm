# 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
# 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
# 최빈값이 여러 개면 -1을 return 합니다.

# 풀이
# 최댓 값을 찾되, 같은 값이 여러개 이나 최빈 값이 하나인 경우를 생각을 해야 함.
#
def solution(array):
    max = 0
    answer = 0
    for i in array:
        countI = array.count(i)
        # case 1 : 최댓 값인 경우
        if max < countI:
            max = countI
            answer = i
        # case 2 : 최빈값이 두개 이상 이며, 여태 찾은 배열의 최빈값과 다른 값인 경우
        elif max == countI and answer != i:
            answer = -1
    return answer