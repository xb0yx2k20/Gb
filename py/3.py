import numpy as np

def display(mas):
    for i in range(3):
        for j in range(3):
            print(mas[i][j], end=" ") 
            if (j+1) % 3 == 0: 
                print()

def check(mas):
    for i in range(3):
        if mas[0][i] == mas[1][i] == mas[2][i] and mas[0][i] != '-':
            if mas[0][0] == 'X':
                print("Игрок 2 победил")
            else:
                print("Игрок 1 победил")
            return False
        elif mas[i][0] == mas[i][1] == mas[i][2] and mas[i][0] != '-':
            if mas[0][0] == 'X':
                print("Игрок 2 победил")
            else:
                print("Игрок 1 победил")
            return False
    if mas[0][0] == mas[1][1] == mas[2][2] and mas[0][0] != '-':
        if mas[0][0] == 'X':
            print("Игрок 2 победил")
        else:
            print("Игрок 1 победил")
            return False
    elif mas[2][0] == mas[1][1] == mas[0][2] and mas[1][1] != '-':
        if mas[0][0] == 'X':
            print("Игрок 2 победил")
        else:
            print("Игрок 1 победил")
            return False
    else:
        k = 0
        for i in range(3):
            for j in range(3):
                if '-' == mas[i][j]:
                    k += 1
        if k == 0:
            print("Ничья")
            return False
        return True


mas = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])   
res = [['-'] * 3 for i in range(3)]
k = 0
while check(res):
    display(mas)
    if k % 2 == 0:
        print("Игрок 1, выбери куда нарисовать О")
        n = int(input())
        idx = np.where(mas == n)
        if res[idx[0][0]][idx[1][0]] != '-':
            print("Занято!!!!!!!!!!!!!!!!!!!!!!!!!!")
            k += 1
        else:
            res[idx[0][0]][idx[1][0]] = 'O'
        display(res)
    else:
        print("Игрок 2, выбери куда нарисовать X")
        n = int(input())
        idx = np.where(mas == n)
        if res[idx[0][0]][idx[1][0]] != '-':
            print("Занято!!!!!!!!!!!!!!!!!!!!!!!!!!")
            k += 1
        else:
            res[idx[0][0]][idx[1][0]] = 'X'
        display(res)
    k += 1
    print()
    
    