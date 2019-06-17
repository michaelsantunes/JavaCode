package hackerrank;

import java.util.Scanner;

public class DestinationTogether {

    public static long solution(String options) {
        String[] cities = options.split(" ");
        int nJohn = Integer.parseInt(cities[0]);
        int mZizi = Integer.parseInt(cities[1]);
        int ctogether = Integer.parseInt(cities[2]);

        long combinations = 1;
        if ( (nJohn > 0 && mZizi > 0) && ( nJohn < 11 && mZizi < 11) && ( ctogether > 0 && ( ctogether <= mZizi && ctogether<= nJohn))) {
            int unique = (nJohn - ctogether) + ( mZizi - ctogether) + ctogether;
            for ( int i = 1; i <unique; i++) {
                combinations = combinations * i;
            }
        } else {
            return 0;
        }
        return combinations;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Number OF Cities: ");
        String numberOfCities = scanner.nextLine();
        scanner.close();
        System.out.println("myString is: " + numberOfCities);
        System.out.println(solution(numberOfCities));
    }
}
