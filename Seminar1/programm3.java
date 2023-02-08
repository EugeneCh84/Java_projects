public class programm3 {
    
    static int[] movetoend(int []array,int NumtoMove) {
    int i = 0;
    int j = array.length - 1;
 
    while (i < j)
        {
            while (i < j && array[j] == NumtoMove)
                j--;
            if (array[i] == NumtoMove)
                swap(array, i, j);
            i++;
        }
    return array;
    }
 
    static int[] swap(int []arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void main(String[] args) {

        int []arr = { 3, 2, 2, 3 };
        int K = 3;
        int []ans = movetoend(arr, K);
 
        for(int i = 0; i < arr.length; i++)
            System.out.print(ans[i] + " ");
    }
}
    

