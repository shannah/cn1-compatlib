# CN1-Compatlib

This library allows you to develop against portions of the Codename One API from a regular JavaSE or JavaEE project.  The goal of this project is to improve source code reuse between all of your Java projects.

## License

GPL with Classpath Exception

## Installation

Just add the [cn1-compatlib.jar](https://github.com/shannah/cn1-compatlib/releases/tag/3.3) to your Java project's classpath.  Then you can use core codename one APIs directly in your project.

### Maven Installation

If you want to use this project with Maven:

~~~~
$ git clone https://github.com/shannah/cn1-compatlib
$ cd cn1-compatlib
$ ant jar
~~~~

This will install it in your local maven repo.  You can then include it in your maven projects with:

~~~~
<dependency>
    <groupId>com.codename1</groupId>
    <artifactId>cn1-compatlib</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
~~~~


## Status

Currently only the com.codename1.util package is included.  This importantly includes `StringUtil` and `MathUtil` which are probably the most common classes you need to use in Codename One.
