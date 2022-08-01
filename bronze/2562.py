list = list()
for i in range(9):
    a = int(input())
    list.append(a)
max = max(list)
print(max)
print(int(list.index(max))+1)