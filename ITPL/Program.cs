// Homework 2

// Задача 10
Console.WriteLine("Задача 10 - напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.");
int a = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(a / 10 % 10);


// Задача 13
Console.WriteLine("Задача 13 - напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.");
int x = Convert.ToInt32(Console.ReadLine());
if (x / 100 != 0) {
    Console.WriteLine(Convert.ToString(x)[2]);
}
else {
    Console.WriteLine("третьей цифры нет");
}


// Задача 15
Console.WriteLine("Задача 15 -  напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.");
int n = Convert.ToInt32(Console.ReadLine());
if (n == 6 || n == 7) {
    Console.WriteLine("дa");
}
else {
    Console.WriteLine("нет");
}