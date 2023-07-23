def solution(n):
    # 최소공배수 구하기
    lcm = 0
    for i in range(max(n, 6), n * 6 + 1):
        if i % n == 0 and i % 6 == 0:
            lcm = i
            break
    return lcm // 6