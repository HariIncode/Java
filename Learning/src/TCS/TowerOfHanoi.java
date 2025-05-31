package TCS;

public class TowerOfHanoi {

    private static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'B', 'C');
        System.out.println("Total Moves " + count);
    }

    static void toh(int n, char source, char auxiliary, char destination){
        if(n == 1){
            count++;
            System.out.println("Moving Disk 1 From " + source + " to " + destination);
            return;
        }
        toh(n-1, source, destination, auxiliary);
        count++;
        System.out.println("Moving Disk " + n + " From "+ source + " to " + destination);
        toh(n-1, auxiliary, source, destination);
    }
}
