interface SmartD{
    public void turnOn();
    public void turnOff();
    public String checkStatus(); 
}

public class SmartLight implements SmartD{
    private boolean isOn;
    public void turnOn()
    {
        isOn = true;
        System.out.println("Light is glowing whilte.");
    }
    public void turnOff()
    {
        isOn = false;
        System.out.println("Ligt is turned off.");
    }
    public String checkStatus()
    {
        if(isOn == true)
            return "Light status : ON";
        else 
            return "Light status : OFF";
    }
}

class SmartSpeaker implements SmartD{
    private boolean isOn = false;
    public void turnOn()
    {
        isOn = true;
        System.out.println("Speaker booting up... playing welcome chime.");
    }
    public void turnOff()
    {
        isOn = false;
        System.out.println("Speaker shutting off.");
    }
    public String checkStatus()
    {
        if(isOn == true)
            return "Playing Music";
        else
            return "Offline";
    }
}

class SmartDevice {
    public static void main(String[] args) {
        SmartD l = new SmartLight();
        l.turnOn();
        String l1 = l.checkStatus();
        System.out.println(l1);

        SmartD s = new SmartSpeaker();
        s.turnOn();
        String s1 = s.checkStatus();
        System.out.println(s1);
    }
}
/*
OUTPUT:
Light is glowing white.
Status: Light Status: ON
Speaker booting up... playing welcome chime.
Status: Speaker: Playing music
*/