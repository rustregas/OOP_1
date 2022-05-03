package pro.sky.java.course2;

public abstract class Hogwarts {
    public static Equal equal = new Equal();

    private String fullname;
    private int charms;
    private int apparation;

    public String getFullname() {
        return fullname;
    }

    public Hogwarts(String fullname, int charms, int apparation) {
        this.fullname = fullname;
        this.charms = charms;
        this.apparation = apparation;
    }

    public void printGeneralInfo() {
        System.out.print("fullname = " + fullname
                + "; charms = " + charms
                + "; apparation = " + apparation + ";");
    }

    public abstract void printInfo();
    public abstract int sumStats();

    public int sumGeneralStats(){
        return apparation+charms;
    }

    public static void equalByGeneralStats(Hogwarts student1, Hogwarts student2){
        equal.equalByGeneralStats(student1, student2);
    }
}
