public class EnumHomework {

    public enum NumberType {
        HOME("Domowy"), MOBI("Komórkowy"), WORK("Służbowy");
        String type;

        NumberType(String typeNum) {
            type = typeNum;
        }
    }

    public static void main(String[] args) {

        NumberType numberType = NumberType.MOBI;
        System.out.println(typeNum(numberType));
    }

    public static String typeNum(NumberType numberType) {
        return (numberType.type);
    }

}