package jv;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        int[][] array = new int[3][2];
        
        for (int i = 0; i < arr.length; i+=2) {
            char[] chars = arr[i].toCharArray();
            array[i / 2][0] = chars[0];
            array[i / 2][1] = chars[1];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                array[2][j] - array[1][j] - array[0][j] + 111

            }
        }
    }
}
