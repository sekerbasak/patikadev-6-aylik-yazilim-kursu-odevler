console.log("başak merhaba");
// var slugify = require('slugify'); es6'dan önceki kullanım şekli böyleydi
import slugify from "slugify"; //es6 ile artık import edebiliriz

var title=slugify("başak merhaba bu bir slugify modül inceleme test dersidir");
console.log(title);

import {add,hello} from "./myModule.js"; //!default olarak export edilenler toplu bir şekilde import edilemez ayrı ir satırda yaılması gerekli
console.log(add(45,35));
hello();