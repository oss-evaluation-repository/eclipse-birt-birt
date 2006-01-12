/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.report.engine.api.script.instance;

import org.eclipse.birt.report.engine.api.script.ScriptException;

public interface IReportElementInstance
{

	/** Get the style of this element
	 * 
	 */
	IScriptStyle getStyle( );

	/**
	 * Get the horizontal position
	 */
	String getHorizontalPosition( );

	/**
	 * Set the horizontal position
	 */
	void setHorizontalPosition( String position );

	/**
	 * Get the vertical position
	 */
	String getVerticalPosition( );

	/**
	 * Set the vertical position
	 */
	void setVerticalPosition( String position );

	/**
	 * Get the width of the element
	 * 
	 */
	String getWidth( );

	/**
	 * Set the width of the element
	 * 
	 */
	void setWidth( String width );

	/**
	 * Get the height of the element
	 * 
	 */
	String getHeight( );

	/**
	 * Set the height of the element
	 * 
	 */
	void setHeight( String height );

	/** Get the value of a named expression
	 * 
	 */
	Object getNamedExpressionValue( String name );

	/** Get the value of a user property
	 * 
	 */
	Object getUserPropertyValue( String name );

	/** Set the value of a user property
	 * 
	 */
	void setUserPropertyValue( String name, Object value )
			throws ScriptException;

	/** Get the parent (container) of this element
	 * 
	 */
	IReportElementInstance getParent( );

}
