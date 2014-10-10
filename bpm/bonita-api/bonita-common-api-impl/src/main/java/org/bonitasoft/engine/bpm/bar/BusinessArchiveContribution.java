/**
 * Copyright (C) 2011 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package org.bonitasoft.engine.bpm.bar;

import java.io.File;
import java.io.IOException;

/**
 * @author Baptiste Mesta
 */
public interface BusinessArchiveContribution {

    /**
     * Checks if something can be read from the file system
     * 
     * @param businessArchive
     * @param barFolder
     * @return
     *         true if something was read from the folder
     * @throws IOException
     * @throws InvalidBusinessArchiveFormatException
     */
    boolean readFromBarFolder(BusinessArchive businessArchive, File barFolder) throws IOException, InvalidBusinessArchiveFormatException;

    /**
     * Writes the content of the BusinessArchive to the file system
     * 
     * @param businessArchive
     * @param barFolder
     * @throws IOException
     */
    void saveToBarFolder(BusinessArchive businessArchive, File barFolder) throws IOException;

    boolean isMandatory();

    String getName();

}
