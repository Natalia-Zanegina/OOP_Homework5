package Homework5;

import Homework5.models.TableModel;
import Homework5.presenters.BookingPresenter;
import Homework5.presenters.Model;
import Homework5.presenters.View;
import Homework5.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable(). Работаем за фреймворки.
        bookingView.reservationTable(new Date(), 1103, "Станислав");
        bookingView.reservationTable(new Date(), 102, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 103, "Станислав");

    }
}
