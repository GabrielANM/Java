import { Component, OnInit , Inject} from '@angular/core';
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {first} from "rxjs/operators";
import {Pessoa} from '../pessoa';
import {PessoaService} from '../pessoa.service';


@Component({
  selector: 'app-pessoa-edit',
  templateUrl: './pessoa-edit.component.html',
  styleUrls: ['./pessoa-edit.component.css']
})
export class PessoaEditComponent implements OnInit {

  pessoa: Pessoa;
  editForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private router: Router, private pessoaService: PessoaService) { }

  ngOnInit() {
    let id = window.localStorage.getItem("editPessoaId");
    if(!id) {
      alert("Invalid action.")
      this.router.navigate(['pessoa-lista']);
      return;
    }
    this.editForm = this.formBuilder.group({
      id: [''],
      nome: ['', Validators.required],
      sobrenome: ['', Validators.required],
      email: ['', Validators.required],
    });
    this.pessoaService.getPessoa(+id)
      .subscribe( data => {
        this.editForm.setValue(data.result);
      });
  }

  onSubmit() {
    this.pessoaService.updateUser(this.editForm.value)
      .pipe(first())
      .subscribe(
        data => {
            this.router.navigate(['pessoa-lista']);
          }
        ,
        error => {
          alert(error);
        });
  }

}
