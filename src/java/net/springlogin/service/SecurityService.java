package net.springlogin.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
