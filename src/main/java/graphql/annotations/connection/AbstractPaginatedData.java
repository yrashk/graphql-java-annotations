/**
 * Copyright 2016 Yurii Rashkovskii
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
package graphql.annotations.connection;

import java.util.Iterator;

public abstract class AbstractPaginatedData<T> implements PaginatedData<T> {

    protected Iterable<T> data;
    private boolean hasPreviousPage;
    private boolean hasNextPage;

    public AbstractPaginatedData(boolean hasPreviousPage, boolean hasNextPage, Iterable<T> data) {
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.data = data;
    }

    @Override
    public boolean hasNextPage() {
        return hasNextPage;
    }

    @Override
    public boolean hasPreviousPage() {
        return hasPreviousPage;
    }

    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }
}