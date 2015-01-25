package package115.listener;

import package115.cleaning.Cleaner;
import package115.parser.StringParser;

import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CleanButtonListener implements ActionListener {

    JTextComponent extComponent;
    JTextComponent dirComponent;

    public CleanButtonListener(JTextComponent extComponent, JTextComponent dirComponent) {
        this.extComponent = extComponent;
        this.dirComponent = dirComponent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringParser parser = new StringParser();
        String[] extArray = parser.stringToArray(extComponent.getText());
        String[] dirArray = parser.stringToArray(dirComponent.getText());
        new Cleaner().clean(extArray, dirArray);
    }
}
