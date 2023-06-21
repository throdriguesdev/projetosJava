import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Menu menu = new Menu();
        int option = 0;
        while (option != 3) {
            option = menu.showMenu();
            switch (option) {
                case 1 -> {
                    Student student = menu.registerStudent();
                    students.add(student);
                    System.out.println("Aluno cadastrado com sucesso!");
                }
                case 2 -> showAverage(students);
                case 3 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
public static void showAverage(List <Student> students) {
        if (students.isEmpty()) {
            System.out.println("\nNenhum aluno cadastrado.");
            return;
        }
    System.out.println("\nMÉDIAS DOS ALUNOS");
    for (Student student : students) {
        System.out.println("Aluno: " + student.getName() + " - Média: " + student.calculateAverage());
    }
}
}




