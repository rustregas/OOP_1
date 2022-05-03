package pro.sky.java.course2;

public class Slytherin extends Hogwarts{
    private int ambition;
    private int leadership;
    private int cunning;

    public Slytherin(String fullname, int charms, int apparation, int ambition, int leadership, int cunning) {
        super(fullname, charms, apparation);
        this.ambition = ambition;
        this.leadership = leadership;
        this.cunning = cunning;
    }

    public void printInfo(){
        printGeneralInfo();
        System.out.println(" ambition = " + ambition
                + "; leadership = " + leadership
                + "; cunning = " + cunning);
    }

    public int sumStats(){
        return ambition + leadership + cunning;
    }

    public static void equalByStats(Slytherin student1, Slytherin student2){
        equal.equalByStats(student1, student2);
    }
}
