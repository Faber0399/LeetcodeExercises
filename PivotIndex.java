public class PivotIndex {
    public static void main(String[] args) {
       int [] nums = {2,1,-1};
       ;
       System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int pivot=0,sumaR=0,sumaL=0;
        for(int i =0;i<nums.length;i++){
             sumaR=0;
             sumaL=0;
            for(int h=i, j=i;h>=0||j<nums.length;j++,h--){
                if(i==j)continue;
                if(j<nums.length){sumaR=nums[j]+sumaR;}
                if(h<0)continue;
                sumaL=nums[h]+sumaL;     
                pivot=i; 

            }
             if(sumaR==0&&i==0)break;
             if(sumaL==0&&i==nums.length)break;
             else if(sumaR-sumaL==0&&pivot!=0)break;
            if(i+1==nums.length){pivot=-1;break;}
        }
        
        return pivot;
    }
        
        
        
        

}
