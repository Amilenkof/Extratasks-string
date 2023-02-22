import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1.");
        /*### **Повышенная сложность. Задание 5**
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
<aside>
💡 **Важно**: «в голове» высчитывать позиции пробелов  и параметров для обрезания строки запрещено.  Их должен вычислить компьютер.
</aside>
- **Подсказка**
    Определить индексы символов помогут методы indexOf() и lastIndexOf().
- Критерии оценки
    – При изменении содержания строки результат программы выполняется.
    – Программа решена с помощью метода substring().
    – Результат программы выведен в консоль согласно условиям задачи.*/
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите ФИО");
//        String fullName= scan.nextLine();
//        String firstName,secondName,thirdName;
//        String[] name = fullName.split(" ");
//        firstName = name[0];
//        secondName = name[1];
//        thirdName = name[2];
//        System.out.println("Имя сотрудника —" + secondName);
//        System.out.println("firstName = " + firstName);
//        System.out.println("thirdName = " + thirdName);

        // Scanner scan = new Scanner(System.in);
        //   System.out.println("Введите ФИО");
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName, middleName, lastName;
        firstName = fullName.substring(0, fullName.indexOf(' '));
        middleName = fullName.substring((fullName.indexOf(' ') + 1), fullName.lastIndexOf(' '));
        lastName = fullName.substring((fullName.lastIndexOf(' ') + 1), fullName.length());
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

    }

    public static void task2() {
        System.out.println("Задача 2.");
//        ### **Повышенная сложность. Задание 6**
//        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
//    Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
//      В качестве исходных данных используйте строку fullName c данными  “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
//        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
//        - **Подсказка 1**
//        Метод toCharArray() может быть полезен.
//                - **Подсказка 2**
//        Для пеобразования символа в верхний регистр следует использовать метод  Character.toUpperCase(c), где c — символ.
//                - Критерии оценки
//    – Применен метод, меняющий написание данных строки.
//    – При изменении содержания строки результат программы выполняется.
//    – Результат программы выведен в консоль согласно условиям задачи.
        String fullName = "ivanov ivan ivanovich";
        char[] nameArray = fullName.toCharArray();
        nameArray[0] = Character.toUpperCase(nameArray[0]);
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] == ' ') {
                nameArray[i + 1] = Character.toUpperCase(nameArray[i + 1]);
            }
        }
        String fullNameNew = new String(nameArray);
        System.out.println("Верное написание Ф. И. О. сотрудника заглавных букв — " + fullNameNew);
    }

    public static void task3() {
        System.out.println("Задача 3.");
        /*### **Повышенная сложность. Задание 7**
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
- **Подсказка**
    Следует использовать StringBuilder.
- Критерии оценки
    – Применен метод, меняющий написание данных строки.
    – При изменении содержания строки результат программы выполняется.
    – Результат программы выведен в консоль согласно условиям задачи.*/
        String one = "135";
        String two = "246";
        StringBuilder oneTwo = new StringBuilder(one);
        oneTwo.append(two);
        for (int i = 0; i < oneTwo.length(); i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                // char c = oneTwo.charAt(i+2);
                //   oneTwo.replace(i,oneTwo.charAt(i+2));}
//нерешил

            }


        }


    }

    public static void task4() {
        System.out.println("Задание 4.");
//        ### Повышенная сложность. Задание 8
//
//        Дана строка из букв английского алфавита  "aabccddefgghiijjkk".
//
//                Нужно найти и напечатать буквы, которые дублируются в строке.
//
//                Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
//
//                В итоге в консоль должен быть выведен результат программы: "acdgijk".
//
//                - Критерии оценки
//
//    – Данные в строке отсортированы корректно.
//
//    – При изменении содержания строки результат программы выполняется.
//
//    – Результат программы выведен в консоль согласно условиям задачи.
        String s = "aabccddefgghiijjkk";
        char[] sArr = s.toCharArray();
        char[] sArrDouble;
        for (int i = 0; i < s.length()-1; i++) {
            if (sArr[i]==sArr[i+1]){
                System.out.print(sArr[i]); }
        }
        System.out.println();

    }

    public static void task5() {
        System.out.println( "вариант 2");
    String s = "aabccddefgghiijjkk";
        for (int i=0;i<s.length()-1;i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                System.out.print(s.charAt(i));
            }
        }
    }
}






