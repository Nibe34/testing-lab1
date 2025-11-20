# README — Code Review Remarks


### 1. Class names do not follow Java conventions
`humanIMB` should be renamed to `BmiCalculator` or similar using PascalCase.

### 2. Two classes placed in the same file
Each class should be in its own file for clarity and standard project structure.

### 3. Public fields break encapsulation
`W` and `H` should be private with getters/setters to prevent invalid external changes.

### 4. `imb` should not be static
BMI is tied to a specific object, so sharing it across all instances is incorrect.

### 5. Repeated BMI calculation logic
The formula `W / (H * H)` is duplicated; it should be extracted into one method.

### 6. Incorrect use of `&` instead of `&&`
Logical conditions should use `&&` for clarity and correctness.

### 7. Category selection uses multiple separate `if`s
Must be rewritten to `if / else if` to avoid overlapping conditions.

### 8. Getters and setters use non-standard names
`takeW` / `putW` should be replaced with `getWeight` / `setWeight`.

### 9. Poor method naming
`Result()` should be renamed to something clearer like `getCategory()`.

### 10. No validation for weight or height
Zero or negative values should be rejected to prevent incorrect BMI or division by zero.

---
