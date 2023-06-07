package june2023.day08.oop1;

class SRemote implements RemoteController {
    public void playMusic() {
        System.out.println("음악을 재생합니다.");
    }
    @Override
    public void turnOn() {
        System.out.println("삼성 티비 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성 티비 전원을 끕니다.");
    }
}

class LRemote implements RemoteController, PlayMovie {
    @Override
    public void playMovie() {
        System.out.println("영화를 재생합니다.");
    }
    @Override
    public void turnOn() {
        System.out.println("LG 티비 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("LG 티비 전원을 끕니다.");
    }
}
public class RemoteTest {
    public static void main(String[] args) {
        SRemote sRemote = new SRemote();
        LRemote lRemote = new LRemote();

        sRemote.turnOn();
        sRemote.playMusic();
        sRemote.turnOff();

        lRemote.turnOn();
        lRemote.playMovie();
        lRemote.turnOff();
    }
}
