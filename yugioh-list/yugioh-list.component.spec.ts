import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { YugiohListComponent } from './yugioh-list.component';

describe('YugiohListComponent', () => {
  let component: YugiohListComponent;
  let fixture: ComponentFixture<YugiohListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ YugiohListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(YugiohListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
