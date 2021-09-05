package classes;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Shuichi", "Saihara", "01.01.1998", "38044555667712", "Faculty of Changing The World", "1", "123");
        Student st2 = new Student("Kaede", "Akamatsu", "12.04.1997", "38044555667713", "Faculty of Full-Automatic-Killing-Machine", "2", "321");
        Student st3 = new Student("Maki", "Harukawa", "10.07.1996", "38044555667714", "Faculty of Kaito-Caregiver", "3", "231");
        Student st4 = new Student("Kee", "Bo", "04.09.1999", "38044555667715", "Faculty of Head Voices", "2", "246");
        Student st5 = new Student("Kaito", "Momota", "03.04.1998", "38044555667716", "Tengen Toppa Faculty", "1", "133");
        Student st6 = new Student("Tsumugi", "Shirogane", "07.01.1998", "38044555667717", "Faculty of Girls Strip", "1", "144");
        Student st7 = new Student("Kokichi", "Oma", "03.12.1996", "38044555667718", "(Can only count to 10)Faculty", "1", "123");
        Student st8 = new Student("Angie", "Yonaga", "15.07.1997", "38044555667719", "AtuaAtuaAtuaAtua", "2", "321");
        Student st9 = new Student("Himiko", "Yomeno", "23.04.1998", "38044555667720", "(Because I'm a mage)Faculty", "3", "231");
        Student st10 = new Student("Tenko", "Chabashira", "05.01.1998", "38044555667721", "(Feminism is my life)Faculty", "3", "369");
        Student st11 = new Student("Ryoma", "Hoshi", "12.05.1997", "38044555667722", "(I dropped the soap and now I want to die)Faculty", "2", "321");
        Student st12 = new Student("Kirumi", "Tojo", "14.12.1996", "38044555667723", "(Best mom in the world)Faculty", "3", "231");
        Student st13 = new Student("Miu", "Iruma", "13.09.1999", "38044555667724", "(I am the fucking pussy here)Faculty", "1", "123");
        Student st14 = new Student("Gonta", "Gokuhara", "11.09.1998", "38044555667725", "(Seek bug)Faculty", "1", "133");

        StudentList newList = new StudentList();
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);
        newList.addStudent(st11);
        newList.addStudent(st12);
        newList.addStudent(st13);
        newList.addStudent(st14);
        newList.facultyPrint("Faculty of Full-Automatic-Killing-Machine");                                     //список студентов заданного факультета
        newList.facultyCoursePrint("(Because I'm a mage)Faculty", "3");
        newList.facultyCoursePrint("AtuaAtuaAtuaAtua");
        newList.facultyCoursePrint(1);                                          //списки студентов для каждого факультета и курса;
        newList.yearOfBirthPrint("1997");                                       //список студентов, родившихся после заданного года;
        newList.groupPrint("123");                                              //список учебной группы
    }
}
