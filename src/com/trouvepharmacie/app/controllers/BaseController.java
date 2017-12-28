/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trouvepharmacie.app.controllers;

import com.codename1.ui.Form;
import userclasses.StateMachine;
import com.codename1.ui.util.Resources;

/**
 *
 * @author valjery
 */
abstract public class BaseController {
    private StateMachine machine;
    private Form form;
    
    protected BaseController(Form form,StateMachine machine){
        this.machine = machine;
        this.form = form;
    }
    
    protected StateMachine getMachine(){
        return this.machine;
    }
    
    protected Form getForm(){
        return this.form;
    }
    
    protected void setMachine(StateMachine machine){
        this.machine = machine;
    }
    
    protected Resources getResources(){
        return this.machine.getResources();
    }
    
    abstract protected void init();
}
