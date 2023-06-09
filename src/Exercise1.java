import java.util.List;

public class Exercise1 {
    public static String formatNames(List<String> names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if(i % 2 == 0) {
                int index = i + 1;
                String name = names.get(i);
                stringBuilder.append(index).append(".").append(name);
                if(i < names.size() - 1) {
                    stringBuilder.append(", ");
                } else if(i == names.size() - 1) {
                    stringBuilder.append(". ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
