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
package org.bonitasoft.engine.queriablelogger.model.impl;

import java.util.Objects;

import org.bonitasoft.engine.persistence.model.BlobValue;
import org.bonitasoft.engine.queriablelogger.model.SQueriableLogParameter;

/**
 * @author Elias Ricken de Medeiros
 * @author Matthieu Chaffotte
 * @author Celine Souchet
 */
public class SQueriableLogParameterImpl implements SQueriableLogParameter {

    private static final long serialVersionUID = -4180580754292639609L;

    private long tenantId;

    private long id;

    private long queriableLogId;

    private String name;

    private String stringValue;

    private BlobValue blobValue;

    private String valueType;

    public SQueriableLogParameterImpl() {
        id = -1;
    }

    public long getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(final long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getDiscriminator() {
        return SQueriableLogParameter.class.getName();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStringValue() {
        return stringValue;
    }

    @Override
    public BlobValue getBlobValue() {
        return blobValue;
    }

    @Override
    public String getValueType() {
        return valueType;
    }

    @Override
    public void setId(final long logId) {
        id = logId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setStringValue(final String stringValue) {
        this.stringValue = stringValue;
    }

    public void setBlobValue(final BlobValue blobValue) {
        this.blobValue = blobValue;
    }

    public void setValueType(final String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String toString() {
        final StringBuilder stb = new StringBuilder("Parameter: \n");
        stb.append("queriableLogId: ").append(queriableLogId).append('\n');
        stb.append("name: ").append(name).append('\n');
        stb.append("valueType: ").append(valueType).append('\n');
        stb.append("String value: ").append(stringValue == null ? "null" : stringValue).append('\n');
        stb.append("Blob value").append(blobValue == null ? "null" : blobValue.toString()).append('\n');
        return stb.toString();
    }

    @Override
    public long getQueriableLogId() {
        return queriableLogId;
    }

    public void setQueriableLogId(final long queriableLogId) {
        this.queriableLogId = queriableLogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SQueriableLogParameterImpl that = (SQueriableLogParameterImpl) o;
        return Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(queriableLogId, that.queriableLogId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(stringValue, that.stringValue) &&
                Objects.equals(blobValue, that.blobValue) &&
                Objects.equals(valueType, that.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, id, queriableLogId, name, stringValue, blobValue, valueType);
    }
}
