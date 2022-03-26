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


    public static void main(String[] args) {

        int id = 0;
        String name = "Basia";
        String surname = "Wira";
        String phoneNumber = "123456778";
        int age = 20;
        String contact = (id + ";" + name +";" + surname +";" + age + ";" + phoneNumber);
        boolean isHidden = false;


        printContactCard(id, name, surname, age, phoneNumber);
        printContact(id, name, surname, age, phoneNumber);
        getContact(id, name, surname, age, phoneNumber);
        printContactCard(contact);
        printContact(contact);



    }


    static void printContactCard(int id, String name, String surname, int age, String phoneNumber) {
        if((phoneNumber.length()>9) && (phoneNumber.length()<9) && (phoneNumber.length() != 0)){
            phoneNumber = "000000000";
        }  if (name.isEmpty() ){
            name = "NIEZNANY";
        }   if (surname.isEmpty()){
            surname = "NIEZNANY";
        } if  (phoneNumber.isEmpty()){
            phoneNumber = "NIEZNANY";
        }
        System.out.println("Id: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nWiek: " + age + "\nNumer telefonu: " + phoneNumber);
    }

    static void printContact(int id, String name, String surname, int age, String phoneNumber) {
        if((phoneNumber.length()>9) && (phoneNumber.length()<9) && (phoneNumber.length() != 0)){
            phoneNumber = "000000000";
        }  if (name.isEmpty() ){
            name = "NIEZNANY";
        }   if (surname.isEmpty()){
            surname = "NIEZNANY";
        } if  (phoneNumber.isEmpty()){
            phoneNumber = "NIEZNANY";
        }
        System.out.println(id + "|" + name + "|" + surname + "|" + age + "|" + phoneNumber);
    }

    static String getContact(int id, String name, String surname, int age, String phoneNumber) {
        if((phoneNumber.length()>9) && (phoneNumber.length()<9) && (phoneNumber.length() != 0)){
            phoneNumber = "000000000";
        }  if (name.isEmpty() ){
            name = "NIEZNANY";
        }   if (surname.isEmpty()){
            surname = "NIEZNANY";
        } if  (phoneNumber.isEmpty()){
            phoneNumber = "NIEZNANY";
        }
        return (id + "|" + surname + "|" + age + "|" + phoneNumber);


    }

    static void printContactCard(String contact) {
        String[] afterChange = contact.split(";");
        for (int i = 0; i < afterChange.length; i++) {
            System.out.println(afterChange[i]);
        }


    }

    static void printContact(String contact) {
        String[] afterChange2 = contact.split(";");
        for (String str : afterChange2) {
            System.out.print(str + "|");
        }


    }

    

//
//    static String getContactRaw(int id, String name, String surname, int age, String number, int isMobile) {
//
//
//        return getContactRaw(0, "Basia", "wira", 30, "233333333", 22).replace(",", ";");
//
//
//    }

}


