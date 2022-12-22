package org.apache.maven.doxia.module.confluence.parser;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;

import org.apache.maven.doxia.sink.Sink;
import org.codehaus.plexus.util.StringUtils;

/**
 * DefinitionListBlock
 */
class DefinitionListBlock
    implements Block
{
    private String title;

    private List<Block> text;

    DefinitionListBlock( String title, String text )
    {
        this.title = title;
        this.text = new ChildBlocksBuilder( text ).getBlocks();
    }

    /** {@inheritDoc} */
    public void traverse( Sink sink )
    {
        sink.definitionList();

        if ( !StringUtils.isEmpty( title ) )
        {
            sink.definedTerm();
            sink.text( title );
            sink.definedTerm_();
        }

        sink.definition();

        for ( Block block : text )
        {
            block.traverse( sink );
        }

        sink.definition_();
        sink.definitionList_();
    }
}