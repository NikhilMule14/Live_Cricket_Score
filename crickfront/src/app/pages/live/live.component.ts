import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../../services/api-call.service';
import { CommonModule } from '@angular/common';

import { MatchCardComponent } from '../../component/match-card/match-card.component';

@Component({
  selector: 'app-live',
  standalone: true,
  imports:[CommonModule,MatchCardComponent],
  templateUrl: './live.component.html',
  styleUrls: ['./live.component.css'],
  
})
export class LiveComponent implements OnInit {
  liveMatches: any;
  liveMatchesJson!: string; // Add this property

  constructor(private _api: ApiCallService) {}

  ngOnInit(): void {
    this.loadLiveMatches();
  }

  private loadLiveMatches() {
    this._api.getLiveMatches().subscribe({
      next: data => {
        console.log(data);
        this.liveMatches = data;

        // Convert the liveMatches object to a JSON string
        this.liveMatchesJson = JSON.stringify(this.liveMatches, null, 2);
      },
      error: error => {
        console.log(error);
      }
    });
  }
}