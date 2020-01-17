JCC=javac
CLASSPATH=../libs/antlr-4.7.2-complete.jar:.

JAR=jar
JARFLAGS=cfm

OUTPUT=../mc-mpst.jar

MAIN=Main.java
BIN=../bin


all:		src/$(MAIN)
		cd src;\
		$(JCC) -cp $(CLASSPATH) $(MAIN) -d $(BIN);
		cd bin;\
		$(JAR) $(JARFLAGS) $(OUTPUT) manifest.mf Main.class compiler/ action/ automata/ runtime/ org/ resources/



