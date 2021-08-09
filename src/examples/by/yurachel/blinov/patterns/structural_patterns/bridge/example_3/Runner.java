package examples.by.yurachel.blinov.patterns.structural_patterns.bridge.example_3;

public class Runner {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
