import java.util.Random;

public class Application {

    public static void main(String args [])
    {Student Ivan = new Student("Ivan","Petrov");
    Student Anna = new Student("Anna","Petrova");
    Student John = new Student("John","Doe");
    Student Jack = new Student("Jack","Black");
    Student Victory = new Student("Victory","Queen");
    Student[]Names = new Student[5];
    Names [0]=Ivan;
    Names [1]=Anna;
    Names [2]=John;
    Names [3]=Jack;
    Names [4]=Victory;
    Random marks = new Random();
    int [] Results = new int [5];
    for (int i = 0; i < 5; i++) {
        Results[i] = marks.nextInt(4) + 1;
        }
        int average = 0;
        for(int i=0;i<5;i++){
            average += Results[i];
        }
        average/=5;
        System.out.println(average);
}
}