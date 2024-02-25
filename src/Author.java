public class Author {
    private String name;
    private String middleName;
    private String familyName;
    //метод-конструктор для ФИО автора
    public Author(String name, String middleName, String familyName){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }
    // Метод toString() преобразовывает данные сложного объекта в одну строку
    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName;
    }
    // веренем в метод main() значения параметров
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getFamilyName() {
        return familyName;
    }
}