export class Monster {
  id: number;
  name: string;
  attackpoints: number;
  defensepoints: number;
  attribute: string;
  type: string;
  description: string;
  monsterImageUrl: string;
  lastEdit: number;
  createdMonster: number;

  // tslint:disable-next-line:max-line-length
  constructor (id?: number, name?: string, attackpoints?: number, defensepoints?: number, attribute?: string, type?: string, description?: string, imgUrl?: string, lastEdit?: number, createdMonster?: number) {
    this.id = id;
    this.name = name;
    this.attackpoints = attackpoints;
    this.defensepoints = defensepoints;
    this.attribute = attribute;
    this.type = type;
    this.description = description;
    this.monsterImageUrl = this.monsterImageUrl;
    this.lastEdit = lastEdit;
    this.createdMonster = createdMonster;
  }


}


