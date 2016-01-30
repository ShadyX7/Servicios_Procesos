#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

main(){
int num=6;
pid_t pid;

pid=fork();

if(pid==-1)//Ha ocurrido un error
{
printf("No se ha podido crear el proceso hijo...");
exit(-1);
}
if(pid==0){
num=num-5;
printf("\nValor del Hijo: %d ", num);
}else{ //padre
wait();//Esperar Hijo
num=num+6;
printf("\nValor del padre: %d ", num);
}
exit(0);
}

