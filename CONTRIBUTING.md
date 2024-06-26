### Forking the Repository

1. **Log in to GitHub**:
   - Go to [GitHub](https://github.com/) and log in to your personal account.

2. **Navigate to the Repository**:
   - Go to the repository: [trustlreis/candidate-test-stub-maven](https://github.com/trustlreis/candidate-test-stub-maven).

3. **Fork the Repository**:
   - Click on the "Fork" button at the top-right corner of the repository page. This will create a copy of the repository under your GitHub account.

### Cloning the Forked Repository

4. **Clone the Repository to Your Local Machine**:
   - Open a terminal on your computer.
   - Clone the forked repository using the `git clone` command. Replace `YOUR-USERNAME` with your GitHub username.
     ```sh
     git clone https://github.com/YOUR-USERNAME/candidate-test-stub-maven.git
     ```
   - Navigate to the cloned repository directory:
     ```sh
     cd candidate-test-stub-maven
     ```

### Making Changes

5. **Create a New Branch**:
   - It's a good practice to create a new branch for your changes. Replace `BRANCH-NAME` with a descriptive name for your branch.
     ```sh
     git checkout -b BRANCH-NAME
     ```

6. **Make Your Changes**:
   - Open the files you need to change in your preferred text editor and make your changes.
   - Save the files after making changes.

### Committing and Pushing Changes

7. **Commit Your Changes**:
   - Stage the changes you made:
     ```sh
     git add .
     ```
   - Commit the changes with a descriptive commit message:
     ```sh
     git commit -m "Description of the changes"
     ```

8. **Push the Changes to Your Fork**:
   - Push your changes to the new branch on your forked repository:
     ```sh
     git push origin BRANCH-NAME
     ```

### Creating a Pull Request

9. **Create a Pull Request**:
   - Go to the original repository: [trustlreis/candidate-test-stub-maven](https://github.com/trustlreis/candidate-test-stub-maven).
   - Click on the "Pull Requests" tab.
   - Click on the "New Pull Request" button.
   - Click on the "compare across forks" link.
   - Select your forked repository and branch from the dropdown menus.
   - Click on the "Create pull request" button.
   - Add a title and description for your pull request explaining what changes you made and why.
   - Click on the "Create pull request" button again to submit it.

### Summary

1. **Fork the repository**: Click the "Fork" button on the repository page.
2. **Clone the repository**: Use `git clone` to clone your fork locally.
3. **Create a new branch**: Use `git checkout -b BRANCH-NAME`.
4. **Make changes**: Edit files and save your changes.
5. **Commit changes**: Stage with `git add .` and commit with `git commit -m "Description of the changes"`.
6. **Push changes**: Push your branch with `git push origin BRANCH-NAME`.
7. **Submit pull request**: Go to the original repository, create a new pull request, and fill in the details.

Once the PR is created, your code will be analyzed by our team.