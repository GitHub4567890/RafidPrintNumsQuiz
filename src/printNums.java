public class printNums {
    public printNums(){

    }

    public void printNums(int value, int numRounds) {
        for (int i = 1; i <= numRounds; i++) {
            int randNum = (int) (Math.random() * 10);
            while (randNum != value) {
                System.out.print(randNum);
                randNum = (int)(Math.random() *10);
            }
            System.out.println(value);
            System.out.println();
        }
    }
}
