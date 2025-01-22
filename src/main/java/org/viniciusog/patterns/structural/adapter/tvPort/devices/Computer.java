package org.viniciusog.patterns.structural.adapter.tvPort.devices;

import org.viniciusog.patterns.structural.adapter.tvPort.interfaces.HDMI;

public class Computer {

    private HDMI port;

    public void connectPort(HDMI screen) {
        System.out.println("Connecting to HDMI port...");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if (port == null) {
            System.out.println("Connect a HDMI cable first");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
