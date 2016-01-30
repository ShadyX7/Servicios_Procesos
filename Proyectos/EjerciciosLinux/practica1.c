#include <stdio.h>
#include <stdlib.h>

void main()
{
printf("Ejemplo de uso de System():");
printf("\n\tListado del directorio actual y envio a un fichero:");
printf("%d",system("ls>ficsalida"));
printf("\n\t Abrimos con el gedit el fichero...");
printf("%d",system("gedit ficsalida"));
printf("\n\tEste comando es erroneo:%d",system("ged"));
printf("\nFin de programa...\n");
}
