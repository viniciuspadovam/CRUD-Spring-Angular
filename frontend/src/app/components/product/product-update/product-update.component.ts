import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  form: FormGroup;
  id: number = 0;
  formUpdate!: FormGroup;
  product!: Product;
  
  constructor(private service: ProductService, private router: Router, private route: ActivatedRoute, private fb: FormBuilder) {
    this.form = this.fb.group({
      id: [null, [Validators.nullValidator]],
      name: [null, [Validators.required]],
      price: [null, [Validators.required, Validators.pattern]],
      entryStock: [null, [Validators.nullValidator]],
    });
    this.form.controls['id'].disable();
    this.form.controls['entryStock'].disable();
    this.route.params.subscribe(params => this.id = params['id']);
  }
  
  ngOnInit(): void {
    this.service.readById(this.id).subscribe((product) => {
      this.product = product;
    });
  }

  updateProduct(): void {
    this.product.name = this.form.value.name;
    this.product.price = this.form.value.price;
    this.service.update(this.product).subscribe(() => {
      this.service.showMessage("Alterado com sucesso!");
      this.router.navigate(["/products"]);
    });
  }

  cancel(): void {
    this.router.navigate(["/products"]);
  }
}
