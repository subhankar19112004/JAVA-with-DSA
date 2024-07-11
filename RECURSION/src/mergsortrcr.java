import java.util.Arrays;
public class mergsortrcr {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,6,1};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[]left=merge(Arrays.copyOfRange(arr,0,mid));
        int[]right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeS(left,right);
    }
    private static int[] mergeS(int[] first,int[]second){
        int[]mix=new int[first.length + second.length];
        int i=0;//first divided sorted array
        int j=0;//2nd divided sorted array
        int k=0;//1st+2nd merged sorted array
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[k];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
