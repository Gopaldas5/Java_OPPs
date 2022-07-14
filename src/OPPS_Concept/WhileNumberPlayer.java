package OPPS_Concept;

public class WhileNumberPlayer {


    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }
//    for limit = 30 ,output would be 1  4 9 16 25
    public void printSquareUptoLimit() {
        int i=1;
        System.out.print("Square numbers are: ");
        while(i*i < limit){
            System.out.print(i*i +" ");
            i++;
        }
        System.out.println();
    }
// for limit = 30 , output would be 1 8 27
    public void printCubeUptoLimit() {
        int i = 1;
        System.out.print("Cube numbers are: ");
        while (i * i * i < limit) {
            System.out.print(  i * i * i + " ");
            i++;
        }
        System.out.println();
    }

}
