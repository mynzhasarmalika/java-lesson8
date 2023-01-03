import java.util.*;
class Lesson8_last{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// Дан текст. Проверить, правильно ли в нем расставлены круглые скобки (т. е. 
// находится  ли  справа  от  каждой  открывающей  скобки  соответствующая  ей 
// закрывающая  скобка,  а  слева  от  каждой  закрывающей —  соответствующая 
// ей закрывающая). Предполагается, что внутри каждой пары скобок нет дру-гих скобок.
// а) Ответом должны служить слова да или нет. 
// б) В случае неправильности расстановки скобок:
// если  имеются  лишние  правые  (закрывающие)  скобки,  то  выдать  сооб-щение с указанием позиции первой такой скобки;
// если имеются лишние левые (открывающие) скобки, то выдать сообще-ние с указанием количества таких скобок.
// Если скобки расставлены правильно, то сообщить об этом.
        
        String word = in.nextLine(); 
        int length = word.length(); 
        char arr[] = new char[length]; 
        boolean just = word.startsWith(")"); 

        boolean f = false; 
        int count = 0; 
        int count1 = 0; 
        int i = 0;

        while( i < length ){ 
          if(just==true){ 
            f = true; 
          } else{ 
              f = false; 
            } 
          i++;
        } 

        int j = 0; 
        while(j < length) { 
         if (f == true) { 
         System.out.println("Not balanced"); 
         break; 
         }else{ 

           int m = 0;

           while( m < length ){ 
             if(word.charAt(m) == '('){ 
               count++; 
             } 
             if(word.charAt(m) == ')'){ 
             count1++; 
             } 
             m++;
           } 
         } 
         j++;
        } 

        if (f != true) { 
        if(count == count1){ 
          System.out.println("дурыс"); 
        }else{ 
          System.out.println("дурыс емес"); 
      } 
    } 
  } 
}



 