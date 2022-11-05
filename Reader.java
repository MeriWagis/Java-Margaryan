package control1;
public class Reader {
    //создаем переменные в соответсвии с типом, все -стринговые, кроме ls (номер билета) и nom (номера телефона)
    // name - фио
    private String name;
    private int ls;
    private String facult;
    private String date;
    private String nom;
    //создаем функции для ввода информации из данного класса
    public void setName(String name) {
        this.name = name;}
    public void setLS(int ls) {
        this.ls = ls;}
    public void setFacult(String facult) {
        this.facult = facult;}
    public void setDate(String date) {
        this.date = date;}
    public void setNom(String phone) {
        this.nom = nom;}
    // создаем функции для вывода информации из класса
    public String getName() {
        return name;}
    public int getLS() {
        return ls;}
    public String getDate() {
        return date;}
    public String getNom() {
        return nom;}
    public String getFacult() {
        return facult;}
    //создаем функцию для ввода информации о полученных книгах
    public void takeBook(String book) {
        System.out.println("Студент " + name + " взял книгу " + book);}
    public void returnBook(String book) {
        System.out.println("Студент " + name + " вернул книгу " + book);}
    // функция длы вывода информации состоянии книг у пользователей
    public void baza() {
        System.out.println(name + " " + ls + " " + facult + " " + nom);}
    //проверка на состояние книги
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        if (ls != reader.ls) return false;
        if (name != null ? !name.equals(reader.name) : reader.name != null) return false;
        if (date != null ? !date.equals(reader.date) : reader.date != null) return false;
        if (nom != null ? !nom.equals(reader.nom) : reader.nom != null) return false;
        return facult != null ? facult.equals(reader.facult) : reader.facult == null;} }

