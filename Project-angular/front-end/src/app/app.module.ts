import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PessoaListaComponent } from './pessoa-lista/pessoa-lista.component';
import { PessoaCreateComponent } from './pessoa-create/pessoa-create.component';
import { PessoaDeatailsComponent } from './pessoa-deatails/pessoa-deatails.component';

@NgModule({
  declarations: [
    AppComponent,
    PessoaListaComponent,
    PessoaCreateComponent,
    PessoaDeatailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
