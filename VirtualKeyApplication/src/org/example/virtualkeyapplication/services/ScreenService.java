package org.example.virtualkeyapplication.services;

import org.example.virtualkeyapplication.screens.FileOptionsScreen;
import org.example.virtualkeyapplication.screens.Screen;
import org.example.virtualkeyapplication.screens.WelcomeScreen;
import org.example.virtualkeyapplication.entities.Directory;


@SuppressWarnings("unused")
public class ScreenService {
	
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
