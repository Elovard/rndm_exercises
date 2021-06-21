package by.itechartgroup.exercises.task47;

import java.util.List;

public interface ISaveable {

    List<String> write();

    boolean read(List<String> savedValues);

}
