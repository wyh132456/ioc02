package org.allboy.ioc;

public class WindowsShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "dir";
    }
}
