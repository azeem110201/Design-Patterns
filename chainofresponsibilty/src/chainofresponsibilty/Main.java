package chainofresponsibilty;

import chainofresponsibilty.handlers.Handler;
import chainofresponsibilty.handlers.RoleCheckHandler;
import chainofresponsibilty.handlers.UserExistsHandler;
import chainofresponsibilty.handlers.ValidPasswordHandler;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("******************************");

        System.out.println(service.logIn("username", "password"));

        System.out.println("******************************");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("******************************");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("******************************");
    }
}
