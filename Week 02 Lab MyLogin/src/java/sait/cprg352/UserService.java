/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

/**
 *
 * @author 636334
 */
public class UserService {
    
    private String username;
    private String password;
    
    public UserService(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    public boolean login(String username, String password)
    {
        if(this.username==username && this.password==password)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
