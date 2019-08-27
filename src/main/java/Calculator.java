public class Calculator {



    public int cal(String numbers) {
        String[] nums = numbers.split(",");
        int sum = 0;
        if (numbers.equals("")){
            return 0;
        }
        if (nums.length > 2) {
            sum = Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]);
            return sum;
        }


        sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        return sum;
    }

    public void test() {}

}
