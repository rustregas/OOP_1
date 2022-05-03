package pro.sky.java.course2;

public class Gryffindor extends Hogwarts {
    private int chivalry;
    private int courage;
    private int bravery;

    public Gryffindor(String fullname, int charms, int apparation, int chivalry, int courage, int bravery) {
        super(fullname, charms, apparation);
        this.chivalry = chivalry;
        this.courage = courage;
        this.bravery = bravery;
    }

    public int getChivalry() {
        return chivalry;
    }

    public int getCourage() {
        return courage;
    }

    public int getBravery() {
        return bravery;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printInfo(){
        printGeneralInfo();
        System.out.println(" chivalry = " + chivalry
                + "; courage = " + courage
                + "; bravery = " + bravery);
    }

    public int sumStats(){
        return chivalry + courage + bravery;
    }

    public static void equalByStats(Gryffindor student1, Gryffindor student2){
        equal.equalByStats(student1, student2);
    }
}
