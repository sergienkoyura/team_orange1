**Test Case for Registered Users, Login:**

**Description:**

- Testing the ability to log in to the website for users with active accounts.

**Preconditions:**

- The website is accessible and functioning correctly.
- The user has an active account on the website.

**Test Steps:**

**Open the website.**

- Click the "Login" button on the homepage.
- Enter your username and password.
- Click "Log In."

**Expected Results:**

1) After clicking "Log In," the user should successfully log in and be redirected to their account page.

2) On the account page, the user should see their name and account information.

**Test Case for Immediate Password Change by Username:**

**Description:**

*Testing the ability to change the password immediately after providing the username without email verification.*

**Preconditions:**

- The website is accessible and functioning correctly.
- The user has an account on the website but wants to change their password using their username.

**Test Steps:**

- Open the website.
- Click the "Forgot Password" or "Reset Password" link on the login page.
- Select the "Change Password by Username" or similar option.
- Enter the registered username in the provided field.
- Enter the new password in the "New Password" field.
- Confirm the new password in the "Confirm Password" field.
- Click "Submit" or "Change Password."
  
**Expected Results:**

*After clicking "Submit" or "Change Password," the password should be immediately updated for the provided username.*

1. The user should receive an on-screen confirmation that the password has been changed successfully.
2. The user should now be able to log in using the new password.

**Test Case for Unregistered Users Login:**

**Description:**

*Testing the ability to log in to the website for users without active accounts.*

**Preconditions:**

- The website is accessible and functioning correctly.
- The user does not have an active account on the website.

**Test Steps:**

- Open the website.
- Click the "Login" button on the homepage.
- Enter a random username and password.
- Click "Log In."

**Expected Results:**

*After clicking "Log In," the user should see a message indicating a failed login or be redirected to the registration page.*
