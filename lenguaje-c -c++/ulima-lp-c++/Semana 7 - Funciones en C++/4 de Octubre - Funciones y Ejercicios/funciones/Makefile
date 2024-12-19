all: build

build:
	g++ -c .\operaciones.cpp
	g++ -c .\main.cpp
	g++ .\operaciones.o .\main.o -o main
	@echo "========== Compilacion Terminada =========="
	.\main.exe

clean:
	rm -rf *.o
	rm -rf *.exe

