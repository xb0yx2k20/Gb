d, n = map(float, input().split())
# Решение 1(возникаеt непонятная ошибка при вводе, например, 0.01 5.029, хотя оба значения вроде float)
print((n // d) * d)
# Решение 2
print('{0:.{ln}f}'.format(n, ln = len(str(d).split('0.')[1])))