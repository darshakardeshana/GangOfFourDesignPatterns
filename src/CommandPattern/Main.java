package CommandPattern;

import CommandPattern.fx.*;

public class Main {
    public static void main(String[] args) {
        /*CustomerService customerService = new CustomerService();
        ICommand command = new AddCustomerCommand(customerService);
        Button button = new Button(command);
        button.click();*/

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteFilterCommand());
        compositeCommand.execute();
    }
}
