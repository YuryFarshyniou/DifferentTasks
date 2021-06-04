package examples.by.yurachel.blinov.patterns.structural.facade.basic;

public class Facade implements IFacade {
    private SecuritySystem securitySystem;
    private SubSystem subSystem;

    public Facade() {
        //Варианты инициализации могут быть разными.
        this.subSystem = new SubSystem();
        this.securitySystem = new SecuritySystem();
    }

    @Override
    public void generate() {
        //Проверка пользователя и его прав.
        securitySystem.checkUser();
        securitySystem.checkRights();
        //Действие create.
        subSystem.createNode();
    }

    @Override
    public void find() {
//Проверка пользователя.
        securitySystem.checkUser();
        //Действие parse.
        subSystem.parse();
    }
}
