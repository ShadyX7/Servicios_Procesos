#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main (void)
{

char saludo[]="Un saludo\n";

char buffer [10];

int fd, bytesleidos;

fd = open("texto.txt", 1); //fichero se abre solo para escritura

if( fd == -1 )
{
	printf("ERROR AL ABRIR EL FICHERO ... \n");

	exit (-1);
}

printf("Escribo el saludo ... \n");

write(fd, saludo, strlen(saludo));

close(fd); //cierro el fichero

fd = open("texto.txt", 0); //el fichero se abresolo para lectura

printf("Contenido del Fichero: \n");

//leo bytes de uno en uno y lo guardo en buffer
bytesleidos= read(fd, buffer, 1);

while (bytesleidos != 0) 
{
	printf("%c", buffer[0]); // pinto el byte leido
	// leo otro byte
	bytesleidos=read(fd, buffer, 1);
	}
	close(fd);
}


