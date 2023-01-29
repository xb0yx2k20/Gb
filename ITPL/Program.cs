// Homework 9

int func(params int[] nums)
{
    // Task_64
    if (nums.Length == 1) {
        if (nums[0] == 0) {
            Console.WriteLine();
            return 1;
        } else {
            Console.Write($"{nums[0]} ");
            func(nums[0] - 1);
        }
    }

    // Task_66
    if (nums.Length == 2) {
        Console.WriteLine((nums[0] + nums[1]) * (nums[1] - nums[0] + 1) / 2);
    }

    // Task_68
    int akRes = 0;
    if (nums.Length == 3) {
        if (nums[0] == 0) {
            akRes = nums[1] + 1;
            return nums[1] + 1;
        } else if (nums[0] > 0 && nums[1] == 0) {
            return func(nums[0] - 1, 1, 1);
        } else if (nums[0] > 0 && nums[1] > 0) {
            return func(nums[0] - 1, func(nums[0], nums[1] - 1, 1), 1);
        }
        return akRes;
    }
    return 1;
}


func(5);
func(10);
func(1, 15);
func(4, 8);
int res = func(2, 3, 'a');
int res1 = func(3, 2, 'a');
Console.WriteLine($"{res}\n{res1}");
