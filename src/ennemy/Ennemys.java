package ennemy;
    public class Ennemys {
        private String nameEnnemy;
        private int pointOfLife ;

        private int pointOfAttack ;

        /*_________________________________________________Getter_Setter_____________________________________________________*/

        /*---------nameEnnemy----------*/
        public String getNameEnnemy() {
            return nameEnnemy;
        }

        public void setNameEnnemy(String nameEnnemy) {
            this.nameEnnemy = nameEnnemy;
        }
        /*---------PointOfLife----------*/
        public int getPointOfLife() {
            return pointOfLife;
        }

        public void setPointOfLife(int pointOfLife) {
            this.pointOfLife = pointOfLife;
        }

        /*---------PointOfAttack----------*/
        public int getPointOfAttack() {
            return pointOfAttack;
        }

        public void setPointOfAttack(int pointOfAttack) {
            this.pointOfAttack = pointOfAttack;
        }
    }