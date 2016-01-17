JAVAC   =   javac

CLASSES =   S.class \
            Atom.class  \
            Pair.class  \
            NilAtom.class  \
            BoolAtom.class  \
            IntAtom.class  \
            DoubleAtom.class  \
            StringAtom.class  \


.SUFFIXES: .java .class
.PHONY: clean

.java.class:
	$(JAVAC) $<

default: Main.class

Main.class: Main.java $(CLASSES)
	$(JAVAC) Main.java

Atom.class: Atom.java
	$(JAVAC) $<

IntAtom.class: IntAtom.java
	$(JAVAC) $<

DoubleAtom.class: DoubleAtom.java
	$(JAVAC) $<

StringAtom.class: StringAtom.java
	$(JAVAC) $<

BoolAtom.class: BoolAtom.java
	$(JAVAC) $<

NilAtom.class: NilAtom.java
	$(JAVAC) $<

Pair.class: Pair.java
	$(JAVAC) $<

run: Main.class
	java Main
	
clean:
	rm -fr *.class html

doc:
	doxygen
