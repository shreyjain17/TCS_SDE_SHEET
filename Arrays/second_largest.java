class Solution {
    public int print2largest(int[] arr) {
        int large=arr[0];
        int slarge=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>large){
                slarge=large;
                large=arr[i];
                
            }
            
            else if (arr[i]<large && arr[i]>slarge){
                slarge=arr[i];
            }
        }
    
        return slarge;
    }
    
}
