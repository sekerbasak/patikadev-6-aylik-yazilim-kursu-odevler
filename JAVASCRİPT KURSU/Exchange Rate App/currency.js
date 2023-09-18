
class Currency{
    constructor(){
        this.url="https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_TXGmijJtEed9cOmXIZ7Z9GjICoI2K6fwUxTtqv2u&base_currency=";

    }
   async excahnge(amount,firstCurrency,secondCurrency){
    const response=  await  fetch(`${this.url}${firstCurrency}`)
    const result=await response.json();
   const exchangeResult= amount*result.data[secondCurrency];
   return exchangeResult;
   
}
}