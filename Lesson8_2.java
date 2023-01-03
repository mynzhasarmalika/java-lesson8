
public class Lesson8_2{
	public static void main(String[] args) {
      
// Bonus9_157
// Даны два слова. Для каждой буквы первого слова определить, входит ли она 
// во второе слово. Повторяющиеся буквы первого слова не рассматривать. На-пример, если заданные слова
// процессор  и  информация, то для букв первого 
// из них ответом должно быть: нет да да да нет нет.
        
        String slovo1 = "mona";
        char arr1[] = new char [slovo1.length()];

        String slovo2 = "lola";
        char arr2[] = new char[slovo2.length()];
        boolean f = false;
        int i = 0;
        int j = 0;

        while(i < slovo1.length() ) {
          arr1[i] = slovo1.charAt(i);
          i++;
      
        }
        while(j < slovo2.length() ) {
          arr2[j] = slovo2.charAt(j); 
          j++; 
        }


        for (int m = 0 ; m < slovo1.length() ; m++ ) {
          for (int n = 0 ; n < slovo2.length() ; n++ ) {
            f=false;
        
            // System.out.println(arr1[i]+" and "+arr2[j] );
            if (arr1[m] == arr2[n]) {
              f = true;
              break;
            }
          }
    
          if (f == false) {
        System.out.println("-");
        
        }else 
          System.out.println("+");
        }
  }
}
  