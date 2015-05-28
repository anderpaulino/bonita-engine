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
package org.bonitasoft.engine;

import java.util.ArrayList;
import java.util.List;

import org.bonitasoft.engine.queriablelogger.model.SQueriableLogSeverity;
import org.bonitasoft.engine.services.QueriableLoggerStrategy;

/**
 * @author Elias Ricken de Medeiros
 */
public class MockQueriableLoggerStrategy implements QueriableLoggerStrategy {

    private final List<String> loggable;

    public MockQueriableLoggerStrategy() {
        this.loggable = new ArrayList<>();
        this.loggable.add("execute_connector_:" + SQueriableLogSeverity.BUSINESS);
        this.loggable.add("variable_update_:" + SQueriableLogSeverity.BUSINESS);
        this.loggable.add("execute_connector_:" + SQueriableLogSeverity.INTERNAL);
        this.loggable.add("variable_update_:" + SQueriableLogSeverity.INTERNAL);
    }

    @Override
    public boolean isLoggable(final String actionType, final SQueriableLogSeverity severity) {
        return !this.loggable.contains(actionType + ":" + severity.toString());
    }

}