package may2023.day003.exception;
// 사용자 정의 예외
// 아이디가 null 값이거나 지정범위를 벗어나는 경우의 예외처리 만들기

class IDFormatException extends Exception {
    public IDFormatException(String message) {
        super(message); // 생성자의 매개변수로 예외 상황 메시지 받기
    }
}

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException { // IDFormatException예외를 setUserID가 호출될 때 처리하도록 미룸
        if (userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다."); // 강제로 예외 발생
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상, 20자 이하로 쓰세요"); // 강제로 예외 발생
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userId = null;
        try {
            test.setUserID(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userId = "1234567";
        try {
            test.setUserID(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
