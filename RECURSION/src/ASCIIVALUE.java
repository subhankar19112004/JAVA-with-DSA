public class ASCIIVALUE {
    public static void main(String[] args) {
        subseqofascii("","abc");
    }
    static void subseqofascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqofascii(p+ch,up.substring(1));
        subseqofascii(p,up.substring(1));
        subseqofascii(p + (ch+0),up.substring(1));
    }
}
