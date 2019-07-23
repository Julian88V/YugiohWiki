import { MonsterService } from './../monster.service';
import { Monster } from './../models/monster';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-yugioh-list',
  templateUrl: './yugioh-list.component.html',
  styleUrls: ['./yugioh-list.component.css']
})
export class YugiohListComponent implements OnInit {
    title = 'YugiohWiki';

    monsters: Monster[] = [];

    selected = null;
    topic = '';

    getNumOfMonsters = function() {
      return this.monsters.length;
    };

    getAllMonsters() {
      this.monsterService.getAllMonsters().subscribe(
        res => {
          this.monsters = res;
        },
        error => {
          alert('Something went wrong in GetAll error');
        }
      );
    }

    // displayMonster = function(monster) {
      // this.selected = monster;
     // };


  constructor(private monsterService: MonsterService) { }

  ngOnInit() {
    this.getAllMonsters();
  }

}
