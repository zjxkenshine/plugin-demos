package com.kenshine;

import com.intellij.openapi.components.ApplicationComponent;

public class NewYearApplicationComponent implements ApplicationComponent{
    @Override
    public void initComponent() {
        NewYearDialog tauntDialog = new NewYearDialog();
        tauntDialog.show();
    }
}
