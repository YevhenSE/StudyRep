import java.util.Locale;
import java.util.Scanner;

public class NameNumber {


    public static void main(String[] args) {

        String name;
        Scanner str = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = str.next();

        name = name.toLowerCase(Locale.ROOT); //перевод всех букв в нижний регистр
        char[] array;
        array = name.toCharArray(); //перевод строки в массив char
        int sum = 0;
        int sum1 = 0;

        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] alphabet1 = {' ', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'p', 'о', 'п', 'р', 'с', 'т', 'v', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};


        //Поиск совпадений в латинице и подсчет суммы совпадений
        for (int i = 0; i < alphabet.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[j] == alphabet[i]) {
                    sum = sum + i;
                }
            }

            //Поиск совпадений в кириллице и подсчет суммы совпадений
            for (int j = 0; j < array.length; j++) {
                if (array[j] == alphabet1[i]) {
                    sum1 = sum1 + i;
                }
            }

        }
        int finalSum = sum + sum1;
        System.out.println(finalSum + " - Число имени");

    }
}


//  final Scanner s = new Scanner ( System.in );
//  final String line = s.nextLine ().trim ();
//  final char [] array = line.toCharArray ();
//
//  int sum = 0;
//  for ( final char c : array )
//  {
//     if ( !Character.isDigit ( c ) )
//     {
//        throw new IllegalArgumentException ();
//     }
//
//     sum = sum + Character.getNumericValue ( c );
//  }
//
//  System.out.println ( "sum = " + sum );


//for ( ; n > 0; n /= 10)
//    sum += n % 10;