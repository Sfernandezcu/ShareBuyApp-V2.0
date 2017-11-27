package com.arizmendi43.sfernandez.sharebuyapp;

import android.app.Application;

/**
 * Created by Ariz43 on 25/11/2017.
 */

public class ShareBuyMainApp extends Application {

    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        ShareBuyMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

