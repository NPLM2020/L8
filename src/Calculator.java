import ButttonsListeners.ClearButtonListener;
import ButttonsListeners.EvaluateButtonListener;
import ButttonsListeners.ExpressionSymbolButtonListener;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
    public Calculator() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4, 4));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        // Listeners
        ExpressionSymbolButtonListener esbListener = new ExpressionSymbolButtonListener(outField);
        EvaluateButtonListener ebListener = new EvaluateButtonListener(outField);
        ClearButtonListener cbListener = new ClearButtonListener(outField);

        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            bottom.add(digitBtn);
            digitBtn.addActionListener(esbListener);
        }

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(esbListener);
        bottom.add(plusBtn);
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(esbListener);
        bottom.add(minusBtn);

        //5. ** На основании задания №5, расширить добавить к списку операций умножение и деление
        JButton multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(esbListener);
        bottom.add(multiplyBtn);
        JButton divideBtn = new JButton("/");
        divideBtn.addActionListener(esbListener);
        bottom.add(divideBtn);

        JButton cancelBtn = new JButton("C");
        bottom.add(cancelBtn);
        cancelBtn.addActionListener(cbListener);
        JButton submitBtn = new JButton("=");
        bottom.add(submitBtn);
        submitBtn.addActionListener(ebListener);


        mainFrame.setVisible(true);
    }
}
