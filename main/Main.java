package main;

import java.util.Scanner;

import view.ConsoleNotebookView;
import view.NotebookView;
import presenter.NotebookPresenter;
import model.Notebook;


public class Main {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(model, view);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить заметку");
            System.out.println("2. Показать заметки за день");
            System.out.println("3. Показать заметки за неделю");
            System.out.println("4. Сохранить заметки в файл");
            System.out.println("5. Загрузить заметки из файла");
            System.out.println("6. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    presenter.addNote();
                    break;
                case 2:
                    presenter.showNotesForDay();
                    break;
                case 3:
                    presenter.showNotesForWeek();
                    break;
                case 4:
                    presenter.saveNotes();
                    break;
                case 5:
                    presenter.loadNotes();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Нет такой команды");
            }
        }
    }
}
