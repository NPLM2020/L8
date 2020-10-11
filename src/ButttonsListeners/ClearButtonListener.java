package ButttonsListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearButtonListener extends ButtonListener {

    public ClearButtonListener(JTextField outField) {
        super(outField);
    }

    /**
     * 1. Доделать кнопку "С" - очищение строки
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        super.getOutField().setText("");
    }
}
