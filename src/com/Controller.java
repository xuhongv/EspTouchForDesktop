package com;

import javafx.application.Platform;

import java.util.ResourceBundle;

public abstract class Controller {
    private ResourceBundle res;

    public Controller() {
        res = ResourceBundle.getBundle("language.language");
    }

    public ResourceBundle getRes() {
        return res;
    }

    public void runOnUiThread(Runnable runnable) {
        Platform.runLater(runnable);
    }

    public abstract void release();
}
