---

# ChessClash

A simple Object-Oriented Programming (OOP)-based implementation of a classic Chess game in Java.

## 📜 Overview
This project implements a basic console-based chess game, focusing on clear object-oriented design principles like **encapsulation**, **inheritance**, **polymorphism**, and **abstraction**. Each chess piece (Pawn, Rook, Knight, Bishop, Queen, King) is represented as a class with piece-specific movement logic.

The game allows two players to move pieces alternately, following standard chess rules (basic moves; no en passant, castling, or promotion yet).

---

## 🛠️ Features
- Full chess board setup
- Move validation according to piece movement rules
- Turn-based gameplay (White vs Black)
- Console-based board display
- Object-oriented structure for easy extension

---

## 🧩 Project Structure
```
ChessGame/
│
├── Board.java        # Manages the chess board and piece movements
├── Game.java         # Handles the flow of the game
├── Piece.java        # Abstract class for all chess pieces
├── Pawn.java         # Pawn-specific movement logic
├── Rook.java         # Rook-specific movement logic
├── Knight.java       # Knight-specific movement logic
├── Bishop.java       # Bishop-specific movement logic
├── Queen.java        # Queen-specific movement logic
├── King.java         # King-specific movement logic
└── Main.java         # Entry point to start the game
```

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or higher
- A code editor or IDE like IntelliJ IDEA or Eclipse.

### Running the Game
1. Clone the repository:
   ```bash
   git clone https://github.com/pnpduy/ChessGame.git
   ```
2. Navigate into the project folder:
   ```bash
   cd ChessGame
   ```
3. Compile the code:
   ```bash
   javac *.java
   ```
4. Run the game:
   ```bash
   java Main
   ```

---

## 📸 Example Output

```
    a  b  c  d  e  f  g  h
 8 [r][n][b][q][k][b][n][r] 8
 7 [p][p][p][p][p][p][p][p] 7
 6 [ ][ ][ ][ ][ ][ ][ ][ ] 6
 5 [ ][ ][ ][ ][ ][ ][ ][ ] 5
 4 [ ][ ][ ][ ][ ][ ][ ][ ] 4
 3 [ ][ ][ ][ ][ ][ ][ ][ ] 3
 2 [P][P][P][P][P][P][P][P] 2
 1 [R][N][B][Q][K][B][N][R] 1
    a  b  c  d  e  f  g  h

White's Move: e2 e4
```

---

## 📚 OOP Concepts Used
- **Encapsulation**: Piece properties are bundled with movement logic.
- **Inheritance**: All chess pieces extend from a common `Piece` class.
- **Polymorphism**: Each piece has a specific implementation of the `canMove()` method.
- **Abstraction**: `Piece` defines an abstract base for all chess pieces.

---
## 🎥 Video Recording
Here's a video demo of our project:  
➡️ [Watch Demo - ChessClash.mp4](ChessClash.mp4)


---
## 📈 Future Improvements
- Implement special moves (castling, en passant, pawn promotion)
- Add check and checkmate detection
- Add game-saving and loading functionality
- Build a simple GUI version with JavaFX or Swing

---

## 🤝 Contributors
- Raja Hasini
- Sahasra Kunku
- Suhani Thakur
- Muppidi Hansika Reddy
- Vennela Varshini Anasoori
- Harshitha Patel
- Sindhuja Pagadala

---

