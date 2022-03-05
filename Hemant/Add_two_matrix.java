public class Add_two_matrix {
    public static void main(String[] args) {
        int [][] mat1 = {{10,12,14},
                          {20,22,24}};
        int [][] mat2 = {{1,5,4},
                          {2,3,9}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0; i<mat1.length;i++){
                for (int j=0; j<mat1[i].length;j++ ){
                    System.out.format("Setting value for i =%d and j =%d\n",i,j);
                    result[i][j]= mat1[i][j] + mat2[i][j];
                }
        }
                for(int i=0; i<mat1.length;i++){
                for (int j=0; j<mat1[i].length;j++ ){
                    System.out.format(result[i][j] + " ");
                    result[i][j]= mat1[i][j] + mat2[i][j];
                }
                System.out.println("");

        }
    }
}
