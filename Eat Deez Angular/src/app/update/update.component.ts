import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private f2:FoodService) { }

  ngOnInit(): void {
  }
updatedata(updateform: { value: any; })
{
    this.f2.updaterecord(updateform.value).subscribe();
}
}
