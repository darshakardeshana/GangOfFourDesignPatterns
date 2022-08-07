package StructuralPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvanceRemoteControl(new SonyTv());
        remoteControl.turnOn();
    }
}
