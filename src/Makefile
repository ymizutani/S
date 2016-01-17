
JAVAC   =   javac

CLASSES =   S.class \
            Atom.class  \
            Pair.class  \
            IntAtom.class  \


.SUFFIXES: .java .class
.PHONY: clean

.java.class:
	$(JAVAC) $<

default: Main.class

Main.class: Main.java $(CLASSES)
	$(JAVAC) Main.java

run: Main.class
	java Main
	

clean:
	rm -fr *.class html

doc:
	doxygen
