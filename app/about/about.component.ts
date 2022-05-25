import { Component, OnInit } from '@angular/core';
import * as awesom from '@fortawesome/free-solid-svg-icons';
import { PortfolioService } from 'src/app/servicios/portfolio.service';


@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  mapMarker: any ;
  building:any;
  mobile:any;
  email:any;
  birthday:any;
  badge:any;
  home:any;
  miPortfolio:any;
  constructor(private datosPortfolio:PortfolioService) { }
 

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log("Datos personales"+ JSON.stringify(data));
      this.miPortfolio=data[5];
    });
    this.mapMarker=awesom.faMapMarker;
    this.building=awesom.faCity;
    this.email=awesom.faMailBulk;
    this.mobile=awesom.faMobile;
    this.birthday=awesom.faBirthdayCake;
    this.badge=awesom.faGraduationCap;
    this.home=awesom.faLaptopHouse;
    this.datosPortfolio.obtenerDatos().subscribe(data =>{
        console.log(data);
        this.miPortfolio=data;
      });
  
  }

}
