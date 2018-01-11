package edarmoneit.githubtutorial;

/**
 * Created by Ed on 1/10/2018.
 */

public class User {
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    
    public User(String firstName, String lastName, String email) {
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
    }
    
    public String getFirstName() {
        return mFirstName;
    }
    
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }
    
    public String getLastName() {
        return mLastName;
    }
    
    public void setLastName(String lastName) {
        mLastName = lastName;
    }
    
    public String getEmail() {
        return mEmail;
    }
    
    public void setEmail(String email) {
        mEmail = email;
    }
}
