package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
private LoginService loginService;
    @Before
    public void setUp() throws Exception {
        loginService=
                new LoginService(new String[]{"TRAORE","THOMAS","MADI"});
    }

    @Test
    public void tesLoginExists() {
        //when
        String login="TRAORE";
        Assert.assertTrue(loginService.loginExists(login));
        String login2="TRAOREMoussa";
        Assert.assertFalse(loginService.loginExists(login2));
    }

    @Test
    public void testAddLogin() {
        //when
        //then
        String login="FALAYE";
        loginService.addLogin(login);
        Assert.assertTrue(loginService.loginExists(login));


    }

    @Test
    public void testFindAllLoginsStartingWith() {

        //when
        String pref="T",l1="TRAORE",l2="THOMAS";
        List<String>retour=loginService.findAllLoginsStartingWith(pref);

        Assert.assertTrue(retour.contains(l1));
        Assert.assertTrue(retour.contains(l2));

    }

    @Test
    public void testFindAllLogins() {
        List<String>myList=new ArrayList<String>(Arrays.asList("TRAORE","THOMAS","MADI"));
        Assert.assertTrue(myList.containsAll(loginService.findAllLogins()));

    }
}