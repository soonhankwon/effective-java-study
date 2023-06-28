// object 는 불변이지만 (final) 프로퍼티는 가변
'use strict'
const soon = {
    'name': 'HAN',
    'age' : 30
};

// freeze
Object.freeze(soon);

// error
soon.language = ["Java"]
soon.language.push("JavaScript")
soon.name = "SOON";

console.info(soon.name)
console.info(soon.language)