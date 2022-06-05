public class javaloops {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int index = 1;
        while (index <= 9) {
            System.out.println("hello");
            index++;
        }
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j]);
        // }
        // System.out.println(" ");
        // }
        System.out.println(arr.length);
    }
}
