public class invertedHalfPyramidWithNumbers {
    public static void main(String args[]){
        int n =5;

        for(int i=0;i<n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
