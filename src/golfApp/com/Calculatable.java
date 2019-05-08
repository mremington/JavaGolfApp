/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.IOException;

/**
 *
 * @author michael.remington
 */
public interface Calculatable {

    public int calculateScores();

    public School compareScores();

    public void writeToFile(String path) throws IOException;
}
