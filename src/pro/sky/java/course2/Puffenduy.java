package pro.sky.java.course2;

public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honest;

    public Puffenduy(String fullname, int charms, int apparation, int hardworking, int loyalty, int honest) {
        super(fullname, charms, apparation);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public void printInfo(){
        printGeneralInfo();
        System.out.println(" hardworking = " + hardworking
                + "; loyalty = " + loyalty
                + "; honest = " + honest);
    }

    public int sumStats(){
        return hardworking + loyalty + honest;
    }

    public static void equalByStats(Puffenduy student1, Puffenduy student2){
        equal.equalByStats(student1, student2);
    }
}
