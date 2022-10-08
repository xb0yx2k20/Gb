// Homework 6

// Задача 41
int k = 0;
int m = 5;
for (int i = 0; i < m; i++){
    int n = Convert.ToInt32(Console.ReadLine());
    if (n > 0) {
        k++;
    }
}

// Задача 43
int k1 = Convert.ToInt32(Console.ReadLine());
int k2 = Convert.ToInt32(Console.ReadLine());
int b1 = Convert.ToInt32(Console.ReadLine());
int b2 = Convert.ToInt32(Console.ReadLine());
int x = (b2-b1)/(k1 - k2);
Console.WriteLine($"\nTask_41 -> {k}");
Console.WriteLine($"Task_43 -> x: {x}, y: {b1 + k1 * x}");

