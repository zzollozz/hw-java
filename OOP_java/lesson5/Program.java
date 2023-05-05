package OOP_java.lesson5;

import OOP_java.lesson5.models.Table;
import OOP_java.lesson5.models.TableModel;
import OOP_java.lesson5.presenters.BookingPresenter;
import OOP_java.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 2, "Иван");
        bookingView.reservationTable(new Date(), 5, "Ирина");

        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
    }

}