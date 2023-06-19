import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        float result;
        String operation;

        do {
            System.out.println("""
                    Seleziona un'operazione:
                    1. Addizione
                    2. Sottrazione
                    3. Divisione
                    4. Moltiplicazione
                    5. Esci
                    """);

            int choice = Integer.parseInt(scanner.nextLine());

            System.out.print("Inserisci il primo numero: ");
            float num1 = Float.parseFloat(scanner.nextLine());

            System.out.print("Inserisci il secondo numero: ");
            float num2 = Float.parseFloat(scanner.nextLine());


            switch (choice) {
                case 1 -> {
                    result = calculator.add(num1, num2);
                    operation = "+";
                    System.out.println("Risultato: " + num1 + " " + operation + " " + num2 + " = " + result);
                }
                case 2 -> {
                    result = calculator.subtract(num1, num2);
                    operation = "-";
                    System.out.println("Risultato: " + num1 + " " + operation + " " + num2 + " = " + result);
                }
                case 3 -> {
                    result = Calculator.divide(num1, num2);
                    operation = "/";
                    System.out.println("Risultato: " + num1 + " " + operation + " " + num2 + " = " + result);
                }
                case 4 -> {
                    result = calculator.multiply(num1, num2);
                    operation = "*";
                    System.out.println("Risultato: " + num1 + " " + operation + " " + num2 + " = " + result);
                }
                case 5 -> {
                    exit = true;
                }
                default -> {
                    System.out.println("Scelta non valida. Riprova.");
                }
            }

        } while (!exit);

        scanner.close();
    }
}
