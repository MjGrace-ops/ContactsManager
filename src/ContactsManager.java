public class ContactsManager {

        // Attributs
        Contact[] myFriends;
        int friendsCount;

        // Constructeur
        ContactsManager() {
                this.friendsCount = 0;
                this.myFriends = new Contact[500];
        }

        /**
         * Ajoute un contact dans le tableau
         * @param contact le contact a ajouter dans le tableau
         */
        void addContact(Contact contact) {

                myFriends[friendsCount] = contact;
                friendsCount++;
        }



        /**
         * Recherche un contact par son nom
         * @param searchName le com recherché
         * @return le contact correspondant sinon renvoie null
         */
        Contact searchContact(String searchName) {

                for (int i = 0; i < friendsCount; i++) {

                        if (myFriends[i].name.equals(searchName)) {
                                return myFriends[i];
                        }
                }

                return null;
        }
}