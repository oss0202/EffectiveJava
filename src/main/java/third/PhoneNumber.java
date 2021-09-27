package third;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

public class PhoneNumber {
    int areaCode;
    int prefix;
    int lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",areaCode, prefix, lineNum);
    }

    @Override
    protected PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();// 일어날 수 없는 일이다.
        }
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(1,2,3);
        System.out.println(phoneNumber);
    }
}
