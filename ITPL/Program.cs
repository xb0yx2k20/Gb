// Задача 2
Console.WriteLine("Задача 2 - введите 2 числа, чтобы найти максимальное из них");
int a = Convert.ToInt32(Console.ReadLine());
int b = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"max = {Math.Max(a, b)}");


// Задача 4
Console.WriteLine("Задача 4 - введите 3 числа, чтобы найти максимальное из них");
int x = Convert.ToInt32(Console.ReadLine());
int y = Convert.ToInt32(Console.ReadLine());
int z = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"max = {Math.Max(Math.Max(x, y), Math.Max(z, y))}");


// Задача 6
Console.WriteLine("Задача 6 - введите число, чтобы определить четность");
int n = Convert.ToInt32(Console.ReadLine());
if (n % 2 == 0) {
    Console.WriteLine("дa");
}
else {
    Console.WriteLine("нет");
}

// Задача 8
Console.WriteLine("Задача 6 - введите число, чтобы найти четные числа, которые меньше введенного");
int N = Convert.ToInt32(Console.ReadLine());
if (N != 0) {
    if (N % 2 == 0) {
        Console.Write($"{N} ");
        N -= 2;
        }
    else {
        Console.Write($"{N - 1} ");
        N -= 3;
    }
    while (N >= 1) {
        Console.Write($"{N} ");
        N -= 2;
    }
}