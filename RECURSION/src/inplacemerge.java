import java.util.Arrays;

public class inplacemerge {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,6,1};
        mergesortinplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesortinplace(int[]arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;
        mergesortinplace(arr,s,mid);
        mergesortinplace(arr,mid,e);
        mergeinplace(arr,s,mid,e);
    }
    private static void mergeinplace(int[]arr,int s,int m,int e){
        int[]mix=new int[e -s];
        int i=s;//first divided sorted array
        int j=m;//2nd divided sorted array
        int k=0;//1st+2nd merged sorted array
        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int I=0;i<mix.length;I++){
            arr[s+I] = mix[I];
        }
    }
}
