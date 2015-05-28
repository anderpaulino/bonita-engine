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
package org.bonitasoft.engine.bpm.actor.impl;

import java.util.Objects;

import org.bonitasoft.engine.bpm.actor.ActorDefinition;

/**
 * @author Matthieu Chaffotte
 * @author Celine Souchet
 */
public class ActorDefinitionImpl implements ActorDefinition {

    private static final long serialVersionUID = 1915238328442058288L;

    private final String name;

    private String description;

    private boolean initiator;

    /**
     * Create a actor definition with his name that is not initiator
     * 
     * @param name
     */
    public ActorDefinitionImpl(final String name) {
        this.name = name;
        initiator = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public boolean isInitiator() {
        return initiator;
    }

    public void setInitiator(final boolean initiator) {
        this.initiator = initiator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorDefinitionImpl that = (ActorDefinitionImpl) o;
        return Objects.equals(initiator, that.initiator) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initiator);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ActorDefinitionImpl [name=");
        builder.append(name);
        builder.append(", description=");
        builder.append(description);
        builder.append(", initiator=");
        builder.append(initiator);
        builder.append("]");
        return builder.toString();
    }

}
