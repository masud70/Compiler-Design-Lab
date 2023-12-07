# Compiler Design Lab - Lab 4

## Running CFG Using BISON Parser Generator

In Lab 4, the task is to run the Context-Free-Grammar (CFG) for 10 Bengali Complex Sentences using the BISON parser generator. Additionally, a new CFG was introduced as the main focus. The relevant files for the Bengali CFG are stored in the "Parser for Bangla Sentence" folder.

## Instructions

To run the code, follow the steps below using the provided Makefile:

### Makefile Commands

The Makefile contains the following commands:

- **compile**: Generates the executable file named `a` and cleans unnecessary files.
- **run**: Executes the `a.exe` file with the provided input file (`input.txt` in this case).
- **clean**: Deletes temporary files generated during compilation.

### How to Run

1. Open your terminal and navigate to the directory containing the Makefile and related files.

2. Run the following command to compile and generate the executable:

    ```bash
    make compile
    ```

3. To run the executable with the provided input file, use the following command:

    ```bash
    make run
    ```

### Additional Task: Presentation

A comparison presentation on ANTLR and BISON is provided in a PDF file named "PresentationSlide.pdf". You can review this presentation to understand the differences between the two parser generators.

## Folder Structure

- **Parser for Bangla Sentence**: Contains files related to the Bengali CFG.

## Submission

Submit any updated CFG files, the Makefile, and any additional documentation(`LabReport.pdf`) required by the lab.

## Notes

- Ensure that the Makefile is correctly configured for your specific setup.
- Review the presentation for insights into the comparison between ANTLR and BISON.

Happy parsing!