package org.apache.maven.doxia.plugin.manager;/*
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

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id$
 */
public class PluginNotFoundException
    extends Exception
{
    public PluginNotFoundException( String message )
    {
        super( message );
    }

    public PluginNotFoundException( Throwable cause )
    {
        super( cause );
    }

    public PluginNotFoundException( String message, Throwable cause )
    {
        super( message, cause );
    }
}
