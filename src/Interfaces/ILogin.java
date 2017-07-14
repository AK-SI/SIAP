/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entity.Login;
import java.util.List;

/**
 *
 * @author su
 */
public interface ILogin {
    boolean insertLogin(Login login);
    boolean updateLogin(Login login);
    boolean deleteLogin(String username, String password);
    List selectLogin(String username, String password);
}
