import { Product } from '../types';
import ProductCard from './ProductCard';

type Props = {
  products: Product[];
  onSelectProduct: (product: Product) => void;
};

function ProductsList({ products, onSelectProduct }: Props) {
  return (
    <div className="orders-list-container">
      <div className="orders-list-items">
        {products.map(product => (
          <ProductCard
            key={product.id}
            product={product}
            onSelectProduct={onSelectProduct}
          />
        ))}
      </div>
    </div>
  );
}

export default ProductsList;
