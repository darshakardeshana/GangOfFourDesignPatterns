package BehavioralPatterns.MediatorPattern.UsingObserver;

public class ArticlesDialogBox {
    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button button = new Button();

    public ArticlesDialogBox(){
        /*listBox.attach(new Observer() {
            @Override
            public void update() {
                listBoxChanged();
            }
        });*/

        //listBox.attach(() -> listBoxChanged());

        listBox.attach(this::listBoxChanged);
        textBox.attach(this::textBoxChanged);
    }

    public void simulateUserInteraction() {
        listBox.setSelection("article1");
        textBox.setContent("");
        System.out.println("Textbox: " + textBox.getContent());
        System.out.println("Button: " + button.isEnabled());
    }

    private void textBoxChanged() {
        var content = textBox.getContent();
        button.setEnabled(!(content == null || content.trim() == ""));
    }

    private void listBoxChanged() {
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
