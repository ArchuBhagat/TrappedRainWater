
public class trappedRainwater {
  public static int Trapped_rainwater(int arr[]){
    int trappedrainwater=0;
    int n=arr.length;

    //left max boundary
    int leftMax[]=new int[n];
     leftMax[0]=arr[0];
     for(int i=1;i<n;i++){
        //calculating max from left side
        leftMax[i]=Math.max(arr[i], leftMax[i-1]);
     }

     //right max boundary
     int rightmax[]=new int[n];
     rightmax[n-1]=arr[n-1];
     for(int i=n-2;i>=0;i--){
        //calculating max from right side
        rightmax[i]=Math.max(arr[i], rightmax[i+1]);
     }
     //loop wl and tp

     for(int i=0;i<n;i++){
        //water level 
        int water_level=Math.min(rightmax[i], leftMax[i]);
        //trappped water
        trappedrainwater +=(water_level-arr[i]);
     }
     return trappedrainwater;

      }
    public static void main(String[] args) {
        int arr[]={3,0,2,0,4};
        System.out.println("trapped rain water is : "+Trapped_rainwater(arr));
    }
}
