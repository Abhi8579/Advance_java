interface Camera {
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

interface Phone {
    void makeCall(String number);
    void endCall();
}

class SmartPhone implements Camera, MusicPlayer, Phone {

    public void takePhoto() {
        System.out.println("Photo captured");
    }

    public void recordVideo() {
        System.out.println("Video recording started");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }

    public void stopMusic() {
        System.out.println("Music stopped");
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void endCall() {
        System.out.println("Call ended");
    }
}

public class MultiInterfaceComplex {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.takePhoto();
        sp.recordVideo();
        sp.playMusic();
        sp.makeCall("9876543210");
        sp.endCall();
        sp.stopMusic();
    }
}
