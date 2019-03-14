package common.bean;

public class Result {
    private  int code;
    private  Object data;

    public Result(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static Result success(Object obj){
        return new Result(200,obj);
    }

    public static Result success(){
        return new Result(200,"success");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
