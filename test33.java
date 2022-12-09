public class test33 {
    public static void main(String[] args){
        int count = 0;
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        for(int i = 0; i<= arr.length-1 ; i++){
            count ++;
            if(arr[i]==2){
                System.out.println("index >> "+ i);
                break;
            }
        }
        System.out.println("count >> "+ count);
    }
}