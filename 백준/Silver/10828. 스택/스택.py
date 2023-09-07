import sys

N = int(input())

stack = []
for _ in range(N):
    command = sys.stdin.readline().split()
    if command[0] == 'push' :
        stack.append(command[1])
    elif command[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else: print(stack.pop())
    elif command[0] == 'size':
        print(len(stack))
    elif command[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else: print(0)
    elif command[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else : print(stack[-1])
# 0907 새로 푼 코드
# import sys
#
# n = int(sys.stdin.readline())
# l = []
#
# for _ in range(n):
#     s = sys.stdin.readline().split()
#     if s[0] == 'push':
#         l.append(s[1])
#     if s[0] == 'top':
#         print(l[-1])
#     if s[0] == 'pop':
#         if len(l) == 0:
#             print(-1)
#         else:
#             print(l.pop())
#     if s[0] == 'size':
#         print(len(l))
#     if s[0] == 'empty':
#         if len(l) == 0:
#             print(1)
#         else:
#             print(0)
