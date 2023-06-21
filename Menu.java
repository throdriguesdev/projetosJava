import java.util.Scanner;

public class Menu{
    private Scanner scanner;
    public Menu() {
        scanner = new Scanner(System.in);
    }
    public int showMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Exibir média dos alunos ");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
    public Student registerStudent() {
        System.out.print("\nDigite o nome do aluno: ");
        String name = scanner.next();

        System.out.print("Quantas notas deseja inserir para o aluno " + name + "?");
        int amountGrades = scanner.nextInt();
        Double[] grades  = new Double[amountGrades];
        for (int i = 0; i < amountGrades; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        return new Student(name, grades);
    }
}