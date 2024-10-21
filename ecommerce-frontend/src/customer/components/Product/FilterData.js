export const color = [
  "white",
  "Black",
  "Red",
  "Maroon",
  "Biege",
  "Pink",
  "Green",
  "Yellow",
];

export const filters = [
  {
    id: "color",
    name: "Color",
    options: [
      { values: "white", label: "White" },
      { values: "beige", label: "Biege" },
      { values: "blue", label: "Blue" },
      { values: "brown", label: "Brown" },
      { values: "green", label: "Green" },
      { values: "purple", label: "Purple" },
      { values: "yellow", label: "Yellow" },
    ],
  },

  {
    id: "size",
    name: "Size",
    options: [
      { value: "S", label: "S" },
      { values: "M", label: "M" },
      { values: "L", label: "L" },
    ],
  },
];

export const singleFilter = [
  {
    id: "price",
    name: "Price",
    options: [
      { value: "159-399", label: "₹159 To ₹399" },
      { value: "399-999", label: "₹399 To ₹999" },
      { value: "999-1999", label: "₹999 To ₹1999" },
      { value: "1999-2999", label: "₹1999 To ₹2999" },
      { value: "3999-4999", label: "₹3999 To ₹4999" },
    ],
  },
  {
    id: "discount",
    name: "Discount Range",
    options: [
      {
        value: "10",
        label: "10% And Above",
      },
      { values: "20%", label: "20% And Above" },
      { values: "30%", label: "30% And Above" },
      { values: "40%", label: "40% And Above" },
      { values: "50%", label: "50% And Above" },
      { values: "60%", label: "60% And Above" },
      { values: "70%", label: "70% And Above" },
      { values: "80%", label: "80% And Above" },
      { values: "90%", label: "90% And Above" },
    ],
  },

  {
    id: "stock",
    name: "Availability",
    options: [
      { value: "in_stock", label: "In stock" },
      { values: "out_of_stock", label: "Out of Stock" },
    ],
  },
];
