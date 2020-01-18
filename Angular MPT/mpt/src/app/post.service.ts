import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })

export class PostService {
    apiUrl = 'https://jsonplaceholder.typicode.com/posts';

    constructor(private http: HttpClient) { }

    postData(post): Observable<any> {
        return this.http.post<any>(`${this.apiUrl}`, post);
      }
      getData(): Observable<any> {
        return this.http.get<any>(`${this.apiUrl}`);
      }


      deleteData(post: Post): Observable<any> {
        return this.http.delete<any>(`${this.apiUrl}/${post.id}`);
      }
    
      updateData(post): Observable<any> {
        return this.http.put<any>(`${this.apiUrl}`, post);
      }

}