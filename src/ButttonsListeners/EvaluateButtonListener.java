package ButttonsListeners;

import javax.script.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

import static javax.swing.JOptionPane.showMessageDialog;

public class EvaluateButtonListener extends ButtonListener {

    public EvaluateButtonListener(JTextField outField) {
        super(outField);
    }

    /**
     * 2. Доделать кнопку "Submit", она же равно "=". По нажатию кнопки должно выполняться вычисление выражения.
     * 4. ** Попробовать применить ScriptEngine для вычисления математических выражений
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        try {
            Object expressionResult = scriptEngine.eval(super.getOutField().getText());
            super.getOutField().setText(expressionResult.toString());
        } catch (Exception exception) {
            showMessageDialog(null, "Error. Expression is not valid.");
        }
    }
}
