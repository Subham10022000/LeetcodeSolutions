class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a]=nums[i];
                a++;
            }
        }
        while(a<nums.length){
            nums[a++]=0;

        }
    }
}
