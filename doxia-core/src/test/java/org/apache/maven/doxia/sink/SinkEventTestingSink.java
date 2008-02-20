package org.apache.maven.doxia.sink;

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

import org.apache.maven.doxia.sink.AbstractSink;

import java.util.LinkedList;
import java.util.List;

/**
 * This sink is used for testing purposes in order to check wether
 * the input of some parser is well-formed.
 *
 * @author ltheussl
 * @version $Id$
 * @since 1.0-beta-1
 */
public class SinkEventTestingSink
    extends AbstractSink
{
    /** The list of sink events. */
    private final List events = new LinkedList();

    /**
     * Return the collected list of SinkEventElements.
     *
     * @return the collected list of SinkEventElements.
     */
    public List getEventList()
    {
        return this.events;
    }

    /** Clears the list of sink events. */
    public void reset()
    {
        this.events.clear();
    }

      //
     // sink methods
    //

    /** {@inheritDoc} */
    public void head()
    {
        addEvent( "head" );
    }

    /** {@inheritDoc} */
    public void head_()
    {
        addEvent( "head_" );
    }

    /** {@inheritDoc} */
    public void body()
    {
        addEvent( "body" );
    }

    /** {@inheritDoc} */
    public void body_()
    {
        addEvent( "body_" );
    }

    /** {@inheritDoc} */
    public void section1()
    {
        addEvent( "section1" );
    }

    /** {@inheritDoc} */
    public void section1_()
    {
        addEvent( "section1_" );
    }

    /** {@inheritDoc} */
    public void section2()
    {
        addEvent( "section2" );
    }

    /** {@inheritDoc} */
    public void section2_()
    {
        addEvent( "section2_" );
    }

    /** {@inheritDoc} */
    public void section3()
    {
        addEvent( "section3" );
    }

    /** {@inheritDoc} */
    public void section3_()
    {
        addEvent( "section3_" );
    }

    /** {@inheritDoc} */
    public void section4()
    {
        addEvent( "section4" );
    }

    /** {@inheritDoc} */
    public void section4_()
    {
        addEvent( "section4_" );
    }

    /** {@inheritDoc} */
    public void section5()
    {
        addEvent( "section5" );
    }

    /** {@inheritDoc} */
    public void section5_()
    {
        addEvent( "section5_" );
    }

    /** {@inheritDoc} */
    public void list()
    {
        addEvent( "list" );
    }

    /** {@inheritDoc} */
    public void list_()
    {
        addEvent( "list_" );
    }

    /** {@inheritDoc} */
    public void listItem()
    {
        addEvent( "listItem" );
    }

    /** {@inheritDoc} */
    public void listItem_()
    {
        addEvent( "listItem_" );
    }

    /** {@inheritDoc} */
    public void numberedList( int numbering )
    {
        addEvent( "numberedList", new Object[] {new Integer( numbering )} );
    }

    /** {@inheritDoc} */
    public void numberedList_()
    {
        addEvent( "numberedList_" );
    }

    /** {@inheritDoc} */
    public void numberedListItem()
    {
        addEvent( "numberedListItem" );
    }

    /** {@inheritDoc} */
    public void numberedListItem_()
    {
        addEvent( "numberedListItem_" );
    }

    /** {@inheritDoc} */
    public void definitionList()
    {
        addEvent( "definitionList" );
    }

    /** {@inheritDoc} */
    public void definitionList_()
    {
        addEvent( "definitionList_" );
    }

    /** {@inheritDoc} */
    public void definitionListItem()
    {
        addEvent( "definitionListItem" );
    }

    /** {@inheritDoc} */
    public void definitionListItem_()
    {
        addEvent( "definitionListItem_" );
    }

    /** {@inheritDoc} */
    public void definition()
    {
        addEvent( "definition" );
    }

    /** {@inheritDoc} */
    public void definition_()
    {
        addEvent( "definition_" );
    }

    /** {@inheritDoc} */
    public void figure()
    {
        addEvent( "figure" );
    }

    /** {@inheritDoc} */
    public void figure_()
    {
        addEvent( "figure_" );
    }

    /** {@inheritDoc} */
    public void table()
    {
        addEvent( "table" );
    }

    /** {@inheritDoc} */
    public void table_()
    {
        addEvent( "table_" );
    }

    /** {@inheritDoc} */
    public void tableRows( int[] justification, boolean grid )
    {
        addEvent( "tableRows", new Object[] {justification, new Boolean( grid )} );
    }

    /** {@inheritDoc} */
    public void tableRows_()
    {
        addEvent( "tableRows_" );
    }

    /** {@inheritDoc} */
    public void tableRow()
    {
        addEvent( "tableRow" );
    }

    /** {@inheritDoc} */
    public void tableRow_()
    {
        addEvent( "tableRow_" );
    }

    /** {@inheritDoc} */
    public void title()
    {
        addEvent( "title" );
    }

    /** {@inheritDoc} */
    public void title_()
    {
        addEvent( "title_" );
    }

    /** {@inheritDoc} */
    public void author()
    {
        addEvent( "author" );
    }

    /** {@inheritDoc} */
    public void author_()
    {
        addEvent( "author_" );
    }

    /** {@inheritDoc} */
    public void date()
    {
        addEvent( "date" );
    }

    /** {@inheritDoc} */
    public void date_()
    {
        addEvent( "date_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle()
    {
        addEvent( "sectionTitle" );
    }

    /** {@inheritDoc} */
    public void sectionTitle_()
    {
        addEvent( "sectionTitle_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle1()
    {
        addEvent( "sectionTitle1" );
    }

    /** {@inheritDoc} */
    public void sectionTitle1_()
    {
        addEvent( "sectionTitle1_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle2()
    {
        addEvent( "sectionTitle2" );
    }

    /** {@inheritDoc} */
    public void sectionTitle2_()
    {
        addEvent( "sectionTitle2_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle3()
    {
        addEvent( "sectionTitle3" );
    }

    /** {@inheritDoc} */
    public void sectionTitle3_()
    {
        addEvent( "sectionTitle3_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle4()
    {
        addEvent( "sectionTitle4" );
    }

    /** {@inheritDoc} */
    public void sectionTitle4_()
    {
        addEvent( "sectionTitle4_" );
    }

    /** {@inheritDoc} */
    public void sectionTitle5()
    {
        addEvent( "sectionTitle5" );
    }

    /** {@inheritDoc} */
    public void sectionTitle5_()
    {
        addEvent( "sectionTitle5_" );
    }

    /** {@inheritDoc} */
    public void paragraph()
    {
        addEvent( "paragraph" );
    }

    /** {@inheritDoc} */
    public void paragraph_()
    {
        addEvent( "paragraph_" );
    }

    /** {@inheritDoc} */
    public void verbatim( boolean boxed )
    {
        addEvent( "verbatim", new Object[] {new Boolean( boxed )} );
    }

    /** {@inheritDoc} */
    public void verbatim_()
    {
        addEvent( "verbatim_" );
    }

    /** {@inheritDoc} */
    public void definedTerm()
    {
        addEvent( "definedTerm" );
    }

    /** {@inheritDoc} */
    public void definedTerm_()
    {
        addEvent( "definedTerm_" );
    }

    /** {@inheritDoc} */
    public void figureCaption()
    {
        addEvent( "figureCaption" );
    }

    /** {@inheritDoc} */
    public void figureCaption_()
    {
        addEvent( "figureCaption_" );
    }

    /** {@inheritDoc} */
    public void tableCell()
    {
        addEvent( "tableCell" );
    }

    /** {@inheritDoc} */
    public void tableCell( String width )
    {
        addEvent( "tableCell", new Object[] {width} );
    }

    /** {@inheritDoc} */
    public void tableCell_()
    {
        addEvent( "tableCell_" );
    }

    /** {@inheritDoc} */
    public void tableHeaderCell()
    {
        addEvent( "tableHeaderCell" );
    }

    /** {@inheritDoc} */
    public void tableHeaderCell( String width )
    {
        addEvent( "tableHeaderCell", new Object[] {width} );
    }

    /** {@inheritDoc} */
    public void tableHeaderCell_()
    {
        addEvent( "tableHeaderCell_" );
    }

    /** {@inheritDoc} */
    public void tableCaption()
    {
        addEvent( "tableCaption" );
    }

    /** {@inheritDoc} */
    public void tableCaption_()
    {
        addEvent( "tableCaption_" );
    }

    /** {@inheritDoc} */
    public void figureGraphics( String name )
    {
        addEvent( "figureGraphics", new Object[] {name} );
    }

    /** {@inheritDoc} */
    public void horizontalRule()
    {
        addEvent( "horizontalRule" );
    }

    /** {@inheritDoc} */
    public void pageBreak()
    {
        addEvent( "pageBreak" );
    }

    /** {@inheritDoc} */
    public void anchor( String name )
    {
        addEvent( "anchor", new Object[] {name} );
    }

    /** {@inheritDoc} */
    public void anchor_()
    {
        addEvent( "anchor_" );
    }

    /** {@inheritDoc} */
    public void link( String name )
    {
        addEvent( "link", new Object[] {name} );
    }

    /** {@inheritDoc} */
    public void link_()
    {
        addEvent( "link_" );
    }

    /** {@inheritDoc} */
    public void italic()
    {
        addEvent( "italic" );
    }

    /** {@inheritDoc} */
    public void italic_()
    {
        addEvent( "italic_" );
    }

    /** {@inheritDoc} */
    public void bold()
    {
        addEvent( "bold" );
    }

    /** {@inheritDoc} */
    public void bold_()
    {
        addEvent( "bold_" );
    }

    /** {@inheritDoc} */
    public void monospaced()
    {
        addEvent( "monospaced" );
    }

    /** {@inheritDoc} */
    public void monospaced_()
    {
        addEvent( "monospaced_" );
    }

    /** {@inheritDoc} */
    public void lineBreak()
    {
        addEvent( "lineBreak" );
    }

    /** {@inheritDoc} */
    public void nonBreakingSpace()
    {
        addEvent( "nonBreakingSpace" );
    }

    /** {@inheritDoc} */
    public void text( String text )
    {
        addEvent( "text", new Object[] {text} );
    }

    /** {@inheritDoc} */
    public void rawText( String text )
    {
        addEvent( "rawText", new Object[] {text} );
    }

    /** {@inheritDoc} */
    public void comment( String comment )
    {
        addEvent( "comment", new Object[] {comment} );
    }

    /** {@inheritDoc} */
    public void flush()
    {
        addEvent( "flush" );
    }

    /** {@inheritDoc} */
    public void close()
    {
        addEvent( "close" );
    }

      //
     // private
    //

    /**
     * Adds a no-arg event to the list of events.
     *
     * @param string the name of the event.
     */
    private void addEvent( String string )
    {
        addEvent( string, null );
    }

    /**
     * Adds an event to the list of events.
     *
     * @param string the name of the event.
     * @param arguments The array of arguments to the sink method.
     */
    private void addEvent( String string, Object[] arguments )
    {
        events.add( new SinkEventElement( string, arguments ) );
    }

}
