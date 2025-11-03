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
# The FML (FAQ Markup Language) format

## Overview

An 'fml' is an XML document conforming to a small and simple set of tags.
The format was first used in the [Maven 1](http://maven.apache.org/maven-1.x/)
version of the [FAQ plugin](http://maven.apache.org/maven-1.x/plugins/faq/).

## The FML format

The following is a sample FML document:

```xml
<?xml version="1.0" encoding="UTF-8"?>

<faqs title="Frequently Asked Questions" toplink="false">

  <part id="general">
    <title>General</title>

    <faq id="whats-foo">
      <question>
        What is Foo?
      </question>
      <answer>
        <p>some markup goes here</p>

        <source>some source code</source>

        <p>some markup goes here</p>
      </answer>
    </faq>

    <faq id="whats-bar">
      <question>
        What is Bar?
      </question>
      <answer>
        <p>some markup goes here</p>
      </answer>
    </faq>
  </part>

  <part id="install">

    <title>Installation</title>

    <faq id="how-install">
      <question>
        How do I install Foo?
      </question>
      <answer>
        <p>some markup goes here</p>
      </answer>
    </faq>

  </part>

</faqs>
```

## Limitations

FML is a specialized format designed for FAQ documents and has the following limitations:

### No Sink Implementation

FML does not have a sink implementation, meaning you cannot generate FML output from other
formats using Doxia. FML is only supported as an input format (parser).

### Specialized Structure

FML is designed specifically for FAQ (Frequently Asked Questions) documents with a fixed
structure of parts containing questions and answers. It is not suitable for general-purpose
documentation.
