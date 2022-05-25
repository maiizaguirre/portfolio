import { not } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';
import { Router } from '@angular/router'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup | undefined;
  login(): any {
    throw new Error('Method not implemented.');
  }
  form:FormGroup;
  constructor(private formBuilder:FormBuilder, private autenticacionService:AutenticacionService, private ruta:Router) { 
    this.form=this.formBuilder.group(
      {
        email:['',[Validators.required, Validators.email]],
        password:['',[Validators.required, Validators.minLength(8)]],
        deviceInfo:this.formBuilder.group({
          deviceId:[""],
          deviceType:[""],
          notificationToken:[""]
      })
    }
  )
}

  ngOnInit(): void {
  }

  get Email()
  {
    return this.form.get('email');
  }

  get Password()
  {
    return this.form.get('password');
  }

  onEnviar (event:Event){
    event.preventDefault;
    this.autenticacionService.Login(this.form.value).subscribe(data=>{
      console.log("DATA:" + JSON.stringify(data));
      this.ruta.navigate(['/portfolio']);
    })
  }
}
