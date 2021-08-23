package utils.lab3.infra;

import homework.lab3.heroes.Elf;
import homework.lab3.heroes.Hero;

/**
 * @author Evgeny Borisov
 */
public class ElfCreator implements HeroCreator {
    @Override
    public Hero create() {
        return new Elf();
    }
}
