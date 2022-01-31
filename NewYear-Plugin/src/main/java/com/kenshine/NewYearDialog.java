package com.kenshine;

import com.intellij.openapi.ui.DialogWrapper;

import javax.annotation.Nullable;
import javax.swing.*;

public class NewYearDialog extends DialogWrapper{
    JLabel jlabel;
    private int i = 0;

    protected NewYearDialog() {
        super(true);
        setTitle("新年快乐");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel jPanel = new JPanel();
        jlabel = new JLabel(ContentUtil.getContent(i));
        jPanel.add(jlabel);
        return jPanel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("好的");
        jButton.addActionListener(e -> {
            jlabel.setText(ContentUtil.getContent(++i));
        });
        jPanel.add(jButton);
        return jPanel;
    }
}
