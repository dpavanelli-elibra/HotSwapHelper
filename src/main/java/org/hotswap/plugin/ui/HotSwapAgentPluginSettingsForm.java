/*
 *  Copyright (c) 2017 Dmitry Zhuravlev, Sergei Stepanov
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.hotswap.plugin.ui;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.HyperlinkLabel;
import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.fields.ExpandableTextField;
import com.intellij.ui.table.TableView;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.intellij.util.execution.ParametersListUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author Dmitry Zhuravlev
 * Date:  09.03.2017
 */
public class HotSwapAgentPluginSettingsForm {
    public JButton updateButton;
    public TextFieldWithBrowseButton agentInstallPathField;
    public JBCheckBox applyAgentToAllConfigurationsBox;
    public JPanel rootPanel;
    public JPanel updateButtonPanel;
    public JBLabel dcevmVersionLabel;
    public HyperlinkLabel dcevmDownloadSuggestionLabel;
    public HyperlinkLabel dcevmHowToInstallLabel;

    private TableView configurationsTableView;
    public JTextField disabledPluginsField;
    public JCheckBox useExternalAgentFileCheckBox;
    public JPanel disablePluginPanel;

    private void createUIComponents() {
        disabledPluginsField = new ExpandableTextField(ParametersListUtil.COLON_LINE_PARSER, ParametersListUtil.COLON_LINE_JOINER);
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
        createUIComponents();
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(3, 4, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(panel1, new GridConstraints(1, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(0, 0));
        panel1.add(panel2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JBLabel jBLabel1 = new JBLabel();
        jBLabel1.setHorizontalAlignment(11);
        jBLabel1.setHorizontalTextPosition(11);
        jBLabel1.setText("HotSwapAgent Jar file");
        panel2.add(jBLabel1, BorderLayout.WEST);
        agentInstallPathField = new TextFieldWithBrowseButton();
        panel2.add(agentInstallPathField, BorderLayout.CENTER);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel1.add(panel3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        dcevmDownloadSuggestionLabel = new HyperlinkLabel();
        dcevmDownloadSuggestionLabel.setBackground(new Color(-12828863));
        dcevmDownloadSuggestionLabel.setVisible(false);
        panel3.add(dcevmDownloadSuggestionLabel, BorderLayout.WEST);
        disablePluginPanel = new JPanel();
        disablePluginPanel.setLayout(new BorderLayout(0, 0));
        panel1.add(disablePluginPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JBLabel jBLabel2 = new JBLabel();
        jBLabel2.setText("Disabled plugins:");
        disablePluginPanel.add(jBLabel2, BorderLayout.WEST);
        disabledPluginsField.setToolTipText("Semicolon separated list of disabled plugins");
        disablePluginPanel.add(disabledPluginsField, BorderLayout.CENTER);
        updateButton = new JButton();
        updateButton.setText("download");
        updateButton.setVisible(true);
        panel1.add(updateButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        rootPanel.add(panel4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        useExternalAgentFileCheckBox = new JCheckBox();
        useExternalAgentFileCheckBox.setText("useExternalAgentFileForCurrentProject");
        panel4.add(useExternalAgentFileCheckBox, BorderLayout.WEST);
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
