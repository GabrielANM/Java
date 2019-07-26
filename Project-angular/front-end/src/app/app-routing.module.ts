import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PessoaListaComponent} from './pessoa-lista/pessoa-lista.component';
import {PessoaCreateComponent} from './pessoa-create/pessoa-create.component';
import {PessoaDetailsComponent} from './pessoa-details/pessoa-details.component';
import {PessoaEditComponent} from './pessoa-edit/pessoa-edit.component';


const routes: Routes = [
  { path: '', redirectTo: '/pessoas', pathMatch: 'full'},
  { path: 'pessoas', component: PessoaListaComponent},
  { path: 'add', component: PessoaCreateComponent},
  { path: 'details/:id', component: PessoaDetailsComponent },
  { path: 'edit-user', component: PessoaEditComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
