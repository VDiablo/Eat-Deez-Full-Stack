import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private f1 : FoodService) { }

  ngOnInit(): void {
  }
  insertdata(insertform: { value: any; })
  {
    return  this.f1.insertform1(insertform.value).subscribe();
  }

}
