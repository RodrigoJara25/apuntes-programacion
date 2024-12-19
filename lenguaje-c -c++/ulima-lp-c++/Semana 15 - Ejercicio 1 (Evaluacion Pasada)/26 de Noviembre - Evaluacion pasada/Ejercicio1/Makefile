all: build

build:
	g++ -c actividad.cpp
	g++ -c proyecto.cpp
	g++ -c main.cpp
	g++ actividad.o proyecto.o main.o -o proyectos
	.\proyectos.exe

clean:
	rm -rf *.o
	rm -rf *.exe