import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalCrearComponent } from './modal-crear.component';

describe('ModalCrearComponent', () => {
  let component: ModalCrearComponent;
  let fixture: ComponentFixture<ModalCrearComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModalCrearComponent]
    });
    fixture = TestBed.createComponent(ModalCrearComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
