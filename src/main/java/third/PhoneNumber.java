package third;

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

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(1,2,3);
        System.out.println(phoneNumber);
    }
}
