package Worker;



public class Operations {
    public static void main(String[] args) {
     Worker[] persArray = new Worker[5];
     persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
     persArray[1] = new Worker("Danil Andreevic", "Director", "Dani.1@mailbox.com", "89284152765", 70000, 38);
     persArray[2] = new Worker("Kirill Igorevih", "Manager", "Kirka@mailbox.com", "89236504321", 50000, 40);
     persArray[3] = new Worker("Andrei Sergeevih", "CEO", "Andros@mailbox.com", "89233214678", 300000, 45);
     persArray[4] = new Worker("Sergei Valentinovih", "Project Manager", "Serg@mailbox.com", "8929991112", 90000, 41);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age >= 40) {
                persArray[i].printWork();

            }

        }
    }


}









