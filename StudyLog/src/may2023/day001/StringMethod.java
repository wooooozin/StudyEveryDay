package may2023.day001;

public class StringMethod {
    public static void main(String[] args) {

        // int length()
        String str = "Hello World!";
        System.out.println(str.length()); // 12

        // char charAt(int index)
        char ch = str.charAt(3);
        System.out.println(ch); // l

        // boolean equals(Object obj)
        String str1 = "HI";
        String str2 = "HI";
        String str3 = new String("HI");
        System.out.println(str1.equals(str2)); // true - 값 비교
        System.out.println(str1 == str2); // true - 같은 상수 풀의 객체 주소를 공유
        System.out.println(str1 == str3); // 새로 만든 객체라 같지 않음
        // 문자열의 값을 비교할 땐 equals메서드!

        /*
        int indexOf(int ch)
        int indexOf(int ch, int fromIndex)
        int indexOf(String str)
        int indexOf(String str, int fromIndex)

        문자열의 첫번째 인덱스를 기준으로 마지막 인덱스까지 검색하여 특정 문자가 위치한 인덱스를 반환한다.
        fromIndex는 검색 범위를 지정한다.
        fromIndex가 2일 경우 2 ~ 마지막 문자 인덱스 조회
        찾지 못하면 -1을 반환한다.
         */

        System.out.println(str.indexOf("l")); // 2
        System.out.println(str.indexOf('l')); // 2
        System.out.println(str.indexOf("l", 2)); // 2부터 끝까지 처음 나오는 문자 인덱스 반환
        System.out.println(str.indexOf("l", 10)); // -1

        /*
        int lastIndexOf(int ch)
        int lastIndexOf(int ch, int fromIndex)
        int lastIndexOf(String str)
        int lastIndexOf(String str, int fromIndex)
        문자열의 마지막 인덱스를 기준으로 첫번째 인덱스까지 검색하여 특정 문자가 위치한 인덱스를 반환다.
        fromIndex는 검색 범위를 지정한다.
        fromIndex가 6일 경우 0 ~ 6 인덱스 조회
        찾지 못하면 -1을 반환한다.
         */

        System.out.println(str.lastIndexOf('!')); // 11
        System.out.println(str.lastIndexOf("w")); // -1
        System.out.println(str.lastIndexOf("W", 7)); // 0 ~ 7 result 6

        /*
        String substring(int beginIndex)
        String substring(int beginIndex, int endIndex)
        beginIndex부터 endIndex -1 사이에 위치한 String을 반환한다.
         */
        System.out.println(str.substring(0, 5)); // Hello , 0 ~ 4
        System.out.println(str.substring(4)); // o World!, 4 ~ 끝까지

        /*
        String replace(String target, String replacement)
        String replaceAll(String regex, String replacement)
        String replaceFirst(String regex, String replacement)

        특정 문자열을 검색해 특정 문자열로 변경한다.
        replace 메소드와 replaceAll 메소드의 차이는 정규표현식의 사용 가능 유무이다.
         */

        str = "abcdefg";
        System.out.println(str.replace("a", "apple")); // applebcdefbg
        System.out.println(str.replaceAll("[a, b]", "X")); // XXcdefXg
        System.out.println(str.replaceFirst("[b,a]", "X")); // Xbcdefbg

        /*
        String concat(String str)
        두개의 문자열을 합쳐서 반환한다.
         */

        System.out.println(str.concat(str1)); // abcdefgHI

        /*
        String[] split(String regex)
        String[] split(String regex, int limit)
        char[] toCharArray() - 문자형으로 반환

        문자열을 특정 문자를 기준으로 나눈다.
        정규식을 사용하여 나눌 수 있다.
         */

        for (String s : str.split("")) {
            System.out.println(s); // [a, b, c, d, e, f, g]
        }

        for (String s : str.split("", 3)) {
            System.out.println(s); // [a, b, cdefg]
        }

        /*
        boolean startsWith(String prefix)
        boolean startsWith(String prefix, int toffset)
        특정 문자로 시작하는지 검색한다.
        toffset 파라메터를 이용해 시작위치를 조정할 수 있다.

        boolean endsWith(String suffix)
        특정 문자열로 끝나는지 검색
         */

        String str4 = "i am a boy !";
        System.out.println(str4.startsWith("boy")); //false
        System.out.println(str4.startsWith("boy", 7)); //true

        System.out.println(str4.endsWith(" !")); // true

        /*
        boolean matches(String regex)
        정규식이 만족되는 문자열인지 확인한다.
         */
        str = "12345";
        System.out.println(str.matches("(^[0-9]*$)")); //true , 문자열 모두 숫자인지 확인한다.

        /*
        String trim()
        시작과 끝에 존재하는 공백을 제거한다.
        중간에 있는 공백은 제거하지 않는다.
         */

        str = "   s  p  a  c  e    ";
        System.out.println(str.trim()); // s  p  a  c  e

        /*
        static String format(String format, Object... args)
         */
        System.out.println(String.format("%s%d%05.2f", str, 10, 10.11)); //    s  p  a  c  e    , 10, 10.11
    }
}
