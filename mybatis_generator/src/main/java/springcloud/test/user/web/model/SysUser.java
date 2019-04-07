package springcloud.test.user.web.model;

public class SysUser {
    private String suId;

    private String suName;

    private String suPwd;

    public String getSuId() {
        return suId;
    }

    public void setSuId(String suId) {
        this.suId = suId == null ? null : suId.trim();
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName == null ? null : suName.trim();
    }

    public String getSuPwd() {
        return suPwd;
    }

    public void setSuPwd(String suPwd) {
        this.suPwd = suPwd == null ? null : suPwd.trim();
    }
}