package unit;

import java.util.HashMap;
import java.util.Map;

public class UnitConverter {

  private static final Map<String, Integer> ratios = new HashMap<String, Integer>();

  public UnitConverter() {
    ratios.put("Foot-Inch", 12);
    ratios.put("Yard-Inch", 36);
    ratios.put("Yard-Foot", 3);
    ratios.put("Pound-Ounce", 16);
  }

  public Unit conver(Unit fromUnit, Unit toUnit) {
    Integer ratio = ratios.get(fromUnit.getClass().getSimpleName() + "-" + toUnit.getClass().getSimpleName());
    if (null != ratio) {
      return new Inch(fromUnit.amount * ratio);
    }
    return null;
  }
}
