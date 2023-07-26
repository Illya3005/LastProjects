class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music");
    }
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music");
    }
}

class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classical music");
    }
}

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicBands = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
