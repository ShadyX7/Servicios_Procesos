#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

void main(){
pid_t pid, Hijo_pid;
pid=fork();

if(pid==-1)
{
//Ha ocurrido un error
printf("No se ha podido crear el proceso hijo...");

exit(-1);

}

if(pid==0)
{

//Nos encontramos en el Proceso hijo
printf("Soy el proceso hijo \n\t MI PID es %d, el PID de mi padre es: %d. \n",getpid(),getpid());

}

else

//Nos encontramos en el proceso padre

{

Hijo_pid=wait(NULL);//espera la finalizacion del proceso hijo
printf("Soy el proceso padre:\n\t Mi PID es %d, EL PID de mi padre es: %d. \n\t Mi hijo: %d terminó.\n", getpid(), getppid(), pid);

}

exit(0);

}
