public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 0, 6, 5};

        System.out.println(divisionNum(numbers, 1));
    }

    public static int divisionNum(int[] array, int arrayIndex) {
        int result = 0;

        try {
            result = array[arrayIndex] / 0;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Errore indice inesistente: " + e);

        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e);
        }
        return result;
    }
}
