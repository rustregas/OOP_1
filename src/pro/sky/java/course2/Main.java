package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] studentsGryffindor = {
                new Gryffindor("Гарри Поттер", 5,5,50,50,50),
                new Gryffindor("Гермиона Грейнджер", 4,4,40,40,40),
                new Gryffindor("Рон Уизли", 3,3,30,30,30),
        };

        Puffenduy[] studentsPuffenduy = {
                new Puffenduy("Захария Смит", 5,5,50,50,50),
                new Puffenduy("Седрик Диггори", 4,4,40,40,40),
                new Puffenduy("Джастин Финч-Флетчли", 3,3,30,30,30),
        };


        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw("Чжоу Чанг", 5,5,50,50,50),
                new Ravenclaw("Падма Патил", 4,4,40,40,40),
                new Ravenclaw("Маркус Белби", 3,3,30,30,30),
        };

        Slytherin[] studentsSlytherin = {
                new Slytherin("Драко Малфой", 8,8,80,80,80),
                new Slytherin("Грэхэм Монтегю", 7,7,70,70,70),
                new Slytherin("Грегори Гойл", 6,6,60,60,60),
        };

        Hogwarts[] studentsHogwarts = new Hogwarts[studentsGryffindor.length
                + studentsPuffenduy.length
                + studentsRavenclaw.length
                + studentsSlytherin.length];

        System.arraycopy(studentsGryffindor, 0, studentsHogwarts, 0, studentsGryffindor.length);
        System.arraycopy(studentsPuffenduy, 0, studentsHogwarts, studentsGryffindor.length, studentsPuffenduy.length);
        System.arraycopy(studentsRavenclaw, 0, studentsHogwarts, studentsGryffindor.length + studentsPuffenduy.length, studentsRavenclaw.length);
        System.arraycopy(studentsSlytherin, 0, studentsHogwarts, studentsGryffindor.length + studentsPuffenduy.length + studentsRavenclaw.length, studentsSlytherin.length);

        studentsHogwarts[0].printInfo();
        studentsHogwarts[0].printGeneralInfo();
        System.out.println();

        Hogwarts.equalByGeneralStats(studentsHogwarts[0],studentsHogwarts[10]);
        Hogwarts.equalByGeneralStats(studentsHogwarts[1],studentsHogwarts[11]);

        Gryffindor.equalByStats(studentsGryffindor[0],studentsGryffindor[1]);
        Gryffindor.equalByStats(studentsGryffindor[0],studentsGryffindor[1]);

        Ravenclaw.equalByStats(studentsRavenclaw[0],studentsRavenclaw[1]);
        Ravenclaw.equalByStats(studentsRavenclaw[2],studentsRavenclaw[2]);

    }
}
