package june2023.day20.java;

import java.sql.*;

public class DBTest {
    public static void dbSelect() {
        // 1. ip
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스

        String url = "jdbc:mariadb://localhost:3306/kobis_db";
        String dbUserId = "root";
        String dbPassword = "";

        // driver load
        // 커넥션 객체 생성
        // 스테이트먼트 객체 생성
        // 쿼리 실행
        // 결과 수행
        // 객체 연결 해제

        try {
            Class.forName("org.mariadb.jdbc.Driver"); // driver load
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String cityValue = "울산시";

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);         // 커넥션 객체 생성
            String sql = " SELECT code, sido, gugun, screen_name, screen_count, seat_count, open_type, reg_type, biz_name, open_date, open_status " +
                    " FROM screen " +
                    " WHERE sido =  ? ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cityValue);
            resultSet = preparedStatement.executeQuery(); // 쿼리 실행

            while (resultSet.next()) {
                String sido = resultSet.getString("sido");
                String screen_name = resultSet.getString("screen_name");
                String screen_count = resultSet.getString("screen_count");

                System.out.println(sido +", " + screen_name + ", " + screen_count);
            }
            // 객체 연결 해제

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (!resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (!preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void dbInsert() {
        String url = "jdbc:mariadb://localhost:3306/kobis_db";
        String dbUserId = "root";
        String dbPassword = "";
        
        try {
            Class.forName("org.mariadb.jdbc.Driver"); // driver load
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String cityValue = "울산시";
        String actorName = "잔망루피1";
        String engActorName = "ZANMANG LOOPY1";
        String birthday = "2000-01-01";

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);         // 커넥션 객체 생성
            String sql = "INSERT INTO actor (code, name, eng_name, birth, country, domain, pilmo, reg_dt) " +
                    "VALUES (?, ?, ?, ?, '한국', '배우', '뽀로로의 대모험', NOW())";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "123123123");
            preparedStatement.setString(2, actorName);
            preparedStatement.setString(3, engActorName);
            preparedStatement.setString(4, birthday);

            int affectiveRows = preparedStatement.executeUpdate(); // 쿼리 실행

            if (affectiveRows > 0) {
                System.out.println("저장 성공 " + affectiveRows);
            } else {
                System.out.println("저장 실패");
            }
            // 객체 연결 해제

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbUpdate() {
        String url = "jdbc:mariadb://localhost:3306/kobis_db";
        String dbUserId = "root";
        String dbPassword = "";

        try {
            Class.forName("org.mariadb.jdbc.Driver"); // driver load
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String cityValue = "울산시";
        String actorName = "잔망루피1";
        String engActorName = "REAL LOOPY111";
        String birthday = "2000-01-01";

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);         // 커넥션 객체 생성
            String sql = "UPDATE actor " +
                    "SET eng_name = ? " +
                    "WHERE name = '잔망루피1' " +
                    "AND birth = '2000-01-01';";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, engActorName);
            int affectiveRows = preparedStatement.executeUpdate(); // 쿼리 실행

            if (affectiveRows > 0) {
                System.out.println("저장 성공 " + affectiveRows);
            } else {
                System.out.println("저장 실패");
            }
            // 객체 연결 해제

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbDelete() {
        String url = "jdbc:mariadb://localhost:3306/kobis_db";
        String dbUserId = "root";
        String dbPassword = "";

        try {
            Class.forName("org.mariadb.jdbc.Driver"); // driver load
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String cityValue = "울산시";
        String actorName = "잔망루피1";
        String engActorName = "REAL LOOPY111";
        String birthday = "2000-01-01";

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);         // 커넥션 객체 생성
            String sql = "DELETE FROM actor " +
                    "WHERE name = ? ;";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, actorName);
            int affectiveRows = preparedStatement.executeUpdate(); // 쿼리 실행

            if (affectiveRows > 0) {
                System.out.println("삭제 성공 " + affectiveRows);
            } else {
                System.out.println("저장 실패");
            }
            // 객체 연결 해제

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
