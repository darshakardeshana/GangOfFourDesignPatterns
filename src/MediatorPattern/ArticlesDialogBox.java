package MediatorPattern;

public class ArticlesDialogBox extends DialogBox {
    private ListBox listBox = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button button = new Button(this);

    public void simulateUserInteraction() {
        listBox.setSelection("article1");
        textBox.setContent("");
        System.out.println("Textbox: " + textBox.getContent());
        System.out.println("Button: " + button.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if (control == listBox) {
            listBoxChanged();
        } else if (control == textBox) {
            var content = textBox.getContent();
            button.setEnabled(!(content == null || content.trim() == ""));
        }
    }

    private void listBoxChanged() {
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
