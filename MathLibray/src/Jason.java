import java.net.URL;

public class Jason {
    public static void main (String[] args) throws Exception {
        URL url = new URL("https://jsonplaceholder.typicode.com/todos");

        String q = url.getQuery();
        User user = new User();
        for (String token : q.split("&")) {
            if (token.startsWith("userid")) {
                int index = token.indexOf('=');
                if (index >= 0 && index <token.length()-1) {
                    user.setUserId(Long.parseLong(token.substring(index+1)));
                }
            }
            if (token.startsWith("username")) {
                int index = token.indexOf('=');
                if (index >= 0 && index <token.length()-1) {
                    user.setUserName(java.net.URLDecoder.decode(token.substring(index+1)));
                }
            }
            if (token.startsWith("usersex")) {
                int index = token.indexOf('=');
                if (index >= 0 && index <token.length()-1) {
                    user.setUserSex(Integer.parseInt(token.substring(index+1)));
                }
            }
        }
        System.out.println(user.toString());
    }

}

class User {
    private long userId;
    private String userName;
    private int userSex;

    //constructos
    User(long userId, String userName, int userSex){
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
    }

    User() {
        this.userId = -1;
        this.userName = "undefined";
        this.userSex = -1;
    }

    @Override
    public String toString() {
        return String.format("id: %d; name: %s, sex: %d", userId, userName, userSex);
    }

    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userSex
     */
    public int getUserSex() {
        return userSex;
    }

    /**
     * @param userSex the userSex to set
     */
    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }
}

