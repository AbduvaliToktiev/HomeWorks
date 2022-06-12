package month3.lesson28;

public class Parents implements ParentsRulenable{
    @Override
    public String getReady() {
        return "Собирайся в школу!";
    }

    @Override
    public  String getDressed() {
        return "Одевай чистые вещи!";
    }
}
