package personnage.user;

import personnage.Personnage;

public class Magicien extends Personnage {
    String sort;
    String filtre;

    public Magicien() {
        this("TOOT");
    }

    public Magicien(String name) {
        this(name, "", 3, 8);
    }

    public Magicien(String name, String img, int lifePoint, int attackForce) {
        setName(name);
        setLifePoint(lifePoint);
        setAttackForce(attackForce);
        setLifeMax(6);
        setAttackMax(15);
        sort = "" ;
        filtre = "Filtre de Guérison";

        System.out.println("""
                                                  ....
                                                .'' .'''
                .                             .'   :
                \\\\                          .:    :
                 \\\\                        _:    :       ..----.._
                  \\\\                    .:::.....:::.. .'         ''.
                   \\\\                 .'  #-. .-######'     #        '.
                    \\\\                 '.##'/ ' ################       :
                     \\\\                  #####################         :
                      \\\\               ..##.-.#### .''''###'.._        :
                       \\\\             :--:########:            '.    .' :
                        \\\\..__...--.. :--:#######.'   '.         '.     :
                        :     :  : : '':'-:'':'::        .         '.  .'
                        '---'''..: :    ':    '..'''.      '.        :'
                           \\\\  :: : :     '      ''''''.     '.      .:
                            \\\\ ::  : :     '            '.      '      :
                             \\\\::   : :           ....' ..:       '     '.
                              \\\\::  : :    .....####\\\\ .~~.:.             :
                               \\\\':.:.:.:'#########.===. ~ |.'-.   . '''.. :
                                \\\\    .'  ########## \\ \\ _.' '. '-.       '''.
                                :\\\\  :     ########   \\ \\      '.  '-.        :
                               :  \\\\'    '   #### :    \\ \\      :.    '-.      :
                              :  .'\\\\   :'  :     :     \\ \\       :      '-.    :
                             : .'  .\\\\  '  :      :     :\\ \\       :        '.   :
                             ::   :  \\\\'  :.      :     : \\ \\      :          '. :
                             ::. :    \\\\  : :      :    ;  \\ \\     :           '.:
                              : ':    '\\\\ :  :     :     :  \\:\\     :        ..'
                                 :    ' \\\\ :        :     ;  \\|      :   .'''
                                 '.   '  \\\\:                         :.''
                                  .:..... \\\\:       :            ..''
                                 '._____|'.\\\\......'''''''.:..'''
                                            \\\\
                """);
        String toString = toString();
        System.out.println(toString);
    }

    public void combattre(Personnage ennemy) {
        super.combattre(ennemy);
    }


        /*____________________________________________________________________________________________________________________*/

    public String toString() {
        return "Nom : " + getName()+ ", Class : "+ getClass().getSimpleName() + ", Point de Vie : " + getLifePoint() + ", Puissance d'Attaque " + getAttackForce();
    }
}/*"Votre personnage est un " + this.getClass().getSimpleName() + ", vous l'aves nommé " + this.getName() +
        ", il possède " + this.getLifePoint() + " point de vie, " +
        " il a une puissance d'attaque de " + this.getAttackForce() +
        ", Actuellement vous n'avez pas de sort, ni de filtre. ";*/