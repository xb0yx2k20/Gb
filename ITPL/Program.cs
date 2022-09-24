// Homework 2

// Задача 19
Console.WriteLine("Задача 19 - напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.");
long a = Convert.ToInt64(Console.ReadLine());
string aString = Convert.ToString(a);
int k = 0;
int fl = 0;
int lna = aString.Length;
while (k != (lna / 2)) {
    if (aString[k] != aString[lna - 1 - k]) {
        Console.WriteLine("no");
        fl = 1;
        break;
    }
    k++;
}
if (fl == 0) {
    Console.WriteLine("yes");

}

// Задача 21
Console.WriteLine("Задача 21 - программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.");
int x1 = Convert.ToInt32(Console.ReadLine());
int y1 = Convert.ToInt32(Console.ReadLine());
int z1 = Convert.ToInt32(Console.ReadLine());
int x2 = Convert.ToInt32(Console.ReadLine());
int y2 = Convert.ToInt32(Console.ReadLine());
int z2 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(Math.Round(Math.Sqrt(Math.Pow((x1 - x2), 2) + Math.Pow((y1 - y2), 2) + Math.Pow((z1 - z2), 2)), 2));



// Задача 23
Console.WriteLine("Задача 23 -  напишите  программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.");
int n = Convert.ToInt32(Console.ReadLine());
for (int i = 1; i <= n; i++)
{
    Console.Write($"{Math.Pow(i, 3)} ");
}