all: build

build:
	g++ -c filesystems.cpp
	g++ -c pregunta1.cpp
	g++ -c main.cpp
	g++ filesystems.o pregunta1.o main.o -o fs
	./fs.exe < input.txt