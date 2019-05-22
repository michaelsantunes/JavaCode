package codility;

public class FrogJump {

    public static int solution(int X, int Y, int D) {
        int jump = ( Y - X ) / D;
        if ( ( Y - X ) % D > 0 )
            jump++;
        return jump;
    }


    public static void main(String[] args) {
        System.out.println(solution(3, 999111321, 7));
    }


}
