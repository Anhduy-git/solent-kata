#  Kata Java - La tondeuse

La société MowItNow a décidé de développer une tondeuse à gazon automatique,
destinée aux surfaces rectangulaires.
La tondeuse peut être programmée pour parcourir l'intégralité de la surface. La
position de la tondeuse est représentée par une combinaison de coordonnées (x,y)
et d'une lettre indiquant l'orientation selon la notation cardinale anglaise (N,E,W,S).
La pelouse est divisée en grille pour simplifier la navigation.
Par exemple, la position de la tondeuse peut être « 0, 0, N », ce qui signifie qu'elle
se situe dans le coin inférieur gauche de la pelouse, et orientée vers le nord.
Pour contrôler la tondeuse, on lui envoie une séquence simple de lettres. Les lettres
possibles sont « D », « G » et « A ». « D » et « G » font pivoter la tondeuse de 90° à
droite ou à gauche respectivement, sans la déplacer. « A » signifie que l'on avance
la tondeuse d'une case dans la direction à laquelle elle fait face, et sans modifier son
orientation.
Si la position après mouvement est en dehors de la pelouse, la tondeuse ne bouge
pas, conserve son orientation et traite la commande suivante.
On présuppose que la case directement au nord de la position (x, y) a pour
coordonnées (x, y+1).
Pour programmer la tondeuse, on lui fournit un fichier d'entrée construit comme
suit :
• La première ligne correspond aux coordonnées du coin supérieur droit de la
pelouse, celles du coin inférieur gauche sont supposées être (0,0)
• La suite du fichier permet de piloter toutes les tondeuses qui ont été
déployées. Chaque tondeuse a deux lignes la concernant :
o la première ligne donne la position initiale de la tondeuse, ainsi que son
orientation. La position et l'orientation sont fournies sous la forme de
2 chiffres et d’une lettre, séparés par un espace.o la seconde ligne est une série d'instructions ordonnant à la tondeuse
d'explorer la pelouse. Les instructions sont une suite de caractères sans
espaces.
Chaque tondeuse se déplace de façon séquentielle, ce qui signifie que la seconde
tondeuse ne bouge que lorsque la première a exécuté intégralement sa série
d'instructions.
Lorsqu'une tondeuse achève une série d'instructions, elle communique sa position
et son orientation.

## 🛠 Requirements

- **Java version:** 21
- **Build tool:** Maven

---

## 🛠 Requirements

- **Java version**: 21
- **Build tool**: Maven

---

## 🚀 How to Run the Program

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Anhduy-git/solent-kata.git
   cd solent-kata
   ```

2. **Compile and package the project**:
   ```bash
   mvn clean package
   ```

3. **Prepare the input file**:

   Create a file named `input.txt` in `src/main/resources/`. Example content:
   ```
   5 5
   1 2 N
   GAGAGAGAA
   3 3 E
   AADAADADDA
   ```

    - `5 5` is the upper-right corner of the lawn (the lower-left is implicitly `0 0`)
    - Each mower is described by two lines:
        - Initial position and orientation (e.g., `1 2 N`)
        - A sequence of movement instructions (e.g., `GAGAGAGAA`)

4. **Run the application**:

   You can run it directly in IntelliJ or via this Java command:
   ```bash
    java -cp target/classes org.tondeuse.Main
   ```

---

## ✅ Expected Output

The console should display the final positions and orientations of each mower (for the input above):

```
1 3 N 5 1 E
```

---

## ✅ Run Tests

To execute the unit tests:
```bash
mvn test
```