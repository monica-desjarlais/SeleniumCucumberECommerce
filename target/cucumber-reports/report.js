$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addCart.feature");
formatter.feature({
  "line": 2,
  "name": "Add Cart Validation",
  "description": "",
  "id": "add-cart-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddCart"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "Check if you cannot add more products in cart than products available in the store",
  "id": "add-cart-validation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on \"mobile\" menu",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "click on add to cart menu for xperia mobile",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "change qty value to \"1000\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on update button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verify the error message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on empty card link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify the error message is displayed for empty card",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralStepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 8620220782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.guru99.com",
      "offset": 13
    }
  ],
  "location": "GeneralStepDefinition.navigate_to(String)"
});
formatter.result({
  "duration": 6188770705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobile",
      "offset": 10
    }
  ],
  "location": "AddCartStepDefin.click_on_menu(String)"
});
formatter.result({
  "duration": 2459569094,
  "status": "passed"
});
formatter.match({
  "location": "AddCartStepDefin.click_on_add_to_cart_menu_for_xperia_mobile()"
});
formatter.result({
  "duration": 2167815039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 21
    }
  ],
  "location": "AddCartStepDefin.change_qty_value_to(String)"
});
formatter.result({
  "duration": 526402576,
  "status": "passed"
});
formatter.match({
  "location": "AddCartStepDefin.click_on_update_button()"
});
formatter.result({
  "duration": 2268795807,
  "status": "passed"
});
formatter.match({
  "location": "AddCartStepDefin.verify_the_error_message_is_displayed()"
});
formatter.result({
  "duration": 191006935,
  "status": "passed"
});
formatter.match({
  "location": "AddCartStepDefin.click_on_empty_card_link()"
});
formatter.result({
  "duration": 1338811949,
  "status": "passed"
});
formatter.match({
  "location": "AddCartStepDefin.verify_the_error_message_is_displayed_for_empty_card()"
});
formatter.result({
  "duration": 185916415,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefinition.close_browser()"
});
formatter.result({
  "duration": 2438854180,
  "status": "passed"
});
formatter.uri("compareProducts.feature");
formatter.feature({
  "line": 2,
  "name": "Compare Products",
  "description": "",
  "id": "compare-products",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompareProducts"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check if you are able to compare two products",
  "description": "",
  "id": "compare-products;check-if-you-are-able-to-compare-two-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on mobile menu",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on add to compare for two mobiles",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on compare button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the products are reflected in the popup window",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralStepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 3481119141,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.guru99.com",
      "offset": 13
    }
  ],
  "location": "GeneralStepDefinition.navigate_to(String)"
});
formatter.result({
  "duration": 5454111527,
  "status": "passed"
});
formatter.match({
  "location": "CompareProductsStepDefin.click_on_mobile_menu()"
});
formatter.result({
  "duration": 4173373643,
  "status": "passed"
});
formatter.match({
  "location": "CompareProductsStepDefin.click_on_add_to_compare_for_two_mobiles()"
});
formatter.result({
  "duration": 15198898068,
  "status": "passed"
});
formatter.match({
  "location": "CompareProductsStepDefin.click_on_compare_button()"
});
formatter.result({
  "duration": 609571659,
  "status": "passed"
});
formatter.match({
  "location": "CompareProductsStepDefin.verify_the_products_are_reflected_in_the_popup_window()"
});
formatter.result({
  "duration": 1954082716,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefinition.close_browser()"
});
formatter.result({
  "duration": 2173343647,
  "status": "passed"
});
formatter.uri("couponValidation.feature");
formatter.feature({
  "line": 2,
  "name": "Discount Coupon Validation",
  "description": "",
  "id": "discount-coupon-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CouponValidation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check if the discount coupon works correctly",
  "description": "",
  "id": "discount-coupon-validation;check-if-the-discount-coupon-works-correctly",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enter \u003cusername\u003e and \u003cpassword\u003e and logs in",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on mobile link",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "add iphone to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter coupon code",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the error discount is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "discount-coupon-validation;check-if-the-discount-coupon-works-correctly;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "discount-coupon-validation;check-if-the-discount-coupon-works-correctly;;1"
    },
    {
      "cells": [
        "monicalauraburns@yahoo.com",
        "test123"
      ],
      "line": 16,
      "id": "discount-coupon-validation;check-if-the-discount-coupon-works-correctly;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Check if the discount coupon works correctly",
  "description": "",
  "id": "discount-coupon-validation;check-if-the-discount-coupon-works-correctly;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@CouponValidation"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enter monicalauraburns@yahoo.com and test123 and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on mobile link",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "add iphone to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter coupon code",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the error discount is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralStepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 4605619383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.guru99.com",
      "offset": 13
    }
  ],
  "location": "GeneralStepDefinition.navigate_to(String)"
});
formatter.result({
  "duration": 8807719054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monicalauraburns@yahoo.com",
      "offset": 6
    },
    {
      "val": "test123",
      "offset": 37
    }
  ],
  "location": "CouponValidationStepDefin.enter_and_and_logs_in(String,String)"
});
formatter.result({
  "duration": 7414935293,
  "status": "passed"
});
formatter.match({
  "location": "CouponValidationStepDefin.click_on_mobile_link()"
});
formatter.result({
  "duration": 5111258106,
  "status": "passed"
});
formatter.match({
  "location": "CouponValidationStepDefin.add_iphone_to_cart()"
});
formatter.result({
  "duration": 1762827926,
  "status": "passed"
});
formatter.match({
  "location": "CouponValidationStepDefin.enter_coupon_code()"
});
formatter.result({
  "duration": 3498568513,
  "status": "passed"
});
formatter.match({
  "location": "CouponValidationStepDefin.verify_the_error_discount_is_generated()"
});
formatter.result({
  "duration": 167491406,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefinition.close_browser()"
});
formatter.result({
  "duration": 2129547348,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into Application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validating login",
  "description": "",
  "id": "login-into-application;validating-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify user is logged in or error message displays",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-into-application;validating-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-into-application;validating-login;;1"
    },
    {
      "cells": [
        "monicalauraburns@yahoo.com",
        "test123"
      ],
      "line": 13,
      "id": "login-into-application;validating-login;;2"
    },
    {
      "cells": [
        "monicalauraburns@yahoo.com",
        "wrongpass"
      ],
      "line": 14,
      "id": "login-into-application;validating-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Validating login",
  "description": "",
  "id": "login-into-application;validating-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters monicalauraburns@yahoo.com and test123 and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify user is logged in or error message displays",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralStepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 3970576186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.guru99.com",
      "offset": 13
    }
  ],
  "location": "GeneralStepDefinition.navigate_to(String)"
});
formatter.result({
  "duration": 9687611546,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monicalauraburns@yahoo.com",
      "offset": 12
    },
    {
      "val": "test123",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_and_and_logs_in(String,String)"
});
formatter.result({
  "duration": 7013691277,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_that_user_is_logged_in()"
});
formatter.result({
  "duration": 35653365,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefinition.close_browser()"
});
formatter.result({
  "duration": 2011023274,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validating login",
  "description": "",
  "id": "login-into-application;validating-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"http://live.guru99.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters monicalauraburns@yahoo.com and wrongpass and logs in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify user is logged in or error message displays",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GeneralStepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 5316256271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://live.guru99.com",
      "offset": 13
    }
  ],
  "location": "GeneralStepDefinition.navigate_to(String)"
});
formatter.result({
  "duration": 13467963832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monicalauraburns@yahoo.com",
      "offset": 12
    },
    {
      "val": "wrongpass",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_and_and_logs_in(String,String)"
});
formatter.result({
  "duration": 4674409665,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_that_user_is_logged_in()"
});
formatter.result({
  "duration": 217911932,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefinition.close_browser()"
});
formatter.result({
  "duration": 1844492507,
  "status": "passed"
});
});