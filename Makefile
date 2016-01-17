
JAVAC   =   javac

.PHONY: clean

S.class: S.java
	$(JAVAC) $<


clean:
	rm -fr *.class html

doc:
	doxygen
