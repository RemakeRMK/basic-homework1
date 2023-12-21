package ru.rmk.otus.java.hw9;

public class HomeWork9 {
    public static void main(String args[]) {
        try {
            int answer = massiveArray(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}});
            System.out.println(answer);
        } catch (AppArraySizeException e) {
        } catch (AppArrayDataException e) {
        }
    }

    public static int massiveArray(String[][] a) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(a[i][j]);
            }
        }
        return sum;
    }

    public class AppArraySizeException extends Exception {
        private static final long serialVersionUID = -5116101128118950844L;
    }

    public
    class AppArrayDataException extends Exception {
        static final long serialVersionUID = -2848938806368998894L;
    }

}
