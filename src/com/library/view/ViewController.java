package com.library.view;

import com.library.MainApp;

public abstract class ViewController {

    protected MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public abstract void ready();

}
