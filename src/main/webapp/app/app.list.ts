/**
 * Created by Hienadz on 02.07.16.
 */
import { Component } from '@angular/core';
import { TodoService } from './app.todo'
import {Inject} from '@angular/core';

@Component({
    selector: 'my-list',
    template: '<div>Hello' +
    '<ul><li *ngFor="let todo of todoService.todos">{{todo | json}}</li></ul>'+
    '</div>'+'<div>' +
    '{{todoService.getCarsRestful()|json}}</div>'
})



export class ListClass{

    constructor(@Inject(TodoService) public todoService :TodoService){
        todoService.getCarsRestful();
    }
}