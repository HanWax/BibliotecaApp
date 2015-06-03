import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User hannah;

    @Before
    public void setUp() throws Exception {
        hannah = new User("Hannah", "hannah@example.com", "07777777777");
    }

    @Test
    public void isConstructedWithNameEmailPhone() {
        assertEquals(hannah.getName(), "Hannah");
        assertEquals(hannah.getEmailAddress(), "hannah@example.com");
        assertEquals(hannah.getPhoneNumber(), "07777777777");
    }

    @Test
    public void hasLibraryNumber() {
        hannah.setLibraryNumber("333-3333");
        assertEquals(hannah.getLibraryNumber(), "333-3333");
    }

    @Test
    public void hasPassword() {
        hannah.setPassword("super secret password");
        assertEquals(hannah.getPassword(), "super secret password");
    }

    @Test
    public void isLoggedOutOnInitialization() {
        assertEquals(hannah.getLoggedIn(), false);
    }

    @Test
    public void canLoginUsingLibraryNumberPassword() {
        hannah.login("333-3333", "super secret password");
        assertEquals(hannah.getLoggedIn(), true);
    }

    @Test
    public void canLogout() {
        canLoginUsingLibraryNumberPassword();
        hannah.logout();
        assertEquals(hannah.getLoggedIn(), false);

    }

    @Test
    public void canAccessUserInfoIfLoggedIn() {
        assertEquals(hannah.accessUserInformation(), "Please login before continuing");
        hannah.login("333-3333", "super secret password");
        assertEquals(hannah.accessUserInformation(), "Name: Hannah\nEmail: hannah@example.com\nPhone: 07777777777");
    }


}