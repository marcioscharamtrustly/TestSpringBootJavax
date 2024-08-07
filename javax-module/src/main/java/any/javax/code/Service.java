package any.javax.code;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Service {
    private final Repository oneRepository;
    private final Repository twoRepository;

    @Inject
    public Service(@Named("ONE") Repository oneRepository,
                   @Named("TWO") Repository twoRepository) {
        this.oneRepository = oneRepository;
        this.twoRepository = twoRepository;
    }

    public int sum() {
        return oneRepository.getInt() + twoRepository.getInt();
    }
}
