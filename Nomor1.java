import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
         System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }

        /* Pekerjaan anda berakhir sini */
        scanner.close();

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
