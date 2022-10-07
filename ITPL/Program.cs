// Homework 5

int[] arr(int n) {
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
        nums[i] = new Random().Next(-100, 100);
    }
    return nums;
}

// Задача 34, 36, 38
int[] mas = arr(5);
int k = 0;
int sum = 0;
for (int i = 0; i < 5; i++) {
    Console.Write($"{mas[i]} ");
    if (mas[i] % 2 == 0) {
        k++;
    }
    if (i % 2 == 1) {
        sum += mas[i];
    }

}
Console.WriteLine($"\nTask_34 -> {k}");
Console.WriteLine($"Task_36 -> {sum}");
Console.WriteLine($"Task_38 -> {mas.Max() - mas.Min()}");

