/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.editor;


import melnorme.lang.ide.ui.EditorSettings_Actual;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.navigator.ICommonMenuConstants;

public class AbstractLangEditorMenuContributor {
	
	protected final AbstractLangEditor editor;

	public AbstractLangEditorMenuContributor(AbstractLangEditor editor) {
		this.editor = editor;
	}
	
	public void editorContextMenuAboutToShow(IMenuManager menu) {
		IWorkbenchWindow window = editor.getSite().getWorkbenchWindow();
		menu.prependToGroup(ICommonMenuConstants.GROUP_OPEN, new CommandContributionItem(
			new CommandContributionItemParameter(window, 
				null, 
				EditorSettings_Actual.COMMAND_OpenDef_ID,
				CommandContributionItem.STYLE_PUSH
			)
		));
	}
	
}