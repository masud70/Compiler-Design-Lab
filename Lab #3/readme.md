# Compiler Design Lab - Lab 3

## Testing CFG in ANTLR Parser Generator

In Lab 3, the task is to test a Context-Free-Grammar (CFG) for 10 complex Bengali sentences using the ANTLR parser generator. The goal is to demonstrate the parsing of these sentences and visualize the parse tree in the ANTLR GUI.

## Instructions

Follow the steps below to test the CFG using the ANTLR parser generator:

### Prerequisites

1. **ANTLR4 Installation**: Install ANTLR4 by following the instructions provided on the official ANTLR website: [ANTLR - Getting Started](https://www.antlr.org/getting-started.html).

2. **Setup Process**: Complete the setup process for ANTLR4, ensuring that the necessary environment variables are configured.

### Testing CFG

1. **Write CFG in ANTLR4 Format**: Create a file named `CFG.g4` and write your Context-Free-Grammar in ANTLR4 format.

2. **Create Test File**: Create a `.txt` file and write a test string that corresponds to the CFG.

3. **Run Commands**: Open your terminal and navigate to the directory containing your `CFG.g4` file and the test file. Run the following commands:

    ```bash
    class                 # Run for the required environment setup
    antlr CFG.g4          # Generate parser and lexer files
    javac CFG*.java       # Compile generated files
    grun CFG sentence test.txt -gui   # Run the parser with the test string
    ```

4. **ANTLR GUI**: The ANTLR GUI will open, showing the parse tree of the provided test string.

## Example

A `CFG.g4` file and a `test.txt` file with a test string, running the commands should produce an output similar to the following:

```bash
$ class
$ antlr CFG.g4
$ javac CFG*.java
$ grun CFG sentence test.txt -gui
```

The ANTLR GUI will display the parse tree, allowing you to visually inspect the parsing process.

## Submission

Submit the CFG file (`CFG.g4`), the test file (`test.txt`), and any additional documentation required by the lab.

## Notes

- Ensure that your CFG is correctly formatted in ANTLR4 syntax.
- Provide meaningful test strings to cover various aspects of your CFG.

Happy parsing!