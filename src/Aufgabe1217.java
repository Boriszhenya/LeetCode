public class Aufgabe1217 {
    public static void main(String[] args) {
        int[] position = new int[]{1,1000000000};
        System.out.println(minCostToMoveChips(position));

    }

    public static int minCostToMoveChips(int[] position) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                sumEvenNumbers += 1;
            } else {
                sumOddNumbers += 1;
            }
        }
        if (sumEvenNumbers <= sumOddNumbers) {
            return sumEvenNumbers;
        } else
            return sumOddNumbers;
    }

}
// порахувати всі парні числа і всі непарні і мінімум з цих двох сум буде нашим результатом

