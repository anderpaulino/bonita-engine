/**
 * Copyright (C) 2015 BonitaSoft S.A.
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
package org.bonitasoft.engine.identity;

/**
 * @author Matthieu Chaffotte
 */
public class SUserUpdateException extends SIdentityException {

    private static final long serialVersionUID = 618893893652667252L;

    public SUserUpdateException(final String message) {
        super(message);
    }

    public SUserUpdateException(final Throwable e) {
        super(e);
    }

    public SUserUpdateException(final String message, final Throwable e) {
        super(message, e);
    }

}
