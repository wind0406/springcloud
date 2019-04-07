package springcloud.test.product.web.model;

public class MallProduct {
    private String mpId;

    private String mpName;

    private Integer mpNum;

    public String getMpId() {
        return mpId;
    }

    public void setMpId(String mpId) {
        this.mpId = mpId == null ? null : mpId.trim();
    }

    public String getMpName() {
        return mpName;
    }

    public void setMpName(String mpName) {
        this.mpName = mpName == null ? null : mpName.trim();
    }

    public Integer getMpNum() {
        return mpNum;
    }

    public void setMpNum(Integer mpNum) {
        this.mpNum = mpNum;
    }
}