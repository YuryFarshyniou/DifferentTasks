package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.factory;

/*При большом числе клиентов приложения решение определять все команды в перечислении не повлечет
за собой создание большого количества объектов-команд,так как все клиенты бдут пользоваться общими
экземплярами команд.
* */

import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.ActionCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl.LoginCommand;
import examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.command.command_impl.LogoutCommand;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
