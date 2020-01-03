import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SectionComponent } from './section/section.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactusComponent } from './contactus/contactus.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { JavaComponent } from './java/java.component';
import { HtmlComponent } from './html/html.component';
import { SpringComponent } from './spring/spring.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SectionComponent,
    HomeComponent,
    AboutComponent,
    ContactusComponent,
    RegisterComponent,
    LoginComponent,
    PagenotfoundComponent,
    JavaComponent,
    HtmlComponent,
    SpringComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
{path:'',component:HomeComponent},
{path:'about',component:AboutComponent,children:[{path:'java',component:JavaComponent},{path:'html',component:HtmlComponent},
  {path:'spring',component:SpringComponent}]},
{path:'contactus',component:ContactusComponent},
{path:'register',component:RegisterComponent},
{path:'login',component:LoginComponent},
{path:'**',component:PagenotfoundComponent}
 ])

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
