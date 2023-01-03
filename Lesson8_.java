import java.util.*;
class Lesson8_{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//     9.169. Дано предложение. Вывести на экран:
// а) его слова, начинающиеся и оканчивающиеся на одну и ту же букву;
        String word = in.nextLine();
        String arr1[] = word.split(" ");//3
        int i = 0;


        while(i < arr1.length) {
          int len = arr1[i].length();
          char arr2[] = new char[len];
          int j = 0;

          while(j < len ) {
            arr2[j] = arr1[i].charAt(j);
            j++; 
          }

          System.out.println(arr2[0]);
          System.out.println(arr2[len-1]);

          if (arr2[0] == arr2[len-1]) {
            System.out.println("YES");
        
          }else
            System.out.println("NO");
          i++;
          
        }
    }
}
    






//     9.169. Дано предложение. Вывести на экран:
// б) его слова, которые содержат ровно три буквы е;
//         String word = in.nextLine();
//         String arr1[] = word.split(" ");
//         int count = 0;
//         char e = 'e';
//         char y = 'o';
//         int i = 0;

//         while( i < arr1.length) {
//           count = 0;
//           int len = arr1[i].length();
//           char arr[] = new char[len];
//           int j = 0;
//           while(j < len) {
//             arr[j] = arr1[i].charAt(j);
//             y = arr[j];

//             if (y == e) {
//               count++;
//             }if (count >= 3) {
//               System.out.println(arr1[i]);
//             } 
//             j++; 
//           }
//           i++;
//         }
//     }
// }    
  





//       9.169. Дано предложение. Вывести на экран:
// в) его слова, которые содержат хотя бы одну букву о.


//         String word = in.nextLine();
//         String array[] = word.split(" ");
//         int count = 0;
//         char e = 'e';
//         char o = 'o';
//         int i = 0;

//         while( i < array.length) {
//           count = 0;
//           int len = array[i].length();
//           char arr[] = new char[len];
//           int j = 0;

//           while( j < len ) {
//             arr[j] = array[i].charAt(j);
//             o = arr[j];

//             if (o == e) {
//                 count++;
//             } else if (count >= 1) {
//                 System.out.println(array[i]);
//               } 
//             j++; 
//            }
//           i++;
//         }    
//     }
// }


