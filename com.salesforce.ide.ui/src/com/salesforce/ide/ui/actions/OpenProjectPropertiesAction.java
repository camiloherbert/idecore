/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.internal.dialogs.PropertyDialog;

import com.salesforce.ide.core.internal.utils.Constants;

/**
 *
 * Re-direct popMenu request to project property page with default selection on Force.com property page.
 *
 * @author fchang
 */
public class OpenProjectPropertiesAction extends BaseAction {

    public OpenProjectPropertiesAction() {
        super();
    }

    @Override
    public void execute(IAction action) {
        PropertyDialog dialog =
                PropertyDialog.createDialogOn(workbenchWindow.getShell(), Constants.PROJECT_PROPERTIES_PAGE_ID,
                    project);

        if (dialog != null) {
            dialog.open();
        }

    }
}
