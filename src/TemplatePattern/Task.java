package TemplatePattern;

public abstract class Task {
    private Logger _logger;

    public Task() {
        _logger = new Logger();
    }

    public void execute(){
        _logger.logTask();

        doExecute();
    }

    protected abstract void doExecute();
}
