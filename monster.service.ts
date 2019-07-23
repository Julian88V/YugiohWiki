import { Monster } from './models/monster';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MonsterService {
  private BASE_URL = 'http://localhost:8080/api';
  private ALL_MONSTERS_URL = 'http://localhost:8080/api/monsters';
  private NEW_MONSTER_URL = `${this.BASE_URL}\\monsters`;
  private UPDATE_MONSTER_URL = `${this.BASE_URL}\\monsters\\`;
  private DELETE_MONSTER_URL = `${this.BASE_URL}\\monsters\\`;

  constructor(private http: HttpClient) { }

  getAllMonsters(): Observable<Monster[]> {
    return this.http.get<Monster[]>(this.ALL_MONSTERS_URL);
  }

  createMonster(monster: Monster): Observable<any> {
    return this.http.post(this.NEW_MONSTER_URL, monster);
  }

  updateMonster(monster: Monster): Observable<Monster> {
    return this.http.put<Monster>(this.UPDATE_MONSTER_URL + '/' + monster.id, monster);
  }

  deleteMonsterById(id: number): Observable<any> {
    return this.http.delete(this.DELETE_MONSTER_URL + '/' + id);

  }


}
