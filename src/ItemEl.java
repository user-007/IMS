import java.util.List;

class ItemEl implements Item{

        private String itemName;
        private String itemAuthor;
        private Double price;
        private String description;


        public Double getPrice() {
            return price;
        }

        public String getItemAuthor() {
            return itemAuthor;
        }

        public void setItemAuthor(String itemAuthor) {
            this.itemAuthor = itemAuthor;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;

        }

    @Override
    public Double calculateValue() {
        return this.getPrice();
    }

   @Override
    public List<String> getDetails() {
       return List.of();
   }
    @Override
    public String getDescriptionD() {
        return this.description;
    }
}

