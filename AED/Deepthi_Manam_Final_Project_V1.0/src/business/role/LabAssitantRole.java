/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.HealthCareSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.labAssistantRole.LabAssitantJPanel;

/**
 *
 * @author Deepthi
 */
public class LabAssitantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, HealthCareSystem system, Enterprise enterprise, Organization organization, UserAccount account) {
        return new LabAssitantJPanel(system, userProcessContainer, enterprise, organization, account);
    
    }
    
}