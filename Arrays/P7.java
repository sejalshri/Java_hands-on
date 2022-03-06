public class P7 {
    public static void main(String[] args) {
        int arr[]={65,90,120,120,100,100,100};
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        for(int i=0;i<=j;i++){
            System.out.print(temp[i] + "  ");
        }
    }
}
