package any.javax.code;

import javax.inject.Named;

@Named("TWO")
public class TwoRepository implements Repository{
    @Override
    public int getInt() {
        return 2;
    }
}
