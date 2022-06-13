package chap17;

public class UnsupportedMusicFileException extends RuntimeException {
//	エラーメッセを受け取るコンストラクタ
	public UnsupportedMusicFileException (String msg) {
		super(msg);
	}
}

//newするときに()内でメッセを入れられる
//それを親クラスのExceptionで受け取る