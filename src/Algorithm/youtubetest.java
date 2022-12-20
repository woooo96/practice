package Algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class youtubetest {
    public static void main(String[] args) {

        String vId = vIdcreate("https://www.youtube.com/watch?v=6vnMmB1qp2Y&list=RDMM&start_radio=1&rv=_nXwrx4Qyz8");
        //https://www.youtube.com/watch?v=_nXwrx4Qyz8
        String embedId="https://www.youtube.com/embed/"+vId;

        System.out.println(vId);
        System.out.println(embedId);


    }

    private static String vIdcreate(String youtubeUrl) {
        String vId = null;
        Pattern pattern = Pattern.compile("^.*(?:(?:youtu\\.be\\/|v\\/|vi\\/|u\\/\\w\\/|embed\\/)|(?:(?:watch)?\\?v(?:i)?=|\\&v(?:i)?=))([^#\\&\\?]*).*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(youtubeUrl);
        if(matcher.matches()) {
            vId = matcher.group(1);
        }
        return vId;
    }


}
