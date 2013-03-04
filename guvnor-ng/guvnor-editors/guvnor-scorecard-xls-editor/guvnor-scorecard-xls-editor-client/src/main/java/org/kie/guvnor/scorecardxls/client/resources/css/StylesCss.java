/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.guvnor.scorecardxls.client.resources.css;

import com.google.gwt.resources.client.CssResource;

/**
 * General CSS for Guvnor. Use of standalone CSS files should be migrated to
 * here
 */
public interface StylesCss
        extends
        CssResource {
    
    @ClassName("default-text-Area")
    String defaultTextArea();

    @ClassName("category-explorer-Tree")
    String categoryExplorerTree();


}