while True:
    try:
        x = int(input("Введите число от 1 до 5: "))
        if x < 1 or x > 5:
            raise ValueError("Число должно быть от 1 до 5")
        break
    except ValueError as e:
        print(e)
