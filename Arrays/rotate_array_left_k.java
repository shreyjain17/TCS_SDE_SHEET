class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        d=d%n;
        int temp[]= new int[d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        
        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
            
        }
        
        for (int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
            
            
            
        }
        
        
    }
}
