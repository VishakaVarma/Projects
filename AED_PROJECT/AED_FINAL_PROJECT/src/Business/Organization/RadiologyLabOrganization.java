/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.RadioLabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishaka
 */
public class RadiologyLabOrganization extends Organization{
   public RadiologyLabOrganization() {
        super(Organization.Type.RadioLab.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RadioLabAssistantRole());
        return roles;
    } 
}