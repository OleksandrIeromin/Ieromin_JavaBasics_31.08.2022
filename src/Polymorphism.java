import java.util.ArrayList;

public class Polymorphism {

    // Сделайте класс MusicStyles, который будет содержать метод playMusic()
    public static class MusicStyles {

        public String groupName;

        MusicStyles(String groupName) {
            this.groupName = groupName;

        }

        void playMusic() {
            System.out.println("﴾͡๏̯͡๏﴿");
        }
    }

    //Сделайте его наследников: PopMusic, RockMusic, и ClassicMusic.
    public static class PopMusic extends MusicStyles {
        PopMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        //Наследники должны по-своему реализовывать метод playMusic().
        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("(•_•)");
        }
    }

    public static class RockMusic extends MusicStyles {
        RockMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("(ノಠ益ಠ)ノ彡┻━┻");
        }
    }

    public static class ClassicMusic extends MusicStyles {
        ClassicMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("ヾ(⌐■_■)ノ♪");
        }
    }

    public static void main(String[] args) {
//В мейн-классе создайте музыкальные группы для каждого стиля
        PopMusic justinBieber = new PopMusic("Justin Bieber");
        RockMusic AcDc = new RockMusic("AC / DC");
        ClassicMusic Bach = new ClassicMusic("Johann Sebastian Bach");

//С помощью метода for each вызовите у всех наследников MusicStyles метод playMusic()   <--- это не понял как сделать
        justinBieber.playMusic();
        AcDc.playMusic();
        Bach.playMusic();

    }
}
