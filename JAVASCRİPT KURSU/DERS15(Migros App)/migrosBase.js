class MigrosBase{

    discountRate=20;
    constructor(name,surname,hasCard,products){
        this.name=name;
        this.surname=surname;
        this.hasCard=hasCard;
        this.products=products;

    }

    calcPrice(){

        let amountToBePaid=0;
        if (this.checkProducts(this.products)) {
            //sepeti dolu
            if (this.hasCard) {
                this.products.forEach(product => {
                    amountToBePaid+=(product.price*(100-this.discountRate)/100);
                });
            }
            else{
                this.products.forEach((product)=>{
                amountToBePaid+=product.price;


                });

            }
           
        }
        else{
            //sepeti boş
            alert("En az 1 ürün satın almalısın");
        }
        return amountToBePaid;

    }
    checkProducts(product){
        if (product!=null && product.length>0) {
            return true;
            
        }
        return false;
    }
}