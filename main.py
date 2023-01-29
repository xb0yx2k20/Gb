#1
a = 5
if (a >= 6):
    print(a, " -> да")
else:
    print(a, " -> нет")

#2.1
for x in range(2):
    for y in range(2):
        for z in range(2):
            print("x = ", x, ", y = ", y, ", z = ", z)
            print(not(x + y + z)==(not(x) and not(y) and not(z)))

#2.2
x = 34
y = -30
if (x > 0 and y > 0):
    print("I")
elif (x < 0 and y > 0):
    print("II")
elif (y < 0 and x > 0):
    print("IV")
elif (x < 0 and y < 0):
    print("III")

#3.1
x = 2
if x == 1:
    print("x > 0 and y > 0")
elif x == 2:
    print("x < 0 and y > 0")
elif x == 3:
    print("x < 0 and y < 0")
elif x == 4:
    print("y < 0 and x > 0")
else:
    print("error")

#3.2
x1 = 3
y1 = 6
x2 = 2
y2 = 1
print(((x1 - x2)**2 + (y1 - y2)**2)**0.5)


