/* tslint:disable:ban-types */
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Pessoa} from './pessoa';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {
  private baseUrl = 'http://localhost:8080/api/v1/pessoas';
  constructor(private http: HttpClient) { }
  getPessoas(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  getPessoa(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createPessoa(pessoa: Object): Observable<Object> {
   return this.http.post(`${this.baseUrl}`, pessoa);
  }

  updateUser(pessoa: Pessoa): Observable<PessoaService> {
    return this.http.put<PessoaService>(this.baseUrl + pessoa.id, pessoa);
  }

  deletePessoa(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, {responseType: 'text'});
  }

}
