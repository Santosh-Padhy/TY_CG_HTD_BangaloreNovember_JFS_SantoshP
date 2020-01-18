import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';

@Component({
  selector: 'app-delete-post',
  templateUrl: './delete-post.component.html',
  styleUrls: ['./delete-post.component.css']
})
export class DeletePostComponent implements OnInit {

  posts: Post[];
  message: string;
  constructor(private postService: PostService) { }

  ngOnInit() {
  }

  deleteProduct(post: Post) {
    this.postService.deleteData(post).subscribe( response => {
      console.log(response);
      this.message = response.message;
    });
  }

}
