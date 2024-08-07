package any.javax.code;

import javax.inject.Named;

@Named("ONE")
public class OneRepository implements Repository{
    @Override
    public int getInt() {
        return 1;
    }
}
