public class multidimension1{
    public static void main(String[] args){
        int[][] muldimen={
            {45,67,89},
            {34,23,47}
        };
        for(int i=0;i<muldimen.length;i++){
            for(int j=0;j<muldimen[i].length;j++){
                System.out.print(muldimen[i][j]+" ");

            }
            System.out.println();
        }
    }
}