# Three Address Code

This subdirectory contains code and examples related to generating and working with Three Address Code. Three Address Code is an intermediate representation used in compilers and interpreters to simplify the execution of high-level programming language statements. It is designed to be easier to analyze and transform into machine code.

## Three Address Code Example

Given the expression: 
    ```a = b + c * d```

Three Address Code:
    ```
    t1 = c * d
    t2 = b + t1
    a = t2
    ```

## Prerequisites

Before you begin, ensure you have met the following requirements:

- ***[GCC](https://gcc.gnu.org/):*** You need the GNU Compiler Collection to compile the code.
- ***[Make](https://www.gnu.org/software/make/):*** Make is used to automate the build process.

## How to Compile and Run

To compile and run the code examples in this directory, follow these steps:

1. Open your terminal or command prompt in this sub-directory (Lab #5).

2. Run the make command to compile the code:
    ```
    make
    ```
3. Once the compilation is successful, you can run the generated executable. For example, if the executable is named ***a.exe***, run:
    ```
    make run
        or
    ./a <input_file.txt>
    ```

### Note:

- ***Makefile:*** The Makefile provides rules for compiling the code. You can customize it to add new source files or change compilation options.