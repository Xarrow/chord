package exception;

/**
 * @Author zhang
 * @Time 2016/11/26.
 */
public class InterestExcetion extends RuntimeException {
    /**
     * 错误码
     */
    private Integer errorCode;
    /**
     * 返回错误消息
     */
    private String retMsg;


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public InterestExcetion(Integer errorCode, String retMsg) {
        this.errorCode = errorCode;
        this.retMsg = retMsg;
    }

    public InterestExcetion(String message, Integer errorCode, String retMsg) {
        super(message);
        this.errorCode = errorCode;
        this.retMsg = retMsg;
    }

    public InterestExcetion(String message, Throwable cause, Integer errorCode, String retMsg) {
        super(message, cause);
        this.errorCode = errorCode;
        this.retMsg = retMsg;
    }

    public InterestExcetion(Throwable cause, Integer errorCode, String retMsg) {
        super(cause);
        this.errorCode = errorCode;
        this.retMsg = retMsg;
    }

}
