package unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitConverterTest {

  // 1英尺foot 应该等于 12英寸inch
  // 1码yard 应该等于 3英尺foot
  // 1码yard 应该等于 36英寸inch
  // 1磅（pound）= 16 盎司（ounce）
  @Test
  void UnitConverter_Foot_Inch() {
    UnitConverter converter = new UnitConverter();
    Unit result = converter.conver(new Foot(1), new Inch(1));
    assertEquals(12, result.amount);
    result = converter.conver(new Foot(10), new Inch(1));
    assertEquals(120, result.amount);
  }

  @Test
  void UnitConverter_Yard_Inch() {
    UnitConverter converter = new UnitConverter();
    Unit result = converter.conver(new Yard(1), new Inch(1));
    assertEquals(36, result.amount);
    result = converter.conver(new Yard(10), new Inch(1));
    assertEquals(360, result.amount);
  }

  @Test
  void UnitConverter_Yard_Foot() {
    UnitConverter converter = new UnitConverter();
    Unit result = converter.conver(new Yard(1), new Foot(1));
    assertEquals(3, result.amount);
    result = converter.conver(new Yard(10), new Foot(1));
    assertEquals(30, result.amount);
  }

  @Test
  void UnitConverter_Pound_Ounce() {
    UnitConverter converter = new UnitConverter();
    Unit result = converter.conver(new Pound(1), new Ounce(1));
    assertEquals(16, result.amount);
    result = converter.conver(new Pound(10), new Ounce(1));
    assertEquals(160, result.amount);
  }
}
