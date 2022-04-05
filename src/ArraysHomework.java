// 3 zadanieStwórz metody:
//int getLastDialed(int[] tab) – zwracającą wartość na pierwszej pozycji tablicy  OK

//int getLastDialed(int[] tab, int index) – zwracającą wartość na przekazanej pozycji w tablicy (wartość index podawana jest w sposób ‘naturalny’ - od 1-10).
// Jeśli na podanej pozycji nie ma prawidłowego id (wartość różna od 0) zwróć 0  i wyświetl odpowiedni komunikat
//
//int dial(int[] tab, int id) – ustawiającą przekazaną wartość na pierwszej pozycji w tablicy
//
//int removeLastDialed(int[] tab, int index) – ustawiającą wartość dla elementu tablicy, pod indeksem przekazanym jako argument,
// na 0 (wartość index podawana jest w sposób ‘naturalny’ - od 1-10)

import java.util.Arrays;

import static java.lang.System.*;

public class ArraysHomework {

    public static void main(String[] args) {
        int[] lastDialed = {1, 4, 56, 12, 30, 45, 21, 890, 2, 3};
        int valueFromUserInput = 3;
        int id = 2222;
        int indexChangeValue = 2;

        getLastDialed(lastDialed);
        getLastDialed2(lastDialed,  valueFromUserInput);
        dial(lastDialed, id);
        removeLastDialed(lastDialed,indexChangeValue);
    }

    static int getLastDialed(int[] tab) {
        int firstElement = tab[0];
        return firstElement;
    }

  static int getLastDialed2(int[] tab, int index) {
        if ((index >= tab.length) || (index < 0))

            {
                out.println("poza zakresem");
                return index=0;
            }
      return index;
  }

static void dial(int[] tab, int id){
        for (int i = 0; i<(tab.length-1); i++){
           ; // przypisujemy pierwszy el. '1", ma wskoczyc na tab[1]
            int temp = tab[i];
            tab[i+1] = tab[i]; // drugi el.
            tab[i+1] = temp;

        }

      tab[0] = id;


}
        static int removeLastDialed(int[] tab, int index){
            tab[index] = 0;
            return tab[index];
        }
    }
