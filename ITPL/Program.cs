// Homework 4

// Задача 25
Console.WriteLine("Задача 25 - напишите  цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.");
long a = Convert.ToInt64(Console.ReadLine());
long b = Convert.ToInt64(Console.ReadLine());
long res = a;
while (b != 1) {
    res *= a;
    b--;
}
Console.WriteLine(res);

// Задача 27
Console.WriteLine("Задача 27 - напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.");
int x1 = Convert.ToInt32(Console.ReadLine());
int sum = 0;
while (x1 != 0) {
    sum += x1 % 10;
    x1 /= 10;
}
Console.WriteLine(sum);



// Задача 29
Console.WriteLine("Задача 29 -  напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.");
	
int[] nums = new int[8];
for (int i = 0; i < 8; i++)
{
    nums[i] = Convert.ToInt32(Console.ReadLine());
}
for (int i = 0; i < 8; i++)
{
    Console.WriteLine(nums[i]);
}
