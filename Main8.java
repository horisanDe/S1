package M1;

public class Main8 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2};
        int[] array2 = array1;
        array1[0] = 3; 
        System.out.println(array2[0]);
    }
}

//  A. 0が表示
//  B. 3が表示
//  C. コンパイルエラー
//  D. 実行時に例外がスロー