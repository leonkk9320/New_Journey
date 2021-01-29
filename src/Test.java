public class Test {

    public static final int I_4 = 0;

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= 6; j++) {
                if((i+j)%2 == 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
