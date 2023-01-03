
public class Lesson8_1{
	public static void main(String[] args) {
      
// Проверить,  является  ли  "перевертышем"  (см. задачу  9.78)  следующая  
// сим-вольная строка после удаления из нее всех пробелов:
// а) АРГЕНТИНА МАНИТ НЕГРА;

		String berilgeni ="АРГЕНТИНА МАНИТ НЕГРА";
        String ber2 = berilgeni.replace(" ","");
    
        System.out.println(ber2);
        int length = ber2.length();
        int arr[] = new int [length];

        int i = 0;
        int j = length - 1;

        String rSide = "";
        String lSide = "";

        while(i < length){
          char c = ber2.charAt(i);
          rSide = rSide + c;
          i++;
        }
        // System.out.println("Оннан солга окыганда"+rSide);
        while(j <= length && j != -1){
          char c1 = ber2.charAt(j);
          lSide = lSide + c1;
          j--;
        }
        // System.out.println("Солдан онга окыганда"+lSide);
        boolean res = lSide.equals(rSide);
        System.out.println("перевертыш: "+res);    
    }
}
