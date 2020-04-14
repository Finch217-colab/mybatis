package site.rootalone.entity;

public class Book {
        private int id;
        private String name;
        private String price;
        private int page;

        public void setId(int id){

                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setPrice(String price) {
                this.price = price;
        }
        
        public void setPage(int page){
                this.page = page;
        }

        public int getId(){
                return this.id;
        }
        
        public String getName() {
                return this.name;
        }
        
        public String  getPrice() {
                return this.price;
        }

        public int getPage() {
                return this.page; 
        }
}


