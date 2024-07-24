import random

class Card:
    def __init__(self, suit, value):
        self.suit = suit
        self.value = value

    def valueOf(self):
        if self.value == "A":
            return 11
        elif self.value == "K" or self.value == "Q" or self.value == "J":
            return 10
        else:
            return self.value

    def __str__(self):
        return f"{self.value}{self.suit}"

    def __repr__(self):
        return self.__str__()

def main():
    deck = []

    a_card = Card("H", 10)
    print(a_card)

    for suit in ["H", "D", "C", "S"]:
        for value in range(2, 11):
            deck.append(Card(suit, value))
        for value in ["J", "Q", "K", "A"]:
            deck.append(Card(suit, value))

    random.shuffle(deck)
    print(deck)

main()
