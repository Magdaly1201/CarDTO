package com.example.demo.car.model;

import java.util.Date;

/**
 * 
 * @author mxs690
 *
 */
public class Car implements ICar, ICarData {

    private int id;
    private String model;
    private String branch;
    private String color;
    private String matricula;
    private String dateCreation;
    private String userCreation;
    private String userDelete;
    private Date dateDelete;

    /**
     * @return the id
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the model
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the branch
     */
    @Override
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the color
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the matricula
     */
    @Override
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the dateCreation
     */
    @Override
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the userCreation
     */
    @Override
    public String getUserCreation() {
        return userCreation;
    }

    /**
     * @param userCreation the userCreation to set
     */
    public void setUserCreation(String userCreation) {
        this.userCreation = userCreation;
    }

    /**
     * @return the userDelete
     */
    @Override
    public String getUserDelete() {
        return userDelete;
    }

    /**
     * @param userDelete the userDelete to set
     */
    public void setUserDelete(String userDelete) {
        this.userDelete = userDelete;
    }

    /**
     * @return the dateDelete
     */
    @Override
    public Date getDateDelete() {
        return dateDelete;
    }

    /**
     * @param dateDelete the dateDelete to set
     */
    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

}
