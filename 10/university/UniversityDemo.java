package university;

import java.util.Date;

public class UniversityDemo {
    public static void main(String[] args) {
        System.out.println("=== ДЕМО УНИВЕРСИТЕТСКОЙ СИСТЕМЫ ===\n");

        // Создание основных объектов
        University university = new University("Технический университет");

        Faculty faculty = new Faculty("Компьютерные науки");
        university.addFaculty(faculty);

        Dean dean = new Dean(1001, "Иван Петров", "dean@uni.edu");
        faculty.setDean(dean);

        Institute institute = new Institute("Программная инженерия", "Здание А");
        faculty.addInstitute(institute);

        // Создание сотрудников
        Lecturer lecturer = new Lecturer(2001, "Анна Смирнова", "anna@uni.edu", "Базы данных");
        institute.addResearchAssociate(lecturer);

        // Создание курса
        Course course = new Course("Основы БД", 101, 45.5f);
        lecturer.addCourse(course);

        // Создание проекта
        Project project = new Project("Исследование ИИ", new Date(),
                new Date(System.currentTimeMillis() + 86400000 * 90));

        // Административный сотрудник
        AdministrativeEmployee admin = new AdministrativeEmployee(4001, "Мария Сидорова",
                "admin@uni.edu");

        System.out.println("\n=== ОСНОВНАЯ ИНФОРМАЦИЯ ===");

        // 1. Инфо университета
        System.out.println("\nУниверситет: " + university.getName());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Институт: " + institute.getName());

        // 2. Инфо сотрудников
        System.out.println("\nСОТРУДНИКИ:");
        System.out.println("Декан: " + dean.getName());

        System.out.println("Администратор: " + admin.getName());



        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
    }
}