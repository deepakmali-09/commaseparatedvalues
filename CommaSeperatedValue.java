public class CommaSeperatedValue {

    public static void commaSeperatedNumber(String number) {

        String result = "";
        int count = 0;
        int numSize = (int)number.length();

        System.out.println("Numbers length: " +numSize);

        if(numSize <= 3) {
            System.out.println("Number with less than 3 digits: " + "$"+number);
        }

        if(numSize > 3) {
            for (int i = number.length() - 1; i >= 0; i--) {
                result = number.charAt(i) + result;
                count++;

                if (count % 3 == 0 && i != 0) {
                    result = "," + result;
                }
            }
            System.out.println("Number with more than 3 digits: " + "$"+result);
        }
    }

    public static void inrCommmaSeparated(String number) {

        String result = "";
        int count = 0;
        int numSize = (int)number.length();

        System.out.println("INR Number length: "+ numSize);

        if(numSize <= 3) {
            System.out.println("Number with less than 3 digits: "+number);
        }

        if(numSize > 3) {
            for(int i=number.length() - 1; i >= 0; i--) {
                result = number.charAt(i) + result;
                count++;

                if(count == 3) {
                    result = "," + result;
                }

                if(count > 3 && count % 2 != 0 && i != 0) {
                    result = "," + result;
                }
            }
            System.out.println("Number with more than 3 digits: "+result);
        }
    }
    
    public static void main(String[] args) {
        commaSeperatedNumber("110698");
        inrCommmaSeparated("123456789");
    }
}