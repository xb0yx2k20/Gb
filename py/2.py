import random
from tkinter import *

def human(n):
    if n < 29:
        print("Подсказка: {num}".format(num = n))
    else:
        check = (n - 29) % 28
        if check == 0:
            check = 28
        print("Подсказка: {num} ".format(num = check))
    x = int(input())
    print("Кожаный взял {num1} конфет\nОсталось {num2}".format(num1 = x, num2 = n - x))
    if n - x <= 0:
        print("Кожаному повезло, победа...")
        return
    else:
         bot(n - x)   
    
def bot(n):
    x = random.randint(1, 28)
    print("Я взял {num} конфет".format(num = x))
    if n - x <= 0 :
        print("Кожаный проиграл!")
        return
    else:
        human(n - x)

def human_vs_human(n, k):
    if k % 2 == 1:
        print("Ход первого игрока")
        a = int(input())
        if (n - a) <= 0:
            print("Игрок 1 победил")
        else:
            print("Осталось {num}".format(num = n - a))
            human_vs_human(n - a, k + 1)
    else:
        print("Ход второго игрока")
        a = int(input())
        if (n - a) <= 0:
            print("Игрок 2 победил")
        else:
            print("Осталось {num}".format(num = n - a))
            human_vs_human(n - a, k + 1)


print("Выберите режим: \n1.Игра против ИИ\n2. 1 на 1")
mode = int(input())
n = 150
if mode == 1:
    first = random.randint(0, 1)
    if first == 0:
        print("Кожаный ходит первый!")
        human(n)
    else:
        print("Кожаный не ходит первый!")
        bot(n)
elif mode == 2:
    human_vs_human(n, 1)
else:
    print("ERROR")
