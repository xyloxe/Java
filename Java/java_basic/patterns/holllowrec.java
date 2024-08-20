package java_basic.patterns;

//matrix way is used in mostly advanced patterns
public class holllowrec {

    public static void hol_rec(int totRows, int totCols){
        for (int i=1; i<=totRows; i++){
            //inner columns
            for(int j=1; j<=totCols; j++){
                //cell (i, j i.e(r,c))
                if (i == 1 || i ==totRows || j == 1 || j == totCols){
                    //bounday cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); // to put it in next line
        }
    }


    public static void main(String[] args) {
        hol_rec(4, 5);
    }
}
