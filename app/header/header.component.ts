import { Component, OnInit } from '@angular/core';
import { PortfolioService } from '../servicios/portfolio.service';
import * as $ from 'jquery';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  miPortfolio:any;
  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log("Datos personales"+ JSON.stringify(data));
      this.miPortfolio=data[0];
    });

    //lo que sigue vino en template
    $('.js-scroll-trigger').on('click',
      function(): void
      {
        $('.navbar-collapse').toggle();
      }
    );
    $('.nav').on('click',
    function(): void
    {
      $('.navbar-collapse').toggle();
    }
  );
  }

}
