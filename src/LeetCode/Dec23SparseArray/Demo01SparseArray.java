package LeetCode.Dec23SparseArray;

public class Demo01SparseArray {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        for(int[] sub : arr){
            for(int i : sub){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        System.out.println("======");

        //turn to sparseArray
        int count = 0;
        for(int[] sub : arr){
            for(int i : sub){
                if(i != 0){
                    count++;
                }
            }
        }


        int[][] sparseArr = new int[count+1][3];

        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = count;

        int row = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0){
                    sparseArr[row][0] = i;
                    sparseArr[row][1] = j;
                    sparseArr[row][2] = arr[i][j];
                    row++;
                }
            }
        }

        for(int[] r : sparseArr){
            for(int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        //back to original array
        int[][] arr1 = new int[sparseArr[0][0]][sparseArr[0][1]];

        for (int i = 1; i < sparseArr.length; i++) {
            arr1[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        for(int[] r : arr1){
            for(int i : r){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
