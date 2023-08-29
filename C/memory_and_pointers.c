#include<stdio.h> // standard library for input/output
#include<stdlib.h> // standard library
#include<string.h> // for strings
#include<time.h>

int al_azar(int n) {
  return rand() % n + 1;
}

int raro(int n) {
  int r = rand() % n;
  if(r <= n / 2) return 1;
  return rand() % (n - 1) + 1;
}

typedef struct dado {
  int n;
  int (*lanzar) (int);
} dado;

void normal(int n, char p) {
  printf("carta info: %d %c\n", n, p);
}

void diferente(int n, char p) {
  printf("CaRtA iNfO: %c %d\n", p, n);
}

typedef struct carta {
  int num;
  char pinta;
  void (*mostrar) (int, char);
} carta;

int main() {
  srand(time(NULL));
  int n;
  scanf("%d", &n);

  void** array = malloc(sizeof(void*) * n);
  char* types = malloc(sizeof(char) * n);
  for(int i = 0; i < n; i++) {
    // vamos a asumir que hay 50% de prob de ser dado o ser carta
    int tipo = rand() % 100 + 1;

    if(tipo <= 50) {
      printf("Debes crear un dado\n");
      dado* d = malloc(sizeof(dado));
      // aqui pedire numero de caras del dado
      int caras;
      scanf("%d", &caras);
      d->n = caras;
      int fun = rand() % 100 + 1;
      if(fun <= 50)
        d->lanzar = raro;
      else
        d->lanzar = al_azar;
      array[i] = d;
      types[i] = 'd';
    } else {
      printf("Debes crear un carta\n");
      carta* c = malloc(sizeof(carta));
      // aqui pedire el numero y la pinta
      int num;
      char pinta;
      scanf("%d %c", &num, &pinta);
      c->num = num;
      c->pinta = pinta;
      int fun = rand() % 100 + 1;
      if(fun <= 50)
        c->mostrar = normal;
      else
        c->mostrar = diferente;
      array[i] = c;
      types[i] = 'c';
    }
  }

  // para checkear
  for(int i = 0; i < n; i++) {
    printf("array[%d]:\n", i);
    if(types[i] == 'd') {
      dado* d = (dado*) array[i];
      printf("tipo: dado\n");
      printf("info: %d\n", d->n);
      printf("fun: %d\n", d->lanzar(d->n));
    } else {
      carta* c = (carta*) array[i];
      printf("tipo: carta\n");
      printf("info: %d %c\n", c->num, c->pinta);
      c->mostrar(c->num, c->pinta);
    }
  }
  for(int i = 0; i < n; i++) {
    free(array[i]);
  }
  free(array);
  free(types);
  return 0;
}
