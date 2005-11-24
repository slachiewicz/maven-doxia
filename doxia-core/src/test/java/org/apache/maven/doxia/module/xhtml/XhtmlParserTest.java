package org.apache.maven.doxia.module.xhtml;

/*
 * Copyright 2004-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.doxia.WellformednessCheckingSink;
import org.apache.maven.doxia.parser.AbstractParserTestCase;
import org.apache.maven.doxia.parser.Parser;

import java.io.FileReader;
import java.io.Reader;

/**
 * @author <a href="mailto:lars@trieloff.net">Lars Trieloff</a>
 * @version $Id: SinkDescriptorReaderTest.java 131 2005-10-25 05:16:26Z trygvis $
 */
public class XhtmlParserTest
    extends AbstractParserTestCase
{
    protected Parser getParser()
    {
        return new XhtmlParser();
    }

    protected String getDocument()
    {
        return "src/test/site/xhtml/fun.html";
    }

    public void testParser()
        throws Exception
    {
        //use the new wellformedness checking sink.
        WellformednessCheckingSink sink = new WellformednessCheckingSink();

        Reader reader = new FileReader( getTestFile( getBasedir(), getDocument() ) );

        getParser().parse( reader, sink );

        assertTrue( "Input not wellformed, offending element: " + sink.getOffender(), sink.isWellformed() );
    }
}
