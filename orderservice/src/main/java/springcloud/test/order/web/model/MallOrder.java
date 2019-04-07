package springcloud.test.order.web.model;

public class MallOrder {
    private String moId;

    private String moOrderNum;

    private String userId;

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId == null ? null : moId.trim();
    }

    public String getMoOrderNum() {
        return moOrderNum;
    }

    public void setMoOrderNum(String moOrderNum) {
        this.moOrderNum = moOrderNum == null ? null : moOrderNum.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}