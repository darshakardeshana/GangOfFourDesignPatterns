package CommandPattern.fx;

public class Button {
    private ICommand _command;

    public Button(ICommand command) {
        _command = command;
    }

    public void click(){
        _command.execute();
    }
}
