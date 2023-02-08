from random import randint

k = int(input())
koefs = [randint(0, 100) for i in range(k + 1)]
res = ["{kf} * x^{ind}".format(kf = koefs[i], ind = i) for i in range(k, 0, -1) if koefs[i] != 0]

if koefs[0] != 0: 
    res.append(koefs[0])
for i in range(1, len(res) * 2 - 1, 2):
    res.insert(i, '  +  ')

for i in res:
    print(i, end='')
print(" = 0")