public class Utils {


   private static String[] textArray0_10 = {"صفر", "یک", "دو", "سه", "چهار", "پنج", "شش", "هفت", "هشت", "نه"};
   private static String[] textArray10_19 = {"ده", "یازده", "دوازده", "سیزده", "چهارده", "پانزده", "شانزده", "هفده", "هجده", "نوزده"};
   private static String[] textArray20_90 = {"بیست", "سی", "چهل", "پنجاه", "شصت", "هفتاد", "هشتاد", "نود"};
   private static String[] textArray100_900 = {"یکصد", "دویست", "سیصد", "چهارصد", "پانصد", "ششصد", "هفتصد", "هشتصد", "نهصد"};

    private static String strHezar = "هزار";
    private static String strMeliun = "میلیون";
    private static String strMiliard = "میلیارد";

    public static String getFigures(String x) {


        String text7 = "";
        String text10;

        switch (x.length()) {
            case 1:
                text7 = textArray0_10[Integer.parseInt(x)];
                break;
            case 2:
                if ((Integer.parseInt(x.substring(x.length() - 1)) > 0) & (Integer.parseInt(x.substring(0, 1)) > 1)) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 1)));
                    text7 = " و" + getFigures(text10);
                }
                if (Integer.parseInt(x.substring(0, 1)) > 1) {
                    text7 = textArray20_90[Integer.parseInt(x.substring(0, 1)) - 2] + text7;
                }
                if (Integer.parseInt(x.substring(0, 1)) == 1) {
                    text7 = textArray10_19[Integer.parseInt(x.substring(x.length() - 1))];
                }
                break;

            case 3:
                if (Integer.parseInt(x.substring(x.length() - 2)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 2)));
                    text7 = " و" + getFigures(text10);
                }
                text7 = textArray100_900[Integer.parseInt(x.substring(0, 1)) - 1] + text7;
                break;

            case 4:
                if (Integer.parseInt(x.substring(x.length() - 3)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 3)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 1)));
                text7 = getFigures(text10).trim()+" " + strHezar + text7;
                break;

            case 5:
                if (Integer.parseInt(x.substring(x.length() - 3)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 3)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 2)));
                text7 = getFigures(text10).trim()+" " + strHezar + text7;
                break;
            case 6:
                if (Integer.parseInt(x.substring(x.length() - 5)) != 0) {
                    if (Integer.parseInt(x.substring(x.length() - 3)) > 0) {
                        text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 3)));
                        text7 = " و" + getFigures(text10);
                    }
                    text10 = String.valueOf(Integer.parseInt(x.substring(0, 3)));
                    text7 = getFigures(text10).trim()+" " + strHezar + text7;
                    break;
                }
                text7 = textArray100_900[Integer.parseInt(x.substring(0, 1))] + strHezar;
                break;
            case 7:
                if (Integer.parseInt(x.substring(x.length() - 6)) != 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 6)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 1)));
                text7 = getFigures(text10).trim()+" " + strMeliun + text7;
                break;

            case 8:
                if (Integer.parseInt(x.substring(x.length() - 6)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 6)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 2)));
                text7 = getFigures(text10).trim()+" " + strMeliun + text7;
                break;

            case 9:
                if (Integer.parseInt(x.substring(x.length() - 6)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 6)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 3)));
                text7 = getFigures(text10).trim()+" " + strMeliun + text7;
                break;

            case 10:
                if (Integer.parseInt(x.substring(x.length() - 9)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 9)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 1)));
                text7 = getFigures(text10).trim()+" " + strMiliard + text7;
                break;

            case 11:
                if (Integer.parseInt(x.substring(x.length() - 9)) > 0) {
                    text10 = String.valueOf(Integer.parseInt(x.substring(x.length() - 9)));
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 2)));
                text7 = getFigures(text10).trim()+" " + strMiliard + text7;
                break;
            case 12:
                if (Integer.parseInt(x.substring(x.length() - 9)) > 0) {
                    text10 = x.substring(x.length() - 9);
                    text7 = " و" + getFigures(text10);
                }
                text10 = String.valueOf(Integer.parseInt(x.substring(0, 3)));
                text7 = getFigures(text10).trim()+" " + strMiliard + text7;
                break;
        }
        return " " + text7 + " ";
    }

    public static void main(String[] args) {
        System.out.println(getFigures("486516549899").trim());
    }
}
