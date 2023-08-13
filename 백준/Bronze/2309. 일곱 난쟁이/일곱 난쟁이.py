num = 9
lists = [int(input()) for _ in range(num)]
a = 0
b = 0

# 리스트를 살펴 보며, 합이 100이 되는 경우 break
for i in range(num - 1):
    for j in range(i+1, num):
        if sum(lists) - lists[i] - lists[j] == 100:
            a = lists[i]
            b = lists[j]
            break
    
# 이렇게하면 답이 안나옴 왜인지 모르겠음        
# for i in range(num - 1):
#     for j in range(i+1, num):
#         a = lists[i]
#         b = lists[j]
#         if sum(lists) - a - b == 100:
#             break

lists.remove(a)
lists.remove(b)
lists.sort()

for i in lists:
    print(i)
