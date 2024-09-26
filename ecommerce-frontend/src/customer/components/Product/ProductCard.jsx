import React from "react";
import "./ProductCard.css";

const ProductCard = () => {
  return (
    <div className="ProductCard w-[15rem] m-3 transition-all cursor-pointer">
      <div className="h-[20rem]">
        <img
          className="h-full w-full object-cover object-left-top"
          src="https://manyavar.scene7.com/is/image/manyavar/ML12066_310-BLACK.2529_18-07-2023-14-34:283x395"
          alt=""
        />
      </div>

      <div className="textPart bg-white p-3">
        <div>
          <p className="font-bold opacity-60">Maanyavar</p>
          <p>Casual Men's Black Kurta</p>
              </div>
              <div className="flex items-center space-x-2">
                  <p className='font-semibold'>199</p>
                  <p className='line-through opacity-50'>1999</p>
                  <p className='text-green-600 font-semibold'>70% Off</p>
              </div>
      </div>
    </div>
  );
};

export default ProductCard;
