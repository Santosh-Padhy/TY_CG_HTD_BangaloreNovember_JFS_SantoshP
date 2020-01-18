import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PostService } from '../post.service';

@Component({
  selector: 'app-view-post',
  templateUrl: './view-post.component.html',
  styleUrls: ['./view-post.component.css']
})
export class ViewPostComponent implements OnInit {
  
  posts: Post[];
  message: string;
  
  constructor(private postService: PostService, private router: Router) { }

  ngOnInit() {
  }

  getPosts() {
    this.postService.getData().subscribe( data => {
      console.log(data);
      this.posts = data.post;
    }, error => {
      console.log(error);
    });
  }

}
