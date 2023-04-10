import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private f3:FoodService) { }

  ngOnInit(): void {
  }
deletedata(deleteform: any)
{
  this.f3.deleterecord(deleteform.value).subscribe();
}

}
