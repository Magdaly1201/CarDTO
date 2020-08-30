package com.example.demo.car.dto.request;

import com.example.demo.car.model.ICarData;

/**
 * 
 * @author mxs690
 *
 */
public class CarsRequestDTO implements ICarData {

    private String model;
    private String branch;
    private String color;
    private String matricula;

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



}
