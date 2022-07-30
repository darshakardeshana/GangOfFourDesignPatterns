package CommandPattern;

import CommandPattern.fx.ICommand;

public class AddCustomerCommand implements ICommand {
    private CustomerService _customerService;

    public AddCustomerCommand(CustomerService customerService) {
        _customerService = customerService;
    }

    @Override
    public void execute() {
        _customerService.addCustomer();
    }
}
