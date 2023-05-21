package day019;

public class ProgrammersTest2 {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isCapital = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(c);
                isCapital = true;
            } else {
                if (isCapital) {
                    sb.append(Character.toUpperCase(c));
                    isCapital = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }
}
