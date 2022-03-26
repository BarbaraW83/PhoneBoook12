// 3 zadanieStwórz metody:
//int getLastDialed(int[] tab) – zwracającą wartość na pierwszej pozycji tablicy  OK

//int getLastDialed(int[] tab, int index) – zwracającą wartość na przekazanej pozycji w tablicy (wartość index podawana jest w sposób ‘naturalny’ - od 1-10).
// Jeśli na podanej pozycji nie ma prawidłowego id (wartość różna od 0) zwróć 0  i wyświetl odpowiedni komunikat
//
//int dial(int[] tab, int id) – ustawiającą przekazaną wartość na pierwszej pozycji w tablicy
//
//int removeLastDialed(int[] tab, int index) – ustawiającą wartość dla elementu tablicy, pod indeksem przekazanym jako argument,
// na 0 (wartość index podawana jest w sposób ‘naturalny’ - od 1-10)
//    static public int getLastDialed(int[] tab)


import java.util.Arrays;

public class ArraysHomework {

    public static void main(String[] args) {
        int[] lastDialed = {1, 4, 56, 12, 30, 45, 21, 890, 2, 3};
        int valueFromUserInput = 2;
        int valueId = 12;

        getLastDialed(lastDialed);
       getLastDialed2(lastDialed,  valueFromUserInput);
       dial(lastDialed, valueId);

       dial2(lastDialed,valueId);
    }

    static int getLastDialed(int[] tab) {

        int firstElement = tab[0];
        return firstElement;
    }
    //int getLastDialed(int[] tab, int index) – zwracającą wartość na przekazanej pozycji w tablicy (wartość index podawana jest w sposób ‘naturalny’ - od 1-10).
// Jeśli na podanej pozycji nie ma prawidłowego id (wartość różna od 0) zwróć 0  i wyświetl odpowiedni komunikat
//

  static int getLastDialed2(int[] tab, int index) {
        if ((index >= tab.length) || (index < 0))

            {
                System.out.println("poza zakresem");
                return index=0;
            }
      return index;
  }
//int dial(int[] tab, int id) – ustawiającą przekazaną wartość na pierwszej pozycji w tablicy
//
static int dial(int[] tab, int id){
        tab[0] = id;

        return tab[0];
}
//    static public void dial2(int[] tab, int id){
//        tab[0] = id;
//        System.out.println(Arrays.toString(tab));

//int removeLastDialed(int[] tab, int index) – ustawiającą wartość dla elementu tablicy, pod indeksem przekazanym jako argument,
// na 0 (wartość index podawana jest w sposób ‘naturalny’ - od 1-10)
//    static public int getLastDialed(int[] tab)


    static int removeLastDialed(int[] tab, int index){

        
        return ;
    }

}