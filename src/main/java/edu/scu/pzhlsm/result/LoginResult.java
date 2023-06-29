package edu.scu.pzhlsm.result;

public class LoginResult {
    private int status;     // HTTP状态码

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LoginResult(int status) {
        this.status = status;
    }
}
