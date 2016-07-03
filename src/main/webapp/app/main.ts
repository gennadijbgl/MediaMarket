/**
 * Created by Hienadz on 02.07.16.
 */
import { bootstrap }    from '@angular/platform-browser-dynamic';
import { AppComponent } from './app.component';
import { TodoService } from './app.todo'
import {ListClass} from './app.list'
import {HTTP_PROVIDERS} from "@angular/http"; import 'rxjs/Rx';


bootstrap(AppComponent,[TodoService,HTTP_PROVIDERS]);
bootstrap(ListClass,[TodoService,HTTP_PROVIDERS]);