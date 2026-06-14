@TC_API_001
Feature: Create order API rejects invalid coupon

  Scenario: Create order API rejects invalid coupon
    Given Submit create order API request with invalid coupon.
    Then API returns invalid coupon error.
