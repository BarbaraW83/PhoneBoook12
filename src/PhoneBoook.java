public class PhoneBoook {

    // 1 zadanie
//Stwórz zmienne:
//        id – typ int, zainicjalizowany dowonlną wartością liczbową (wartość id równa 0 będzie traktowana jako domyślna – nieustawiona)
//        name – typ String, zainicjowana dowolnym imieniem
//        surname – typ String, zainicjowana dowolnym nazwiskiem
//        phoneNumber – typ String, zainicjowana dowolnym, 9-cyfrowym numerem telefonu
//        age – typ int, zainicjalizowaną wartością 20
//        contact – typ String, zainicjalizowaną pustym ciągiem znaków
//        isHidden – typ boolean, zainicjalizowaną wartością false
//static void printContactCard(int id, String name, String surname, String phoneNumber, int age) –
// wyświetlającą tekst zawierającą informację o kontakcie w formacie:
//Id: id
//Imię: name
//Nazwisko: surname
//Wiek: age
//Numer telefonu: nubmer
//void printContact(int id, String name, String surname, String phoneNumber, int age) –
// wyświetlającą tekst zawierającą informację o kontakcie w formacie: id | name | surname | age | number

//static String getContact(int id, String name, String surname, String phoneNumber)
// – zwracającą tekst z informacją o kontakcie w formacie: id | name | surname | age | number

//import java.lang.reflect.Array;
//import java.util.Arrays;

    //1 zadanie



        public static void main(String[] args) {

            int id = 0;
            String name = "Basia";
            String surname = "Kapica";
            String phoneNumber = "123456789";
            int age = 20;
            String contact = "     ";
            boolean isHidden = false;
//        int [] lastDialed = new int[10];
            int[] lastDialed = {1, 4, 56, 12, 30, 45, 21, 890, 2, 3};


            printContactCard(id, name, surname, age, phoneNumber);
            printContact(id, name, surname, age, phoneNumber);
            getContact(id, name, surname, age, phoneNumber);
            printContactCard(contact);
            printContact(contact);


        }


        static void printContactCard(int id, String name, String surname, int age, String phoneNumber) {

            System.out.println("Id: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);
        }

        static void printContact(int id, String name, String surname, int age, String phoneNumber) {
            System.out.println(id + "|" + name + "|" + surname + "|" + age + "|" + phoneNumber);
        }

        static String getContact(int id, String name, String surname, int age, String phoneNumber) {
            return (id + "|" + surname + "|" + age + "|" + phoneNumber);
        }


// 2 zadaniee
//
//        static void printContactCard(String contact) {
//
//            contact = "id;name;surname;age;phoneNumber";
//
//            String [] afterChange = contact.split(";");
//            for (int i=0; i<afterChange.length; i++){
//                System.out.println(afterChange[i]);
//            }
//
//
//
//        }


        static void printContactCard(String contact) {

            contact = "id;name;surname;age;phoneNumber";

            String[] afterChange = contact.split(";");
            for (int i = 0; i < afterChange.length; i++) {
                System.out.println(afterChange[i]);
            }


        }

        static void printContact(String contact) {

            contact = "id;name;surname;age;phoneNumber";
            String[] afterChange2 = contact.split(";");

            for (String str : afterChange2) {
                System.out.print(str + "|");
            }


        }

        static String getContactRaw(int id, String name, String surname, int age, String number, int isMobile) {


            return getContactRaw(0, "Basia", "wira", 30, "233333333", 22).replace(",", ";");


        }

        // 3 zadanieStwórz metody:
        //
        //int getLastDialed(int[] tab) – zwracającą wartość na pierwszej pozycji tablicy
        //
        //int getLastDialed(int[] tab, int index) – zwracającą wartość na przekazanej pozycji w tablicy (wartość index podawana jest w sposób ‘naturalny’ - od 1-10). Jeśli na podanej pozycji nie ma prawidłowego id (wartość różna od 0) zwróć 0  i wyświetl odpowiedni komunikat
        //
        //int dial(int[] tab, int id) – ustawiającą przekazaną wartość na pierwszej pozycji w tablicy
        //
        //int removeLastDialed(int[] tab, int index) – ustawiającą wartość dla elementu tablicy, pod indeksem przekazanym jako argument, na 0 (wartość index podawana jest w sposób ‘naturalny’ - od 1-10)
//    static public int getLastDialed(int[] tab) {
//
//    }
    }



