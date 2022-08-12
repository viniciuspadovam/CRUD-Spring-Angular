import { Component, OnInit } from '@angular/core';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-read',
  templateUrl: './product-read.component.html',
  styleUrls: ['./product-read.component.css']
})
export class ProductReadComponent implements OnInit {
  products!: Product[];
  columnsToDisplay = ['id', 'name', 'price', 'entryStock', 'actions'];

  constructor(private service: ProductService) { }

  ngOnInit(): void {
    this.service.read().subscribe(products => {
      this.products = products;
    });
  }
}
