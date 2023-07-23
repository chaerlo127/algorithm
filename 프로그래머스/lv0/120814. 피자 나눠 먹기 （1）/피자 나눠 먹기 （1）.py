def solution(n):
    # 7개면 딱 맞게 떨어짐
    if (n % 7 == 0) : answer = n // 7
    else: answer = n // 7 + 1
    return answer