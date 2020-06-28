class MoveZeroes {
	/**
     * 思路：
     *  1、将非零的数字往前移，并用index保存最后一个非零的位置
     *  2、将index后面的数字全部置为0
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                nums[index ++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i ++) {
            nums[i] = 0;
        }
    }
}