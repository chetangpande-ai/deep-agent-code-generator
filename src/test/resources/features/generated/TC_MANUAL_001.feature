@TC_MANUAL_001
Feature: Validate invalid coupon during checkout

  Scenario: Validate invalid coupon during checkout
    Given Log in as a valid customer.
    Then Customer lands on the account home page.
    When Navigate to checkout and apply an invalid coupon.
    Then Invalid coupon error is displayed.
    When Submit checkout.
    Then Order is not submitted.
