package control1;
public class Main {
    public static void main(String[] args) {
        //обрщение к классу ридер, все сеты это ввод информации о пользователе новом, геты - вывод
        Reader st1 = new Reader();
        Reader st2 = new Reader();
        st1.setName("Мартынова Алла Викторовна");
        st1.setLS(213358);
        st1.setDate("12.08.2003");
        st1.setFacult("Машинное обучение");
        st1.setNom("89164753344");
        System.out.println("Пользователь " + st1.getName() + " номер билета: " + st1.getLS() + " -студент факультета  " + st1.getFacult() + " ЗАРЕГИСТИРОВАН " + "дата рождения: " + st1.getDate() + " номер телефона: " + st1.getNom());
        st2.setName("Иванов Александр Игоревич");
        st2.setLS(213244);
        st2.setDate("08.12.2002");
        st2.setFacult("Востоковдение");
        st2.setNom("89164773298");
        System.out.println("Пользователь " + st2.getName() + " номер билета: " + st2.getLS() + " -студент факультета  " + st2.getFacult() + " ЗАРЕГИСТИРОВАН " + "дата рождения: " + st2.getDate() + " номер телефона: " + st2.getNom());
        st1.takeBook("Л. Н. Гумилев");
        st1.returnBook("Конец и вновь начало");
        st2.takeBook("Ремарк");
        st2.returnBook("Время жить и время умирать");
        System.out.println("В базе: ");
        st1.baza();
        st2.baza();
    }
}
