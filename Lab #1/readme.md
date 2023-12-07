# Compiler Design Lab - Lab 1

## Task Description

In this lab, the objective is to design a recursive descent parser for a set of 10 Bengali complex sentences. Each student is required to write a Context-Free Grammar (CFG) for these sentences and implement a parser in any programming language. For the purpose of this lab, we have chosen to write the parser in Python.

## Files

- `CompilerLab.ipynb`: The recursive descent parser file written in Python.
- `LabReport.pdf`: A pdf file that contains the lab report.

## Instructions

1. **CFG Design**: We write a Context-Free Grammar (CFG) for the selected 10 Bengali complex sentences. The CFG covers the syntax and structure of these sentences.

2. **Parser Implementation**: Second step is to implement a parser in Python (`CompilerLab.ipynb`) based on the CFG designed. The parser takes a sentence as input and output "Parsing successful" or "Parsing Error" with the error occured.

3. **Testing**: Finally, we test our parser with some example sentences that ensure that the parser produces the expected outputs.

## Running the Parser

To run the parser, execute the following command in your terminal:

```bash
python parser.py
```

The parser will read sentences from the **command prompt** and display whether parsing was successful or unsuccessful for each sentence.

## Example

```bash
$ python parser.py
Parsing sentence: যত পড়বে, তত জানবে।
Parsing successful
...
```

Happy parsing!