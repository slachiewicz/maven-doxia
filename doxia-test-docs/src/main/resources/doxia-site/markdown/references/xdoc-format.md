<!---
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->
# The Xdoc format

## Overview

An 'xdoc' is an XML document conforming to a small and simple set of tags.
Xdoc was the primary documentation format in [Maven 1](http://maven.apache.org/maven-1.x/),
Maven 2 largely replaced this by [Apt](apt-format.html), but xdoc is still supported.

Historically, the xdoc format can be traced back to the
[Anakia](http://projects-old.apache.org/projects/anakia.html) format, as once used by the
[Apache Jakarta](http://jakarta.apache.org/) project.

The Maven 1 Xdoc plugin introduced a few additions to the Anakia format, they are highlighted in the
[plugin](http://maven.apache.org/maven-1.x/plugins/xdoc/reference/xdocs.html) documentation.

## The XDoc format

The following is a sample XDoc document:

```xml
<document>

  <properties>
    <title>Page Title</title>
    <author email="user@company.com">John Doe</author>
  </properties>

  <!-- Optional HEAD element, which is copied as is into the XHTML <head> element -->
  <head>
    <meta ... />
  </head>

  <body>

    <!-- The body of the document contains a number of sections -->
    <section name="section 1">

      <!-- Within sections, any XHTML can be used -->
      <p>Hi!</p>

      <!-- in addition to XHTML, any number of subsections can be within a section -->
      <subsection name="subsection 1">
        <p>Subsection!</p>
      </subsection>

    </section>

  </body>

</document>
```

## XDoc Reference

The full XDoc reference can be found in the [Xdoc Plugin documentation](http://maven.apache.org/maven-1.x/plugins/xdoc/reference/xdocs.html).

### Nested source elements

Note that you cannot embed `<source>` elements inside other `<source>` elements.

Wrong:

```xml
<source><![CDATA[<p>
  The following command executes the program:
</p>
<source>java -jar CoolApp.jar</source>]]></source>
```

Correct:

```xml
<p>
  The following command executes the program:
</p>
<source>java -jar CoolApp.jar</source>
```

However, you may put `<source>` elements inside list items or table rows.

## Limitations

The Xdoc format has comprehensive support in Doxia with both parser and sink implementations.
It provides good coverage of the Sink API features and is well-suited for general-purpose
documentation. No significant limitations are currently known.
