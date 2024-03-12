import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LiveComponent } from './pages/live/live.component';
import { HistoryComponent } from './pages/history/history.component';
import { PointTableComponent } from './pages/point-table/point-table.component';

export const routes: Routes = [
  {
  path:'',
  redirectTo:'/live',pathMatch:'full'
  },
  {
    path: 'home',
    component: HomeComponent,
    title:'Home | CrickInformation |'
    
  },
  {
    path: 'live',
    component: LiveComponent,
    title:'Live Matches'
    
  },
  {
    path: 'history',
    component: HistoryComponent,
    title:'Maches History'
    
  },
  {
    path: 'point-table',
    component: PointTableComponent,
    title:'Point Table'

  },
];
