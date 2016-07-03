
import {Injectable} from "@angular/core";
import {Http, Headers,RequestOptions,Response} from '@angular/http';
import {Inject} from '@angular/core';
import {Observable}     from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';

/**
 * Created by Hienadz on 02.07.16.
 */

@Injectable()
export class TodoService{
public t :string = "";
constructor(@Inject(Http) public _http:Http){}

    getCarsRestful(){
    this.t = this._http.get("http://jsonplaceholder.typicode.com/posts/1")
        .toPromise()
            .then(response =>response.json()).catch(this.handleError);


        return this.t;
    }
todos = ["123","456"]
    ;
    private handleError(error: any) {
        console.error('An error occurred', error);
   
    }
}