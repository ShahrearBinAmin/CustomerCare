/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.helper;

import customercare.database.ICrudImpl;
import customercare.model.User;

/**
 *
 * @author Shahrear
 */
public class Controller {
    private static Controller controller;
    private final ICrudImpl iCrudImpl;
    private Controller()
    {
        this.iCrudImpl=new ICrudImpl();
        this.iCrudImpl.openConnection();
        
    }
    public static Controller getController()
    {
        if(controller==null){
            controller=new Controller();
        }
        return controller;
    }

    public boolean signup(User user) {
        return this.iCrudImpl.insert(user);
    }

    public User login(String username, String password) {
        return this.iCrudImpl.getUser(username, password);
    }
    
}
