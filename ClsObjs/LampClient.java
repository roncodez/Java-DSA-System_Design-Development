package ClsObjs;

public class LampClient {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        // An object is an entity that has a state and a behavior
        led.turnOn();
    }
}
