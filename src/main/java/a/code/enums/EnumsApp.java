package a.code.enums;

public class EnumsApp {

  public static void main(String[] args) {
    // 1. enum just a type
    Day mon = Day.Monday;
    Day sat = Day.Saturday;

    // 2. each enum can be converted to string
    String day = Day.Monday.name(); // "Monday"
  }

  // 3.1. can be used in if/switch statement
  public void calc(Day day) {
    switch (day) {
      case Friday: ;
      case Monday: ;
      default: ;
    }
  }

  // 3.2. can be used in if/switch statement
  void orderProcess(OrderStatus status) {
    switch (status) {
      case Placed: ;
      case InProcess: ;
        // ...
    }
  }

  // 3.2. can be used in if/switch statement
  void orderCancel(OrderStatus st) {
    if (st != OrderStatus.Placed) {
      throw new IllegalArgumentException("no way to cancel order on the way");
    }
    // code
  }

}
