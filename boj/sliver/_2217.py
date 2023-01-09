N = int(input())

array = list()
for _ in range(N):
    array.append(int(input()))

array.sort(reverse=True)

for i in range(N):
    array[i] = array[i] * (i + 1)
print(max(array))