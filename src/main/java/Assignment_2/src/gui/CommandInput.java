package Assignment_2.src.gui;

import Assignment_2.src.command.Command;
import Assignment_2.src.command.CommandFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class CommandInput {
    private JPanel rootPanel;
    private JTextField commandTextField;
    private JButton executeButton;
    private GUIFacade guiFacade;

    public CommandInput() {

        guiFacade = GUIFacade.getInstance();


        executeButton.addActionListener(e -> {
            if (commandTextField.getText() != null) {
                CommandFactory commandFactory = new CommandFactory(commandTextField.getText());
                //                commandFactory.checkCommand();

                //                TEST: als de log werkt het onderstaande commenten
                if (commandFactory.checkCommand()) {
                    System.out.println("execute");
                    guiFacade.addLogline("ging goed");

                } else {
                    System.out.println("FOUT");
                    guiFacade.addLogline("FOUT");
                }

                //            Deze wordt (nog) niet gebruikt
                //            } else {

            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("Command");
        label1.setDisplayedMnemonic('C');
        label1.setDisplayedMnemonicIndex(0);
        rootPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        commandTextField = new JTextField();
        rootPanel.add(commandTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        executeButton = new JButton();
        executeButton.setText("Execute");
        executeButton.setMnemonic('E');
        executeButton.setDisplayedMnemonicIndex(0);
        rootPanel.add(executeButton, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label1.setLabelFor(commandTextField);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}