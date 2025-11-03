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
# Doxia Markup Languages References

The following table gives an overview of the markup languages currently
supported by Doxia. If a Parser is available for a given format, it
means that you can write your documentation in this language and Doxia
can generate output from it. If a Sink is available, it means you can
generate output in this format.

The source directory is the directory under which Maven expects source
documents in this format (e.g. `src/site/apt/` for Apt), the
extension is the default file extension, and the parser id is gives the
unique identifier that is used by plexus to lookup the corresponding
component.

Please consult the [Modules Guide](../modules/index.html)
for links to reference documentation of external formats.

**Note:** Due to the Sink API abstractions, some language features of the underlying markup languages may not be fully supported by all parsers and sinks. Each format's reference page includes a "Limitations" section that documents any known restrictions.

## Supported Formats

| Format | Short description | Parser | Sink | Source Directory | Extension | Parser Id |
|--------|-------------------|--------|------|------------------|-----------|-----------|
| [Apt](./apt-format.html) | Almost Plain Text | ✓ | ✓ | `apt` | `apt` | `apt` |
| [FML](./fml-format.html) | FAQ Markup Language | ✓ | ✗ | `fml` | `fml` | `fml` |
| [Xdoc](./xdoc-format.html) | XML Documentation Format | ✓ | ✓ | `xdoc` | `xml` | `xdoc` |
| XHTML | Extensible Hypertext Markup Language | ✓ | ✓ | `xhtml` | `xhtml` | `xhtml` |
| [Markdown](./markdown-format.html) | Markdown Markup Language | ✓ | ✓ | `markdown` | `md` | `markdown` |
| XHTML5 | XHTML5 (Extensible HyperText Markup Language 5) | ✓ | ✓ | `xhtml5` | `xhtml` | `xhtml5` |
