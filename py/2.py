def simple(n):
    d = 2
    mas = []
    while d <= n // d:
        if n % d == 0:
            if d ** 2 == n:
                if len(simple(d)) == 0:
                    mas.append(d)
            else:
                if len(simple(n // d)) == 0:
                    mas.append(n // d)
                if len(simple(d)) == 0:
                    mas.append(d)
        d += 1
    return mas

n = int(input())
res = simple(n)
if len(res) == 0:
    res.append(n)
print(res)