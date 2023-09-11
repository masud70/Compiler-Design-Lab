def count_characters_words_lines(filename):
    characters = 0
    words = 0
    lines = 0

    try:
        with open(filename, 'r') as file:
            for line in file:
                lines += 1
                characters += len(line)
                words += len(line.split())
    except FileNotFoundError:
        print(f"Error: The file '{filename}' was not found.")
        return

    print(f"Number of characters: {characters}")
    print(f"Number of words: {words}")
    print(f"Number of lines: {lines}")
    input()


if __name__ == "__main__":
    file_name = input("Enter the filename: ")
    count_characters_words_lines(file_name)
