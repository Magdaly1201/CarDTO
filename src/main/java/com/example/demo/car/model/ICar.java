package com.example.demo.car.model;

import java.util.Date;

/**
 * 
 * @author mxs690
 *
 */

public interface ICar {

    /**
     * @return the id
     */
    int getId();

    /**
     * 
     * @return the model
     */
    String getModel();

    /**
     * 
     * @return the branch of car
     */
    String getBranch();

    /**
     * 
     * @return the color of car
     */
    String getColor();

    /**
     * 
     * @return the matricula of car
     */
    String getMatricula();

    /**
     * 
     * @return the date creation of the registre
     */
    String getDateCreation();

    /**
     * 
     * @return the user creation of the registre
     */
    String getUserCreation();

    /**
     * 
     * @return the user delete of the registre
     */
    String getUserDelete();

    /**
     * 
     * @return the date delete
     */
    Date getDateDelete();

}
