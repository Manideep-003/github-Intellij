public class twoDArray {
    public static void main(String[] args) {
        int [][] mat={{1,2,3},{4,5,6} ,{7,8,9}};
//        for(int i=0;i< mat.length;i++){
//            for(int j=0;j<mat[0].length;j++){
//
//                System.out.print(mat[i][j]+ " ");
//            }
//            System.out.println();
//
//
//        }
        for(int [] row:mat){
            for(int i=0;i< row.length/2;i++){
                int temp=row[i];
                row[i]=row[row.length-i-1];
                row[row.length-1-i]=temp;

            }

        }
        for(int[] row:mat){
            for(int i=0;i<row.length;i++){
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }
    }

}
