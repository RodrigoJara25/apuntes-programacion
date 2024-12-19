all: build

build:
	@echo "Building..."
	g++ -c src/jugador.cpp -I./include
	g++ -c src/partida.cpp -I./include
	g++ -c src/carta.cpp -I./include
	g++ -c src/mazo.cpp -I./include
	g++ -c src/main.cpp -I./include
	g++ jugador.o partida.o carta.o mazo.o main.o -o blackjack
	@echo "Building done!"

clean:
	@echo "Cleaning..."
	rm -f *.o
	rm -f *.exe 