class RunnningSumArray{
    public static void main(String []args){
        int[] arre={1,1,1,1,1};
        arre=runningSum(arre);
        
    }
    public static int[] runningSum(int[] nums){
        int [] arreglo=new int [nums.length];
        int aux2=0;
        for (int i = 0; i<nums.length;i++){
            arreglo[i]=nums[i]+aux2;
            aux2=arreglo[i];
        }
        return arreglo;
    }
}