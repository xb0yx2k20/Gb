a1, d, n = int(input()), int(input()), int(input())
res = []
for i in range(1, n + 1):
    res.append(a1 + d*(i - 1))
print(res)
