import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Pessoa} from '../pessoa';
import {PessoaService} from '../pessoa.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-pessoa-lista',
  templateUrl: './pessoa-lista.component.html',
  styleUrls: ['./pessoa-lista.component.css']
})
export class PessoaListaComponent implements OnInit {

  pessoas: Observable<Pessoa[]>;
  constructor(private pessoaService: PessoaService, private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.pessoas = this.pessoaService.getPessoas();
  }
  deletePessoa(id: number) {
    this.pessoaService.deletePessoa(id).subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }
  pessoaDetails(id: number) {
    this.router.navigate(['details', id]);
  }
}
