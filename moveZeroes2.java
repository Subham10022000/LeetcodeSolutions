class Solution {
    public void moveZeroes(int[] nums) {
//     if(nums.length==1) return;
//     Queue<Integer> queue=new LinkedList<>();
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]!=0){
//             queue.add(nums[i]);
//         }
//     }
//         int index=0;
//         while(queue.size()!=0){
//             nums[index]=queue.poll();
//             index++;
//         }
//         while(index<nums.length){
//             nums[index]=0;
//             index++;
//         }
//     }
// }
int i=0;
int j=0;
while(j<nums.length){
    if(nums[j]!=0){
        int temp =nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        i++;
        j++;
    }else
    {
        j++;
    }

}

    }
}
