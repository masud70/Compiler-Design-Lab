CC = gcc

compile: a clean

a: lex.yy.c parser.tab.c
	$(CC) $^ -o $@

lex.yy.c: lexer.l parser.tab.h
	flex $<

parser.tab.c parser.tab.h: parser.y
	bison -d $<

clean: lex.yy.c parser.tab.c parser.tab.h
	del /F /Q lex.yy.c
	del /F /Q parser.tab.c
	del /F /Q parser.tab.h

run:
	a.exe

.PHONY: all clean
