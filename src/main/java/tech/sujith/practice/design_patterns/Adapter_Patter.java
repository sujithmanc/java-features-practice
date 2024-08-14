package tech.sujith.practice.design_patterns;

interface MP4Player {
	public void playVideo();
}

interface MP3Player {
	public void playMusic();
}

class MP4PlayerAdaptor implements MP4Player {
	private MP3Player mp3Player;

	public MP4PlayerAdaptor(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	@Override
	public void playVideo() {
		mp3Player.playMusic();
	}
}

class SonyPlayer implements MP3Player{
	@Override
	public void playMusic() {
		System.out.println("Playing some music");
	}
}


public class Adapter_Patter {
	public static void main(String[] args) {
		MP4Player mp4 = new MP4PlayerAdaptor(new SonyPlayer());
		mp4.playVideo();
	}
}
