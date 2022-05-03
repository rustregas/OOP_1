package pro.sky.java.course2;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;

    public Ravenclaw(String fullname, int charms, int apparation, int intelligence, int wisdom, int wit) {
        super(fullname, charms, apparation);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public void printInfo(){
        printGeneralInfo();
        System.out.println(" intelligence = " + intelligence
                + "; wisdom = " + wisdom
                + "; wit = " + wit);
    }

    public int sumStats(){
        return intelligence + wisdom + wit;
    }

    public static void equalByStats(Ravenclaw student1, Ravenclaw student2){
        equal.equalByStats(student1, student2);
    }
}
