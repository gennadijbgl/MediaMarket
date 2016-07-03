"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var core_1 = require("@angular/core");
var http_1 = require('@angular/http');
var core_2 = require('@angular/core');
require('rxjs/add/operator/toPromise');
/**
 * Created by Hienadz on 02.07.16.
 */
var TodoService = (function () {
    function TodoService(_http) {
        this._http = _http;
        this.t = "";
        this.todos = ["123", "456"];
    }
    TodoService.prototype.getCarsRestful = function () {
        this.t = this._http.get("http://jsonplaceholder.typicode.com/posts/1")
            .toPromise()
            .then(function (response) { return response.json(); }).catch(this.handleError);
        return this.t;
    };
    TodoService.prototype.handleError = function (error) {
        console.error('An error occurred', error);
    };
    TodoService = __decorate([
        core_1.Injectable(),
        __param(0, core_2.Inject(http_1.Http))
    ], TodoService);
    return TodoService;
}());
exports.TodoService = TodoService;
//# sourceMappingURL=app.todo.js.map