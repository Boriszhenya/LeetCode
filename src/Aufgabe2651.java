public class Aufgabe2651 {
    public static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 9;
        System.out.println(findDelayedArrivalTime(arrivalTime,delayedTime));

    }

    public static  int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        return (arrivalTime + delayedTime)%24;
    }

}
