import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class NotificacaoService {

  constructor(
    private snackbar: MatSnackBar
  ) { }

  //metodo notificar
  notificar(mensagem: string){
    this.snackbar.open(mensagem, "ok",{
      duration: 2000,
      verticalPosition:"top",
      horizontalPosition: "center"
    });
  }
}
