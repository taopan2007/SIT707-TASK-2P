package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        
        // for the second website JBHIFI
        
        SeleniumOperations.JBHIFI_registration_page("https://auth.jbhifi.com.au/c82f7cb0-dc26-457a-8291-d55a6f80f6ac/b2c_1a_v1_sign_up_sign_in/oauth2/v2.0/authorize?client_id=f47b1902-9a16-47db-9157-a3db123307f6&redirect_uri=https%3A%2F%2Fauth.jbhifi.com.au%2Fsignin%2FB2C_1A_v1_sign_up_sign_in&response_type=code&scope=openid%20https%3A%2F%2Fauth.jbhifi.com.au%2Ff8d0fcd2-fcdb-4119-8652-4ffabb4d9704%2Fuser_impersonation%20offline_access&code_challenge=Aqd6l4aTWpUm6i3wdkeIRXQG8hX7S1NyeSqJp-xeyo8&code_challenge_method=S256&response_mode=form_post&nonce=638464091067080922.MTEwMzI0NTktZGJkMS00MDVjLTlmOGYtMzQzMjZjZjg5MzdjZjZiOGY5NWQtM2ViNy00ZTg2LTg1MzEtMGM1YWQ4NmE3NDc2&return_url=%2Faccount%2Flogin%3FreturnUrl%3Dhttps%253A%252F%252Fwww.jbhifi.com.au%252F&state=CfDJ8FD1PdC1tC5Lmi8uLpK-1JmUzH0JfcHx365zymdOoLW6X8PPvj1ySJ-aV3JCKPm9PpHV_cTeoWaUeI6S6nUVqVtu8v9Ia37-k0YgzRocpzD5ipak0iQS8rnLN8-M1DI--6hqpjmU9T891zVgzV4pZS1PswP2DYghcr56ymi9pVEwhdOwdAb7E53oO0cg34A0rRzviZV4qmM38-1XoySB1EiMoVuUKQMqHEhfGA0WbSWnKmavfUCxUwnJxRQP0g32lW-_WbZKeyDe7higFHjzuwqMHKoMNccN-GHaWUeOBcHixUEEABsdWdMNCFQyRleCqAKZHbXj0rrJevdEc_7nMwJPDidT1J6ofk5aVaVuvNUuPHnt1r-Y6K1q51HgAJ5Kuzvjc6ZlN1y1N0kDfWhIpJUQwajoMxYJ9Ngyj5PFqQ7l2eV4aSpZlWJ1sjmyP79P9RdRChHOvM2PIeepKpWFNdVTpNrqnZEVjdtbvpBLqJTk6Y-Fdd40L03RYi6UtnhccqK-_16pCz6rmDNkLrUuc5CtcwcBlgwQcJfY6DsCPSkX&x-client-SKU=ID_NET6_0&x-client-ver=6.25.1.0");

    }
}
