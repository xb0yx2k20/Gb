with open('py/file1.txt') as f1:
    line1 = f1.readline()
print(line1)
k = 1
res = ''
for i in range(len(line1) - 1):
    if line1[i] == line1[i + 1]:
        k += 1
    else:
        res += str(k) + line1[i]
        k = 1
res += str(k) + line1[-1]
print(res)
with open('res.txt', 'w') as result:
    result.write(res)