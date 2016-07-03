"use strict";
/**
 * Created by Hienadz on 02.07.16.
 */
var platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
var app_component_1 = require('./app.component');
var app_todo_1 = require('./app.todo');
var app_list_1 = require('./app.list');
var http_1 = require("@angular/http");
require('rxjs/Rx');
platform_browser_dynamic_1.bootstrap(app_component_1.AppComponent, [app_todo_1.TodoService, http_1.HTTP_PROVIDERS]);
platform_browser_dynamic_1.bootstrap(app_list_1.ListClass, [app_todo_1.TodoService, http_1.HTTP_PROVIDERS]);
//# sourceMappingURL=main.js.map