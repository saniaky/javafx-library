package com.company.view;

import com.company.MainApp;

public abstract class ViewController {

    protected MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public abstract void ready();

}
