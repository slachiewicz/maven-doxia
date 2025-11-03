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
# The Markdown format

## Overview

Markdown is a popular lightweight markup language, easy to read and easy to write.
It is supported by a large panel of websites, text editors/IDEs and converter tools.
Markdown format is supported both as source (parser) and destination (sink).

The Markdown parser uses the [flexmark-java](https://github.com/vsch/flexmark-java)
library to convert Markdown to HTML, which is then parsed into Doxia Sink API method calls.

## Limitations

Due to the nature of Markdown and the Sink API abstractions, the following limitations apply
to the Markdown sink (output generation):

### Anchors

Markdown does not natively support anchors. The Markdown sink emits HTML anchor tags
(`<a id="..."></a>`) to support this Sink API feature.

### Figures

While the Markdown sink supports basic figure output via standard Markdown image syntax
(`![alt text](image.png)`), it does not support figure captions in native Markdown.
Full figure support with captions requires HTML markup.

### Table Justification

The Markdown sink supports basic table column justification (left, center, right) using
extended Markdown table syntax. However, the `grid` flag for table formatting
is not supported in Markdown output.

### Table Captions

Table captions are not supported in standard Markdown. The Markdown sink ignores table
captions as there is no suitable location to emit them, even using HTML markup.

### Page Breaks

Page breaks are not supported in Markdown output. The Markdown sink ignores page break
events as they have no meaningful representation in Markdown.

### Links in Code Blocks

Links inside code blocks are not supported and will be ignored by the Markdown sink.

## References

* [Markdown project website](http://daringfireball.net/projects/markdown)
* [GitHub Flavored Markdown Spec](https://github.github.com/gfm/)
* [flexmark-java](https://github.com/vsch/flexmark-java), the library used by this Doxia module
