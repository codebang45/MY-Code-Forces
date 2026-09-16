import java.util.*; // 

public class Line_Trip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];

            // Stations input
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // 0 -> first station
            int max = arr[0];

            // Station -> station
            for (int i = 0; i < arr.length - 1; i++) {
                int distance = arr[i + 1] - arr[i];
                max = Math.max(max, distance);
            }

            // Last station -> x -> last station
            int lastDistance = 2 * (x - arr[n - 1]);
            max = Math.max(max, lastDistance);

            System.out.println(max);

            t--;
        }
    }
}