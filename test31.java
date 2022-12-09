import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class test31 {
    public static void main(String[] args){
        int[] a = {7, 3, 4, 9, 6 ,11 ,15 ,17};
        int b = 0;
        int w = 0;
        int count = 0;
        for (int i = a.length-1; i >=0 ; i = i-1){
            for(int j = 0; j < i ; j = j + 1 ){
                count ++;
                if(a[j]>a[i]){
            
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                   
                    while(w < a.length){   
                        System.out.print(">>" + a[w] );
                        w = w+1 ;
                    }
                    w = 0;
                    System.out.println("    cange ===> " + count );
                }
            }
        }
        System.out.println();
        for(int x = 0 ; x < a.length; x++){
            System.out.println(">>" + a[x] );
        }
        System.out.println();
        System.out.print("count totle >> " + count);
    }
}