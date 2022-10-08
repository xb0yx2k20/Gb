// Homework 7

double[][] arr(int m, int n) {
    double[][] mas =   new double[m][];
    for (int i = 0; i < m; i++) {
        mas[i] = new double[n];
        for (int j = 0; j < n; j++){
            mas[i][j] = Math.Round(new Random().NextDouble() * 15, 2, MidpointRounding.AwayFromZero);
        }
    }
    return mas;

}

// Задача 41
int m = Convert.ToInt32(Console.ReadLine());
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Task_47");
double[][] ms = arr(m, n);
for (int i = 0; i < m; i++){
    for (int j = 0; j < n;j++) {
        Console.Write($"{ms[i][j]} ");
    }    
    Console.WriteLine();
}
int m1 = Convert.ToInt32(Console.ReadLine());
int n1 = Convert.ToInt32(Console.ReadLine());

if (m1 > m && m1 < 1 && n1 > n && n1 < 1) {
    Console.WriteLine("Task_50 -> error");
} else {
    Console.WriteLine($"Task_50 -> {ms[m1 - 1][n1 - 1]}");
}

Console.WriteLine("Task_52");
double sm = 0;
for (int i = 0; i < n; i++){
    for (int j = 0; j < m; j++) {
        sm += ms[j][i];
    }  
    Console.WriteLine(Math.Round(sm / m, 2, MidpointRounding.AwayFromZero));
    //Console.WriteLine(ms[i].Average());
}