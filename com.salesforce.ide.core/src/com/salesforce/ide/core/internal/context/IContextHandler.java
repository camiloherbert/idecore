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
package com.salesforce.ide.core.internal.context;

import com.salesforce.ide.core.project.ForceProjectException;

public interface IContextHandler {

    public abstract void initApplicationContext() throws ForceProjectException;

    public abstract void initApplicationContext(String[] contextLocations) throws ForceProjectException;

    public abstract void loadApplicationContext(String[] contextLocations, boolean classpath) throws ForceProjectException;

    public abstract Object getBean(Class<?> clazz) throws ForceProjectException;

    public abstract Object getBean(String name) throws ForceProjectException;

    public abstract void dispose();

}
