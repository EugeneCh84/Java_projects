public class programm1 {
    public static void main(String[] args) {
        int numbers[] = new int[]{5, 7, 13, 19, 4, 2, 9};
        int min = numbers[0];
        int max = numbers[0];
      
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
            else if (numbers[i] < min)
                min = numbers[i];
        } 
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
   }
        
}
    

