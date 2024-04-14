package com.patterns.behavioral.chain_of_responsibility;

/**
 * 检查用户登陆信息
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(email, password);
    }
}
