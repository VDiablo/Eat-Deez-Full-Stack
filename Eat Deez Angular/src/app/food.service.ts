import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { InsertComponent } from './insert/insert.component';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http:HttpClient) { }
   url = "http://localhost:9001/insert";

   url1 = "http://localhost:9001/update";

   url2 = "http://localhost:9001/delete";

   url3 = "http://localhost:9001/view";

  public insertform1(fooddata: any)
  {
    return this.http.post(this.url,fooddata);
  }
  
  public updaterecord(fooupdate: any)
  {
     return this.http.post(this.url1,fooupdate);
  }

  public deleterecord(fdelete: any)
  {
    return this.http.post(this.url2,fdelete);
 }
  
  public viewfood1()
  {
    return this.http.get(this.url3);
  }

}
