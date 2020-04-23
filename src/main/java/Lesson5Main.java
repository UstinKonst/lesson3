public class Lesson5Main {
    public static void main(String[] args) {
        Person[] persons = new Person[] {
            new Person("Василий Петров", "Механик", "VasPet@mail.ru", "+78216265541", "40000", 45),
            new Person("Иван Харламов", "Сантехник", "IvaHar@mail.ru", "+79117564526", "50000", 35),
             new Person("Герогий Гринов", "Бармен", "GeoGri@mail.ru", "+74996561187", "60000", 42),
            new Person("Борис Артемов", "Программист", "BorArt@mail.ru", "+78216376101", "80000", 28),
            new Person("Кирилл Бастраков", "Таксист", "KirBas@mail.ru", "+74995617865", "30000", 48),
        };

        for(Person persons2 : persons) {
            if (persons2.getAge() > 40) {
                persons2.info();
            }
        }
    }
}