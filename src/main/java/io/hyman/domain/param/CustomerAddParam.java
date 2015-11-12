package io.hyman.domain.param;

/**
 * Created by 10411303 on 2015/11/12.
 * 這邊要注意:接收的param沒有constructor，反而要有setter才能正常執行
 */
public class CustomerAddParam {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerAddParam{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
