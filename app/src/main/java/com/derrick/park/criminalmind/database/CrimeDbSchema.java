package com.derrick.park.criminalmind.database;

/**
 * Created by kaorihirata on 2017-07-06.
 */
// CREATE CLASS INSIDE CLASS BECAUSE IT WILL BE ACCESS LIKE 'CrimeDbSchema.CrimeTable.Cols'
public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes";
        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
