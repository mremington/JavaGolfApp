/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author michael.remington
 */
public interface CRUD {

    public void create() throws FileNotFoundException, IOException;
    
    public void read();

    public void update() throws FileNotFoundException, IOException;
    
    public void delete() throws FileNotFoundException;    
}
