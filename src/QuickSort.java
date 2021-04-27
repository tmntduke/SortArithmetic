class QuickSort{
    public static void quickSort(int[]a,int begin,int end){
        int i=begin;
        int j=end;
        int temp=a[begin];
        if(begin<end){
            while(i<j){
                while(i<j&&a[j]>temp){
                    j--;
                }
                if(i<j){
                    a[i]=a[j];
                    i++;
                }
                while(i<j&&a[i]<temp){
                    i++;
                }
                if(i<j){
                    a[j]=a[i];
                    j--;
                }
            }
            a[i]=temp;
            quickSort(a,begin,i-1);
            quickSort(a,i+1,end);
        }
    }
}