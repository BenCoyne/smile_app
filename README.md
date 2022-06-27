## Smile_App 

Your task today is to connect your source code repository to GitHub Actions and create a CI pipeline.

We want to accomplish 3 things:

We want to create a NEW SPRINGBOOT PROJECT FROM SCRATCH. Add a Controller called SmileController, an Entity called Smile and a repository called SmileRepository. The smile controller should return a Smile which has the fields

id: Long isCrying: Boolean isLaughing: Boolean

Make sure to write a few simple tests for your new simple application.

We want to push this new codebase to GitHub
We want to check that all our tests are passing before we are able to merge a pull request into the main branch by creating a GitHub action
We want to check that there are no code style errors using super linter
Minor change