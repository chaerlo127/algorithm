import sys

n = int(sys.stdin.readline())
l = {}
for _ in range(n):
    x, y, z = sys.stdin.readline().strip().split()
    l[x] = [y, z]  # root, left, right 순


def preorder(k):
    if k != ".":
        # root
        print(k, end='')
        # left
        preorder(l[k][0])
        # right
        preorder(l[k][1])


def inorder(k):
    if k != ".":
        # left
        inorder(l[k][0])
        # root
        print(k, end='')
        # right
        inorder(l[k][1])


def postorder(k):
    # print
    if k != ".":
        # left
        postorder(l[k][0])
        # right
        postorder(l[k][1])
        # root
        print(k, end='')


preorder('A')
print()
inorder('A')
print()
postorder('A')
