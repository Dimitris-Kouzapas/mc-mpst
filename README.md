# mc-mpst: A Tool for Mixed Choice Multiparty Session Types
This is a tool for mixed choice multiparty session types
developed in the paper, _Enforcing Protocol Conformance in Mixed Choice Multiparty Session Types_

## Requirements

You need [javac](https://www.oracle.com/technetwork/java/javase/downloads/index.html) installed on your machine.

The mc-mpst tool has been tested on `jdk-18.0.1.1`. 

## Compiling and running the tool

### Compilation

* Go to the `mc-mpst` directory.

* Run: `make`

* Run the following command to enter the interactive mode
`java -jar mc-mpst`

## Running mc-mpst Help

In the interactive mode, run `usage`.
The command lists a description of the tool's functionalities and a number of options for the `usage` command.

In the interactive mode running command `usage -<command>`, where `-<command>` is an option listed by the `usage` command, lists the functionality of `command`.

## Syntax of Global Types, Local Types and Local Contexts 

Assume the following meta-variables:

		p, q are participants
		U is a ground type
		@l is a label
		rec_label is a recursive label

### Global Types

		global	:=	choice global_prefix [or global_prefix]+  
				 |	rec_label. global
				 |	rec_label
				 |	end

		global_prefix
				:=	p->q: U; global
				 |	p->q: @l; global

* Type `p->q: U; global` describes participant `p` sending message of type `U` to participant `q` and then continues as type `global`.
* Type `p->q: @l; global` describes participant `p` selecting a label `l` on participant `q` and then continues as type `global`.
* Type `choice global_prefix [or global_prefix]+ ` describes a set of choices described by `global_prefix` types.
* Type `rec_label. global` describes a recursive type with `rec_label` as its recursive label.
* Type `rec_label` is a recursive label.
* Type `end` is a terminating type.

### Local Types
		local	:=	p!U; local | p?U; local
				 |	p!@l; local | p?@l: local
				 |	choice local_prefix [or local_prefix]+
				 |	rec_label. local
				 |	rec_label
				 |	end

		local_prefix
				:=	p!U; local | p?U; local
				 |	p!@l; local | p?@l: local

* Type `p!U; local` describes participant `p` sending message of type `U` and then continue as type `local`.
* Type `p?U; local` describes participant `p` receiving message of type `U` and then continue as type `local`.
* Type `p!@l; local` describes participant `p` selecting a label `l` and then continue as type `local`.
* Type `p?@l; local` describes participant `p` branching on label `l` and then continue as type `local`.
* Type `choice local_prefix [or local_prefix]+ ` describes a set of choices described by `local_prefix` types.
* Type `rec_label. local` describes a recursive type with `rec_label` as its recursive label.
* Type `rec_label` is a recursive label.
* Type `end` is a terminating type.

### Remark on the Syntax of Global and Local Types

The syntax of global and local types differs from the syntax of global and local types in the paper _Enforcing Protocol Conformance in Mixed Choice Synchronous Multiparty Session Types_. We can encode the syntax from the paper as

* Global type `p->q: l<U>; global` is encoded as `p->q: @l. p->q: U; [global]`
* Local type `p!l<U>; local` is encoded as `p!@l; p!U; [local]`
* Local type `p?l<U>; local` is encoded as `p?@l; p?U; [local]`

* In examples in this artifact, we often use the **abbreviations** defined after Definition 3.1 (Global and local types), which match with the above syntax of this tool.

### Local Context
		local_context
				:=	{ ID: <local> [, ID: <local>]* }

* A local context is an association of names, `ID`, to local types `local`.

## Commands

### Store a type in the mc-mpst memory

* Command `ID = <global>` stores global type `<global>` with name `ID`.
* Command `ID = <local_context>` stores local context `<local_context>` with name `ID`.

### Project a global type

* Command `project <global_type_ID>` projects and prints the corresponding local context. In case `<global_type_ID>` is not projectable, it displays the relevant error.

### Translate a global type

* Command `translate <global_type_ID>` translates the corresponding translated global type into an equivalent well parallel type, and prints the result. In case `<global_type_ID>` is not translatable, it displays the relevant error.

### Project and store a global type

* Command `store project <global_type_ID>` projects and stores the corresponding local context with name `projection_<global_type_ID>`. In case `<global_type_ID>` is not projectable, it displays the relevant error.

### Translate and store a global type

* Command `store translate <global_type_ID>` translates and stores the corresponding global type with name `translation_<global_type_ID>`. In case `<global_type_ID>` is not translatable, it displays the relevant error.

### List stored configurations

* Command `ls` will list all the configurations stored in the `mc-mpst` memory.
* Command `ls <type_ID>` will display the configuration as it is stored in the `mc-mpst` memory.

###  Extract a configuration in a file

* Command `extract <type_ID> <filename>` will extract configuration `<type_ID>` into file `<filename>`.

### Create a mcrl2 .lts file

* Command `graph <type_ID> <file>` will create file `<file>.lts`, which is recognisable by the `ltscompare` operation of the `mclr2` model checker.

### Check the conformance between type configurations

* Command `check <global_type_ID>`
or `verify <global_type_ID>` 
uses the `ltscompare` tool from the `mcrl2` model checker to check the bisimulation conformance between the global type
`global_type_ID` and its projection.

* Command `check <type1> == <type2>` uses the `ltscompare` tool from the `mcrl2` model checker to check the bisimulation conformance between type configuration `<type1>` and `<type2>`.

### Run commands from a file

*Command `load <filename>.mc`, where `<filename>.mc` is the file that contains the commands for execution.

### Exit and quit 

*Command `exit` and `quit` quits. 

## Examples

### Benchmark examples directory
* `benchmark_examples`

Contains the global types of the benchmarks from Table 1 of the paper _Enforcing Protocol Conformance in Mixed Choice Multiparty Session Types_

### Producing the inputs for benchmarking with 'mcmsptk'

* Command `load benchmark.mc` loads, projects and creates the `.lts` and `.ctx` files for the examples of Table 1 in the companion paper _Enforcing Protocol Conformance in Mixed Choice Synchronous Multiparty Session Types_ under the directory 'lts'. For global types
'no_proj1' and 'no_proj2', the tool only creates
the global type lts files since they are not projectable.  

* Command `load demonstration.mc` loads the example from the artifact documentation.

### Run examples in the appendix of the paper

* command `load appendix_examples.mc` loads all the global types found in Example H.1 in Appendix H in the companion paper _Enforcing Protocol Conformance in Mixed Choice Synchronous Multiparty Session Types_ 

### Other examples directory
* `other_examples`

### Benchmark and Source Files

```
.
|-- mc_mpst
    |-- README.md 
    |-- src		     Java source files
    |-- bin
    |-- benchmark_examples   the global types of Table 1
    |-- other_examples       other examples 
    |-- benchmark.mc 	     creates the benchmark inputs into the directory lts
    |-- demonstrate.mc       creates the demo input for the artifact documentation
    |-- appendix_examples.mc loads the global types in Example H.1 in the companion paper
    |-- lts                  stores the files generated from benchamrk.mc
   
```


