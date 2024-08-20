package java_basic.arrays;

public class array_basic {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]+=1;
        }


    }
    public static void main(String[] args) {
        int marks[] = {70, 75, 60};
        update(marks);
        for(int i=0; i<=marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
