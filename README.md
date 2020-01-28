# mc-mpst: A protocol Description Language

This is an implementation of the mixed-choice multiparty session type theory developed in the draft paper *[Mixed-choice Multiparty Session Types]

## Requirements

You will need [javac](https://www.oracle.com/technetwork/java/javase/downloads/index.html) installed on your machine.


## Compiling and running the tool

Here, we assume that you have a terminal open and that you are in the `mc-mpst` directory.

### Compile:

* Run: `make`

### Usage

The tool runs in an interactive mode.

#### Interactive mode

* Run the following command to enter the interactive mode `./java -jar mc-mpst`

## Running mc-mpst Help

In the interactive mode run `usage`. The command will list a description of the tool's functionalities and a number of options for the `usage` command.

In the interactive mode running command `usage -option`, where `-option` is an option listed by the `usage` command, will list more details on the functionality `-option`.

## Running the tests

In the interactive mode run `load examples/filename.mc`, where `filename.mc` is the filename of the example towards loading. 

