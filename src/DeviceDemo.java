abstract class Device {
    abstract void turnOn();
    abstract void turnOff();
}

class Smartphone extends Device {
    void turnOn() {
        System.out.println("Smartphone is on");
    }

    void turnOff() {
        System.out.println("Smartphone is off");
    }
}

class Television extends Device {
    void turnOn() {
        System.out.println("Television is on");
    }

    void turnOff() {
        System.out.println("Television is off");
    }
}

public class DeviceDemo {
    public static void main(String[] args) {
        Device phone = new Smartphone();
        phone.turnOn();
        phone.turnOff();

        Device tv = new Television();
        tv.turnOn();
        tv.turnOff();
    }
}
