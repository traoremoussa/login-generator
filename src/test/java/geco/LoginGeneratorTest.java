package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService loginService;

    LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

        loginGenerator=new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        String nom="Durand";
        String prenom="Paul";
       // String message=loginGenerator.generateLoginForNomAndPrenom(nom,prenom);

        Assert.assertTrue(
                loginGenerator.generateLoginForNomAndPrenom(nom,prenom).compareTo("PDUR")==0);
        loginService.addLogin("PDUR");

        nom="Ralling";
        prenom="John";
        Assert.assertTrue(loginGenerator.generateLoginForNomAndPrenom(nom,prenom),
                loginGenerator.generateLoginForNomAndPrenom(nom,prenom).equals("JRAL2"));
        nom="Durand";
         prenom="Paul";

        Assert.assertTrue(
                loginGenerator.generateLoginForNomAndPrenom(nom,prenom).compareTo("PDUR2")==0);

        nom="Du";
        prenom="Paul";
        Assert.assertTrue(
                loginGenerator.generateLoginForNomAndPrenom(nom,prenom).compareTo("PDU")==0);
        loginService.addLogin("PDU ");
    }


}