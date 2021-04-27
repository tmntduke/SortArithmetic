class HeapSort{
    public static void sort(int[]nums){
        for(int i=nums.length/2-1;i>=0;i--){
            adjustHeap(nums,i,nums.length);
        }

        for(int i=nums.length-1;i>=0;i--){
            swap(nums,0,i);
            adjustHeap(nums,0,i);
        }
    }

    public static void adjustHeap(int[]nums,int i,int length){
        int temp=nums[i];
        for(int j=2*i+1;j<length;j=2*j+1){
            if(j+1<length && nums[j]<nums[j+1]){
                j++;
            }
            if(nums[j]>temp){
                nums[i]=nums[j];
                i=j;
            }else{
                break;
            }
        }
        nums[i]=temp;
    }

    public static void swap(int[]nums,int begin,int end){
        int temp=nums[begin];
        nums[begin]=nums[end];
        nums[end]=temp;
    }
}