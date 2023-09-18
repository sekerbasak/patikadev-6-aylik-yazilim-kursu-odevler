
 const amountInput=document.querySelector("#amount");
 const firstOption=document.querySelector("#firstCurrencyOption");
 const secondOption=document.querySelector("#secondCurrencyOption");
const resultInput=document.querySelector("#result");
const currency=new Currency();

 runEventLİstener();

 function runEventLİstener(){
  amountInput.addEventListener("input", exchange)

 }
 function exchange(){
  let amount=Number(amountInput.value.trim());
  let firstSelect=firstOption.options[firstOption.selectedIndex].textContent;
  let secondSelect=secondOption.options[secondOption.selectedIndex].textContent;
 const result= currency.excahnge(amount,firstSelect,secondSelect)
 .then((result)=>resultInput.value=result.toFixed(3));
 }