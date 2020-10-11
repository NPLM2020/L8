package ButttonsListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ExpressionSymbolButtonListener extends ButtonListener {
    private StringBuilder sb = new StringBuilder();

    public ExpressionSymbolButtonListener(JTextField outField) {
        super(outField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String expression = sb.append(super.getOutField().getText())
                .append(jButton.getText())
                .toString();
        super.getOutField().setText(expression);
        sb.setLength(0);
    }
}
