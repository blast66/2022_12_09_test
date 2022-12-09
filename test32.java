public class test32 {
    public static void main(String[] args){
        int count = 0;
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        for(int i = 0; i<=10 ; i++){
            count ++;
            if(arr[i]==2){
                System.out.println("index >>"+ i);
                
            }
        }
        System.out.println("count>>"+ count);
    }
}