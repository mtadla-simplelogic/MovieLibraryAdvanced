# Zadanie 1 (zad 2 jest niżej)

Propozycja rozwinięcia zadania w pracy domowej projektu 'MovieLibraryAdvanced'

Wyświetl w kosoli poniższe menu programu:

  1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami
  2. Wyświetl wszystkie informacje o losowym filmie
  3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał

Następwnie użytkownik podaje wybranu numer, pobierz go używając klasy Scanner. Zaimplementuj kod, który obsłuży wybrane przez użytkownika opcje.


Komentarz do opcji 2: Wyświetlenie wszystkich informacji o filmie rozumiem jako wypisanie ich np. w takim formacie:

   - title: The Shawshank Redemption

   - director: Frank Darabont

   - genre: drama

   - date: 1994

   - actors: Tim Robbins, Morgan Freeman, Bob Gunton


Powyższy efekt powinien być uzyskany poprzez nadpisania metody toString() w klasach typu Movie, Actor itd..


https://www.baeldung.com/java-tostring


# Zadanie 2

To zadanie najlepiej zrobić w osobnym projekcie.

Program "Lista płac:"

Stwórz klasę Employee przechowującą:
- pole imię
- pole nazwisko 
- pole kwotę wypłaty pracownika

- metodę: getAllData(), która zwróci tekst w formacie „Salary for IMIE NAZWISKO is WYPLATA” (dla chętnych zamiast getAllData zrobić @Override toString())

Stwórz klasę Company z:
- polem: lista pracowników (ArrayList<Employee>)
- metodą: addEmployee(), która doda nowego employee do listy
- metodą: printEmployees(), która uruchomi na każdym userze metodę getAllData() i wydrukuje zawartość
- metodą: getSum(), która uruchomi zwróci sumę zarobków pracowników
- metodą: getAvr(), która uruchomi zwróci średnią zarobków pracowników


Pamiętaj, aby wszystkie pola w klasach były prywatne i stworzyć w nich getter/settery, oraz wymagane kostruktowy.

W klasie Main i metodzie main() stwórz 5 obiektów klasy Employee (dla każdego imię, nazwisko i wysokość zarobków). Dodaj je do listy przechowywanej w klasie Company


Następnie kod powinien wypisać do konsoli:
- sumę oraz średnią zaroków wszystkich pracowników
- dane wszystkich przecowaników (imiona, nazwiska, płace)
