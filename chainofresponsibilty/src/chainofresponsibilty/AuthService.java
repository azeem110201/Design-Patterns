package chainofresponsibilty;

import chainofresponsibilty.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            // Do stuff for authorized users
            System.out.println("Authorization was successful!");
            return true;
        }
        return false;
    }
}
