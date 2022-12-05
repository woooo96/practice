package SelfStudyJava.Chap08.exam01;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volumne;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");

    }

    @Override
    public void setVolumne(int volumne) {
        if(volumne > MAX_VOLUMN) {
            this.volumne = MAX_VOLUMN;
        } else if (volumne < MIN_VOLUMN) {
            this.volumne = MIN_VOLUMN;
        } else {
            this.volumne = volumne;
        }
        System.out.println("현재 TV 볼륨: " + this.volumne);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다.");

    }
}
