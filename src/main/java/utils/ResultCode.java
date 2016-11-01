package utils;

/**
 * 响应码
 */
public enum ResultCode {

	SUCCESS(140001,"success"),
	FAILURE(140002,"error"),
	PARAMETER_ERROR(14003,"参数错误"),
	CONNECT_API_FAILED(14004,"连接API失败");

	private int code;
	private String msg;
	private ResultCode(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public int getCode(){
		return code;
	}
	public String getMsg(){
		return msg;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}



}
