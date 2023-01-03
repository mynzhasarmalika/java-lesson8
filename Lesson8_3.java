public class Lesson8_3{
	public static void main(String[] args) {
  // // Bonus9_153
        // Дан текст. Найти наибольшее количество идущих подряд одинаковых сим-волов

           
        String slovo1 = "monaalisssa";
        String slovo2 = slovo1.replace(" ","");
        int length=slovo2.length();

        char arr1[] = new char [length];
        int arr2[] = new int [length];
        int count = 0;
        int i = 0 ; 
        
        while(i < length-1 ) {
          arr1[i] = slovo2.charAt(i);//m o 
          arr1[i+1] = slovo2.charAt(i+1);//o n 
      
            if (arr1[i] == arr1[i+1]) {
               count++;
               arr2[i]=count;
   
             } else {
               count=0;
               arr2[i]=count;
            }
            i++;
        }

        int max = 0;
        int mIndex=0;
        int j = 0 ;

        while( j < length ) {
          int t = j + 1 ;
          while( t < length ) {
            if (max < arr2[j]) {
              max = arr2[j];
              mIndex = j;
            }
            t++;
          }
          j++;
        }
        System.out.println((max+1)+" раза "+arr1[mIndex]);
    }
}
  


