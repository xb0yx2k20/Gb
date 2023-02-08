with open('file1.txt') as f1:
    line1 = f1.readline()
with open('file2.txt') as f2:
    line2 = f2.readline()
line1, line2 = line1.split(), line2.split()

res, subRes = (), ()
for i in range(2, len(line1), 4):
    print(line1[i])
    if line1[i] in line2 and line1[i] != '=':
        res += (int(line1[i - 2]) + int(line2[line2.index(line1[i]) - 2])), line1[i]
    else:
        subRes += (int(line1[i - 2]), line1[i])
print(res)
if (len(res) // 10 - 1) != (len(line2) - 3) // 4:
    for i in range(2, len(line2), 4):
        if line2[i] not in res:
            subRes += (int(line2[i - 2]), line2[i])

res = list(subRes + res)[:-1]

fl = 0
for i in range(1, len(res) * 2 - 1, 2):
    if fl == 0:
        res.insert(i, ' * ')
        fl = 1
    else:
        res.insert(i, '  +  ')
        fl = 0
res = [str(i) for i in res]
print(res)
with open('res.txt', 'w') as result:
    for i in res:
        print(i, end='')
        result.write(i)
    print(" = 0")
    result.write(" = 0")
