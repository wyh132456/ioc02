package org.allboy.ioc;

public class LinuxShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "ls";
    }
}
