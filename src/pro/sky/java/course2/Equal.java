package pro.sky.java.course2;

public class Equal {

    private static void printWinner(int studentStats1, int studentStats2, String student1, String student2) {
        if(studentStats1 == studentStats2){
            System.out.println("Ничья по статам");
        } else {
            if (studentStats1 > studentStats2) {
                System.out.println(student1);
            } else {
                System.out.println(student2);
            }
        }
    }

    public void equalByGeneralStats(Hogwarts student1, Hogwarts student2) {
        int studentStats1 = student1.sumGeneralStats();
        int studentStats2 = student2.sumGeneralStats();
        System.out.print("Сравнение по ключевым навыкам: ");
        printWinner(studentStats1, studentStats2, student1.getFullname(), student2.getFullname());
    }

    public void equalByStats(Hogwarts student1, Hogwarts student2) {
        int studentStats1 = student1.sumStats();
        int studentStats2 = student2.sumStats();
        System.out.print("Сравнение по факультетским навыкам: ");
        printWinner(studentStats1, studentStats2, student1.getFullname(), student2.getFullname());
    }

}
