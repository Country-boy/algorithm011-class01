class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                if(i + 1 == j) {
					i++;
				}
                else {
					nums[++i] = nums[j]; 
				}   
            }
        }
        return i + 1;

    }
}