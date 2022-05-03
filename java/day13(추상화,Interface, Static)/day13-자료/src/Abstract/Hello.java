package Abstract;

public abstract class Hello {
	private String msg;

	public Hello(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	// 추상 메서드
	public abstract void sayHello();
	
}













