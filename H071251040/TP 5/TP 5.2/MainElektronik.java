public class MainElektronik {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp("Philips", 10);
        SmartCCTV cctv = new SmartCCTV("Xiaomi", 15);
        SmartSpeaker speaker = new SmartSpeaker("Google Home", 25);

        // Demo SmartSpeaker
        System.out.println("--- Demo Smart Speaker ---");
        speaker.infoPower();        
        speaker.hubungkanWiFi();    
        speaker.prosesPerintah("Putar Musik"); 
        
        System.out.println("\n--- Demo Fitur Spesifik ---");
        lampu.prosesPerintah("NYALA");
        cctv.hubungkanWiFi();
    }
}