package june2023.day22.db;

import java.sql.*;

public class MemberService {
    public void dbSelect() {
        String url = "jdbc:mariadb://localhost:3306/testdb1";
        String dbUserId = "test_user1";
        String dbPassword = "test";

        // 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        // email -> email or kakao
        String memberTypeValue = "email";

        try {
            // 커넥션 객체 생성
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            // 쿼리 생성
            String sql = " SELECT member_type, user_id, password, name " +
                    " FROM member " +
                    " WHERE member_type = ? ; ";


            // 스테이트먼트 생성
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberTypeValue);

            // sql 실행
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String memberType = rs.getString("member_type");
                String userId = rs.getString("user_id");
                String password = rs.getString("password");
                String name = rs.getString("name");

                System.out.println(memberType + ", " + userId + ", " + password + ", " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // 커넥션 해제
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void registerMember(Member member) {
        String url = "jdbc:mariadb://localhost:3306/testdb1";
        String dbUserId = "test_user1";
        String dbPassword = "test";

        // 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            // 커넥션 객체 생성
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            // 쿼리 생성
            String sql = " INSERT INTO member (member_type, user_id, password, name) " +
                    "VALUES (?, ?, ?, ?); ";


            // 스테이트먼트 생성
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, member.getMemberType());
            preparedStatement.setString(2, member.getUserId());
            preparedStatement.setString(3, member.getPassword());
            preparedStatement.setString(4, member.getName());

            // sql 실행
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("저장 성공");
            } else {
                System.out.println("저장 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // 커넥션 해제
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void dbUpdate() {
        String url = "jdbc:mariadb://localhost:3306/testdb1";
        String dbUserId = "test_user1";
        String dbPassword = "test";

        // 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        // email -> email or kakao
        String memberTypeValue = "email";
        String userIdValue = "puppy@loopy.com";
        String passwordValue = "1155";

        try {
            // 커넥션 객체 생성
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            // 쿼리 생성
            String sql = " UPDATE member SET " +
                        "password = ? " +
                        "WHERE member_type = ? AND user_id = ? ";


            // 스테이트먼트 생성
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, passwordValue);
            preparedStatement.setString(2, memberTypeValue);
            preparedStatement.setString(3, userIdValue);

            // sql 실행
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // 커넥션 해제
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void dbDelete() {
        String url = "jdbc:mariadb://localhost:3306/testdb1";
        String dbUserId = "test_user1";
        String dbPassword = "test";

        // 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        // email -> email or kakao
        String memberTypeValue = "email";
        String userIdValue = "puppy@loopy.com";

        try {
            // 커넥션 객체 생성
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);
            // 쿼리 생성
            String sql = " DELETE FROM member " +
                    "WHERE  member_type = ? AND user_id = ? ; ";


            // 스테이트먼트 생성
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberTypeValue);
            preparedStatement.setString(2, userIdValue);

            // sql 실행
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // 커넥션 해제
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
